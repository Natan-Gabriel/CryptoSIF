package model.stmt;
import MyException.CustomException;
import MyException.DivByZero;
import MyException.VarNotDefined;
//import model.MyException;
import model.*;
import model.adt.*;
import model.exp.*;
import model.types.*;
import model.values.Value;
import model.PrgState;

public class PrintStmt implements IStmt{
	 Exp exp;
	 int lineNumber;

	 public PrintStmt(Exp e,int _lineNumber) {exp=e;lineNumber=_lineNumber;}
	 public String toString(){ return "print(" +exp.toString()+")";}
	 public PrgState execute(PrgState state) throws DivByZero, VarNotDefined, CustomException {
		 //try {
		 MyIList<Value> lst=state.getOut();
		 MyIDictionary<String,Value> symTbl= state.getSymTable();
		 MyIHeap hp= state.getHeap();
		 Value val = exp.eval(symTbl,hp);
		 if(val.getSecurityClass()== Security_Class.PUBLIC){
			 lst.add(val);
			 System.out.print(val);
		 }
		 else
		 	throw new CustomException("you cannot print a secret value");

		 return state;

	 }
//	public int getStatementNumber(){return instructionNumber;}
	public int  getLineNumber(){return lineNumber;}
	public int getEndingLine() {return lineNumber;}
	
}
