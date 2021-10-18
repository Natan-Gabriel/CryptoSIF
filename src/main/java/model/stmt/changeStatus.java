package model.stmt;

import MyException.CustomException;
import MyException.DivByZero;
import MyException.VarIsDefined;
import MyException.VarNotDefined;
import model.PrgState;
import model.adt.MyIDictionary;
import model.adt.MyIHeap;
import model.adt.MyIStack;
import model.adt.Security_Class;
import model.exp.Exp;
import model.exp.VarExp;
import model.types.BoolType;
import model.types.StringType;
import model.types.Type;
import model.values.BoolValue;
import model.values.StringValue;
import model.values.Value;

import java.io.BufferedReader;

public class changeStatus implements IStmt{
    Exp exp;
    Exp status;
    int lineNumber;
    public changeStatus(Exp e, Exp _status, int _lineNumber){exp=e;lineNumber=_lineNumber;status=_status;}

    public String toString() { return "changeStatus("+exp.toString()+")";}
    public PrgState execute(PrgState state) throws VarNotDefined, DivByZero, VarIsDefined, CustomException {
        MyIStack<IStmt> stk=state.getStk();
        MyIDictionary<String,Value> symTbl= state.getSymTable();
        MyIHeap hp= state.getHeap();
        MyIDictionary<StringValue, BufferedReader> fTbl=state.getFileTable();
        MyIDictionary<StringValue, Security_Class> sTbl=state.getFileSecurity();

        Value status_evaluated = status.eval(symTbl,hp);
        if (!(status_evaluated.getType().equals(new StringType())))
            throw new CustomException("status has to be a string");
        String str = ((StringValue)status_evaluated).getVal();

        // when exp is an identifier
        if(exp instanceof VarExp){
            String identifier = exp.toString();
            if(symTbl.isDefined(identifier)) {
                Value v = symTbl.lookup(identifier);
                if (str.equals("public"))
                    v.setSecurityClass(Security_Class.PUBLIC);
                else
                    v.setSecurityClass(Security_Class.SECRET);
                symTbl.update(identifier, v);
                return state;
            }
        }

        // we will assume now that exp is a file name
        Value val = exp.eval(symTbl,hp);
        Type typId= val.getType();

//        System.out.println("typId: "+typId);
//        System.out.println("val: "+val);
//        System.out.println("exp: "+exp);
        if( !(typId.equals(new StringType())) )
            throw new CustomException("exp is not a file name");

//        StringValue str_val = (StringValue)val;
//        if(symTbl.isDefined(str_val.getVal())){
//            String identifier = str_val.getVal();
//            Value v = symTbl.lookup(identifier);
//            v.setSecret(bool);
//            symTbl.update(identifier,v);
//        }

        if (str.equals("public"))
            sTbl.add((StringValue)val,Security_Class.PUBLIC);
        else
            sTbl.add((StringValue)val,Security_Class.SECRET);

//        sTbl.add((StringValue)val,bool);

        return state;
    }
    public int getStatementNumber(){return 1;}
    public int  getLineNumber(){return lineNumber;}
    public int getEndingLine() {return lineNumber;}




}
