package model.stmt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import MyException.*;
import model.*;
import model.adt.*;
import model.exp.Exp;
import model.types.* ;
import model.values.*;

public class readFile implements IStmt{
	 Exp exp;
	 BufferedReader file;
	 String var_name;
	 String line="";
	 int lineNumber;
	 
	 public readFile(Exp e,String v,int _lineNumber) {exp=e;var_name=v;lineNumber=_lineNumber;}
	 public String toString() { return exp.toString();}

	public PrgState execute(PrgState state) throws VarNotDefined, DivByZero, VarIsDefined, CustomException {
		MyIStack<IStmt> stk=state.getStk();
		MyIDictionary<String, Value> symTbl= state.getSymTable();
		MyIHeap hp= state.getHeap();

		Value val = exp.eval(symTbl,hp);
		if( !(val.getType()).equals(new StringType()) )
			throw new VarNotDefined("The var is not a string");
		StringValue val1=(StringValue)val;

		if(!symTbl.isDefined(var_name))
			 throw new VarNotDefined("var_name is not defined");
		 if(!symTbl.lookup(var_name).getType().equals(new StringType()))
			 throw new VarNotDefined("var_name is not a string");

		byte[] data;
		try {
			data = Files.readAllBytes(Paths.get(val1.getVal()));
		} catch (IOException e) {
			//System.out.println("e.toString()\n\n: "+e.toString());
			throw new CustomException(e.toString());
		}

		MyIDictionary<StringValue, Security_Class> sTbl=state.getFileSecurity();
		if(!sTbl.isDefined(val1))
			sTbl.add(val1,Security_Class.SECRET);

		symTbl.update(var_name,new StringValue(new String(data),true,sTbl.lookup(val1)));

		return state;
	}

	public int getStatementNumber(){return 1;}
	public int  getLineNumber(){return lineNumber;}
	public int getEndingLine() {return lineNumber;}
}
