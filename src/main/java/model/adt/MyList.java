package model.adt;
import java.util.*;

public class MyList<T> implements MyIList<T>{
	ArrayList<T> list;

	public MyList(ArrayList<T> l){list=l;}
	public MyList(){list=new ArrayList<T>();}
	public ArrayList<T> getList(){return list;}
	public String toString() {return list.toString();}
	public void add(T x) {list.add(x);}
	public T  get(int x) {return list.get(x);}
	public boolean  contains(T x) {return list.contains(x);}
	public int  getSize() {return list.size();}
}
