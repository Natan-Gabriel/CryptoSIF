package model.values;
import model.adt.Security_Class;
import model.types.*;

public class BoolValue implements Value{
	boolean val;
	boolean taint=false;
	Security_Class security_class=Security_Class.PUBLIC;
	public BoolValue(boolean v,boolean t,Security_Class s) {val=v;taint=t;security_class=s;}
	public BoolValue(boolean v){val=v;}
	public BoolValue() {val=false;}
	public boolean equals(Object another){
		 if ((another instanceof BoolValue) && ((BoolValue) another).getVal()==val)
			 return true;
		 else
			 return false;
	 }
	public boolean getVal() {return val;}
	public String toString() {return Boolean.toString(val);}
	public Type getType() { return new BoolType();}
	public boolean getTaint(){return  taint;}
	public Security_Class getSecurityClass(){return security_class;}
	public void setSecurityClass(Security_Class s) { security_class=s;}
	public void setTaint(boolean s){ taint=s;}
}
