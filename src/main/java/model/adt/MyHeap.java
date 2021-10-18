package model.adt;

import java.util.*;

import model.values.*;

public class MyHeap implements MyIHeap{
	HashMap<Integer,Value> heap;
	int firstFree;
	public MyHeap(HashMap<Integer,Value> d){heap=d;firstFree=1;}
	public MyHeap(){heap=new HashMap<Integer,Value>();firstFree=1;}
	public String toString() {return heap.toString();}
	public int getFirstFree() {return firstFree;}
	public Value add(Value y) {firstFree=firstFree+1;heap.put(firstFree,y);
								System.out.println(heap);
								return new RefValue(firstFree,y.getType());}
	public boolean isDefined(int x) {return heap.containsKey(x);}
	public Value getValue(int x){return heap.get(x);}
	public void update(int x,Value y) {heap.put(x,y);}
	public Map<Integer,Value> getContent(){return heap;}
	public void setContent(Map<Integer,Value> m) {heap=(HashMap<Integer, Value>) m;}

}
