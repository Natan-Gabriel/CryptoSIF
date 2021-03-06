package model;
import model.stmt.*;
import model.adt.*;
import model.values.*;
import model.types.*;
import java.io.*;

public class PrgState{
	 MyIStack<IStmt> exeStack; // kind of sigma
	 MyIStack<IStmt> exeStack_executed;
	 MyIDictionary<Integer,IStmt> exeDictionary;//this is sigma

	 int nextInstruction=1;
	 MyIDictionary<String, Value> symTable; //miu
	 MyIDictionary<String,Pair<Value,Value>> dynaimcSymTable; //miu
	 MyIDictionary<StringValue,BufferedReader> FileTable;
	 MyIDictionary<StringValue,Security_Class> FileSecurity;
	 MyIList<Value> out;
	 MyIHeap heap; //delta
	 IStmt originalProgram; //optional field, but good to have

	@Override
	 public String toString() {return "Execution stack is "+exeStack.toString()+ "Execution dictionary is "+exeDictionary.toString()
			 +"Next instruction is: "+nextInstruction+", Symbol table is "+symTable.toString()+", Out table is"+out.toString()+", Heap is"+heap.toString() + "\n" ;}
	 public PrgState(MyIStack<IStmt> stk,MyIStack<IStmt> _exeStack_executed,MyIDictionary<Integer,IStmt> _exeDictionary, MyIDictionary<String,Value> symtbl,MyIDictionary<String,Pair<Value,Value>> _dynaimcSymTable,MyIList<Value> ot,MyIDictionary<StringValue, BufferedReader >fTbl, MyIHeap heap1,IStmt prg){
		 exeStack=stk;
		 exeStack_executed = _exeStack_executed;
		 exeDictionary = _exeDictionary;
		 symTable=symtbl;
		 dynaimcSymTable=_dynaimcSymTable;
		 out = ot;
		 FileTable=fTbl;
		 heap=heap1;
		 originalProgram=prg;
		 FileSecurity=new MyDictionary<StringValue,Security_Class>();
		 //IStmt originalProgram=(IStmt)Object.clone(prg);
		 //IStmt originalProgram=(IStmt)deepCopy(prg);//recreate the entire original prg
		 stk.push(prg);
	 }
	 public MyIStack<IStmt> getStk() {return exeStack;}
	public MyIStack<IStmt> getStkExecuted() {return exeStack_executed;}
	 public int getNextInstruction(){return  nextInstruction;}
	 public MyIDictionary<String,Value> getSymTable(){return symTable;}

	public MyIDictionary<Integer,IStmt> getExeDictionary() {return exeDictionary;}

	 public MyIList<Value> getOut() {return out;}
	 public MyIDictionary<StringValue, BufferedReader > getFileTable() {return FileTable;}
	 public MyIDictionary<StringValue, Security_Class> getFileSecurity() {return FileSecurity;}

	 public MyIHeap getHeap() {return heap;}
	 public IStmt getOriginalProgram() {return originalProgram;}
	 
	 public void setStk(MyIStack<IStmt> e) {exeStack=e;}
	 public void setStkExecuted(MyIStack<IStmt> e) {exeStack_executed=e;}
	 public void setExeDictionary(MyIDictionary<Integer,IStmt> e) {exeDictionary=e;}
	 public void setNextInstruction(int val){nextInstruction=val;}
	 public void setSymTable(MyIDictionary<String,Value> e){symTable=e;}
	 public void setOut(MyIList<Value> e) {out=e;}
	 public void setFileTable(MyIDictionary<StringValue,BufferedReader> e) {FileTable=e;}
	 public void setFileSecurity(MyIDictionary<StringValue,Security_Class> e) { FileSecurity=e;}
	 public void setHeap(MyIHeap heap1) {heap=heap1;}
	 //.....
	 }
