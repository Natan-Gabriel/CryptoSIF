package view;
import analyser.Parser;
import model.*;
import model.adt.*;
import model.stmt.*;
import model.types.*;
import model.values.*;
import model.exp.*;
import java.util.*;
import java.io.*;
import MyException.*;

import ctrl.*;
import repo.*;

public class main {
	public static void main(String[] arg) {//throws VarNotDefined, DivByZero, VarIsDefined{

	try {
		boolean flag=false;

//		if(arg.length==0){
//			System.out.println("Please input a file name");
//			return;
//		}
//		if(arg.length>=2){
//			flag= Boolean.parseBoolean(arg[1]);
//		}
//
//		IStmt ex = (IStmt) Parser.parse(arg[0]);
//		IStmt ex = (IStmt) Parser.parse("files/tainted_and_untainted_jumps.txt");
//		IStmt ex = (IStmt) Parser.parse("files/leak_secret_data.txt");
		IStmt ex = (IStmt) Parser.parse("files/validation2.txt");
//	s	System.out.println(ex);
//		ex = new CompStmt(new CompStmt(new CompStmt(new CompStmt(new VarDeclStmt("v",new RefType(new IntType()),1),
//				new New("v",new ValueExp(new IntValue(20)),1)),
//				new CompStmt(new VarDeclStmt("a",new RefType(new RefType(new IntType())),1),
//						new New("a",new VarExp("v"),1))),new PrintStmt(new rH(new VarExp("v")),1)),
//				new PrintStmt(new ArithExp('+',new rH(new rH(new VarExp("a"))),new ValueExp(new IntValue(5))),1));

		MyIStack<IStmt> exeStack=new MyStack<IStmt>();
		MyIStack<IStmt> exeStack_executed=new MyStack<IStmt>();
		MyIDictionary<Integer,IStmt> exeDictionary=new MyDictionary<Integer,IStmt>(); //((HashMap<Integer, IStmt>) map);
		MyIDictionary<String, Value> symTable=new MyDictionary<String, Value>();
		MyIDictionary<String,Pair<Value,Value>> dynaimcSymTable=new MyDictionary<String,Pair<Value,Value>>();
		MyIList<Value> out=new MyList<Value>();
		MyIDictionary<StringValue,BufferedReader> fTbl=new MyDictionary<StringValue,BufferedReader>();
		MyIHeap heap=new MyHeap();

		PrgState prg=new PrgState(exeStack,exeStack_executed,exeDictionary,symTable,dynaimcSymTable,out,fTbl,heap,ex);

		ArrayList<PrgState> list = new ArrayList<PrgState>();
		list.add(prg);
		iRepo repo=new Repo(list,"log.txt");
		iCtrl ctrl=new Ctrl(repo,flag);
		long startTime = System.nanoTime();
		ctrl.allStep();
		long endTime = System.nanoTime();
		System.out.println("\ntime elapsed:"+(endTime - startTime)/1000000);

//		System.out.println("IStmt ex:"+ex);
	} catch ( Exception e) {
		System.out.println("Error: "+e);
		//e.printStackTrace();
	}
    
	}
}
