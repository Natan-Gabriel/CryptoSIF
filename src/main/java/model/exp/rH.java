package model.exp;

import MyException.*;
import model.adt.*;
import model.types.*;
import model.values.*;

public class rH implements Exp{
	Exp e;
	//....
	public rH(Exp e1) {e=e1;}
	public  String toString() {return e.toString();}
	public Value eval(MyIDictionary<String,Value> tbl,MyIHeap hp) throws VarNotDefined, DivByZero, CustomException {
		 Value v= e.eval(tbl,hp);
		 if(!(v instanceof RefValue))
			 throw new VarNotDefined("The value is not a RefValue");
		 int a=((RefValue)v).getAddr();
		 if( !(hp.isDefined(a)))
			throw new VarNotDefined("address is not a key in Heap table");
		 Value val = hp.getValue(a);
		 val.setSecurityClass(Security_Class.SECRET);
		 val.setTaint(true);
		 return val;
			 
	}
	public Type getType(MyIDictionary<String,Value> tbl,MyIHeap hp) throws VarNotDefined, DivByZero, CustomException {
		 return eval(tbl,hp).getType();
	 }
}
