package integration;


import MyException.*;
import analyser.Parser;
import ctrl.Ctrl;
import ctrl.iCtrl;
import model.PrgState;
import model.adt.*;
import model.stmt.IStmt;
import model.stmt.NopStmt;
import model.values.IntValue;
import model.values.StringValue;
import model.values.Value;
import org.junit.Test;
import repo.Repo;
import repo.iRepo;

import java.io.BufferedReader;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class Big_Bang_Integration {

    @Test
    public void tc_goto_inside_while() throws Exception {

        IStmt ex = (IStmt) Parser.parse("files/goto_inside_while.txt");
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
        iRepo repo=new Repo(list,"log1.txt");
        iCtrl ctrl=new Ctrl(repo);
        ctrl.allStep();

        ArrayList<Value> expected = new ArrayList<Value>(Arrays.asList(new IntValue(6), new StringValue(" ") , new IntValue(10), new StringValue(" " ), new IntValue(15), new StringValue(" ") , new IntValue(21), new StringValue(" ") , new StringValue("\n"),
                new IntValue(10), new StringValue(" ") , new IntValue(15), new StringValue(" " ), new IntValue(21), new StringValue(" ") , new IntValue(28), new StringValue(" ") , new StringValue("\n"),
                new IntValue(15), new StringValue(" ") , new IntValue(21), new StringValue(" " ), new IntValue(28), new StringValue(" ") , new IntValue(36), new StringValue(" ") , new StringValue("\n")
                ));

        assertEquals(expected, out.getList());

    }

    @Test
    public void tc_goto_outside_while() throws Exception {

        IStmt ex = (IStmt) Parser.parse("files/goto_outside_while.txt");
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
        iRepo repo=new Repo(list,"log2.txt");
        iCtrl ctrl=new Ctrl(repo);
        ctrl.allStep();

        ArrayList<Value> expected = new ArrayList<Value>(Arrays.asList(new StringValue("before while"), new IntValue(3), new StringValue(" ") , new IntValue(6), new StringValue(" ") , new IntValue(10), new StringValue(" ") , new IntValue(15), new StringValue(" ") ,new StringValue("\n"),
                new StringValue("before while"), new IntValue(6), new StringValue(" ") , new IntValue(10), new StringValue(" " ), new IntValue(15), new StringValue(" ") , new IntValue(21), new StringValue(" ") , new StringValue("\n"),
                new StringValue("before while"), new IntValue(10), new StringValue(" ") , new IntValue(15), new StringValue(" " ), new IntValue(21), new StringValue(" ") , new IntValue(28), new StringValue(" ") , new StringValue("\n"),
                new StringValue("before while"), new IntValue(15), new StringValue(" ") , new IntValue(21), new StringValue(" " ), new IntValue(28), new StringValue(" ") , new IntValue(36), new StringValue(" ") , new StringValue("\n"),
                new StringValue("before while") ));

        assertEquals(expected, out.getList());
    }


    @Test
    public void tc_goto_inside_if() throws Exception {

        IStmt ex = (IStmt) Parser.parse("files/goto_inside_if.txt");
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
        iRepo repo=new Repo(list,"log3.txt");
        iCtrl ctrl=new Ctrl(repo);
        ctrl.allStep();


        ArrayList<Value> expected = new ArrayList<Value>(Arrays.asList(new StringValue("3rd if"),new StringValue("2nd if"),new StringValue("1st if"),new IntValue(1),new IntValue(0) ));

        assertEquals(expected, out.getList());

    }


    @Test
    public void tc_goto_outside_if() throws Exception {

        IStmt ex = (IStmt) Parser.parse("files/goto_outside_if.txt");
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
        iRepo repo=new Repo(list,"log4.txt");
        iCtrl ctrl=new Ctrl(repo);
        ctrl.allStep();

        ArrayList<Value> expected = new ArrayList<Value>(Arrays.asList(new IntValue(3), new IntValue(1) ));


        assertEquals(expected, out.getList());

    }

    @Test
    public void tc_goto_inside_for() throws Exception {

        IStmt ex = (IStmt) Parser.parse("files/goto_inside_for.txt");
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
        iRepo repo=new Repo(list,"log5.txt");
        iCtrl ctrl=new Ctrl(repo);
        ctrl.allStep();

        ArrayList<Value> expected = new ArrayList<Value>(Arrays.asList(new StringValue("\n"),new IntValue(6), new StringValue(" ") , new IntValue(24), new StringValue(" "), new IntValue(120), new StringValue(" ") , new StringValue("\n"),
                new IntValue(24), new StringValue(" "), new IntValue(120), new StringValue(" ") , new IntValue(720), new StringValue(" ") ,new StringValue("\n"),
                new IntValue(120), new StringValue(" ") , new IntValue(720), new StringValue(" ") ,new IntValue(5040), new StringValue(" " ), new StringValue("\n"),
                new IntValue(720), new StringValue(" ") ,new IntValue(5040), new StringValue(" " ), new IntValue(40320), new StringValue(" ") ,new StringValue("\n")
                ));

        assertEquals(expected, out.getList());

    }


    @Test
    public void tc_goto_outside_for() throws Exception {

        IStmt ex = (IStmt) Parser.parse("files/goto_outside_for.txt");
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
        iRepo repo=new Repo(list,"log6.txt");
        iCtrl ctrl=new Ctrl(repo);
        ctrl.allStep();

        ArrayList<Value> expected = new ArrayList<Value>(Arrays.asList(new StringValue("before for") , new IntValue(1), new StringValue(" ") ,new IntValue(1), new StringValue(" ") , new IntValue(2), new StringValue(" " ), new IntValue(6), new StringValue(" ") , new IntValue(24), new StringValue(" "), new StringValue("\n")
                ));


        assertEquals(expected, out.getList());

    }


}