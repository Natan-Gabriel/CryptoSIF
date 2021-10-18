package model.values;
import model.adt.Security_Class;
import model.types.*;

public class IntValue implements Value{
	int val;
	boolean taint=false;
	Security_Class security_class=Security_Class.PUBLIC;
	public IntValue(int v,boolean t,Security_Class s) {val=v;taint=t;security_class=s;}
	public IntValue(int v) {val=v;}
	public IntValue() {val=0;}
	public boolean equals(Object another){
		 if ((another instanceof IntValue) && ((IntValue) another).getVal()==val)
			 return true;
		 else
			 return false;
	 }
	public Type getType() {return new IntType();}
	public int getVal() {return val;}
	public boolean getTaint(){return  taint;}
	public String toString() {return Integer.toString(val);}
	public Security_Class getSecurityClass(){return security_class;}
	public void setSecurityClass(Security_Class s) { security_class=s;}
	public void setTaint(boolean s){ taint=s;}
}
