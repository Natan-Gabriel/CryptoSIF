package model.values;
import model.adt.Security_Class;
import model.types.*;

public interface Value {
	public Type getType();
	public String toString();
	public boolean getTaint();
	public Security_Class getSecurityClass();
	public void setTaint(boolean s);
	public void setSecurityClass(Security_Class s);
}
