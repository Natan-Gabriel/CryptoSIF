package model.values;
import model.adt.Security_Class;
import model.types.*;

public class RefValue implements Value{
	 int address;
	 Type locationType;
	 Security_Class security_class=Security_Class.PUBLIC;
	 boolean taint=false;
	 public RefValue(int a,Type t) {address=a;locationType=t;}
	 public RefValue() {address=1;locationType=new IntType();}
	 public String toString() {return "("+Integer.toString(address)+","+locationType.toString()+")";}
	 public int getAddr() {return address;}
	 public Type getType() { return new RefType(locationType);}
	 public Type getLocationType() { return locationType;}
	 public boolean getTaint(){return  taint;}
	 public Security_Class getSecurityClass(){return security_class;}
	 public void setSecurityClass(Security_Class s) { security_class=s;}
	 public void setTaint(boolean s){ taint=s;}
	}

