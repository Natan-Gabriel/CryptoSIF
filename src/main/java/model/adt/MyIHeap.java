package model.adt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import model.values.*;

public interface MyIHeap{
	public String toString();
	int getFirstFree();
	public Value add(Value y);
	public boolean isDefined(int x);
	public Value getValue(int x);
	public void update(int x,Value y);
	public Map<Integer,Value> getContent();
	public void setContent(Map<Integer,Value> m);

}
