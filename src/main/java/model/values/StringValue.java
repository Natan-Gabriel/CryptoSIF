package model.values;

import model.adt.Security_Class;
import model.types.*;

import java.util.Objects;

public class StringValue implements Value{
	String str;
	boolean taint=false;
	Security_Class security_class=Security_Class.PUBLIC;
	public StringValue(String s,boolean _taint,Security_Class _secret) {str=s;taint=_taint;security_class=_secret;}
	public StringValue(String s) {str=s;}
	public StringValue() {str="";}
	public boolean equals(Object another){
		 if ((another instanceof StringValue) && ((StringValue) another).getVal().equals(str) )
			 return true;
		 else
			 return false;
	 }
	@Override
	public int hashCode() {
		return Objects.hash(str);
	}

	public Type getType() {return new StringType();}
	public String getVal() {return str;}
	public String toString() {return str;}
	public boolean getTaint(){return  taint;}
	public Security_Class getSecurityClass(){return security_class;}
	public void setSecurityClass(Security_Class s) { security_class
			=s;}
	public void setTaint(boolean s){ taint=s;}
}
