package model.stmt;

import MyException.*;
import ctrl.Ctrl;
import ctrl.iCtrl;
import model.PrgState;
import model.adt.*;
import model.exp.*;
import model.types.IntType;
import model.values.BoolValue;
import model.values.IntValue;
import model.values.StringValue;
import model.values.Value;
import org.junit.Test;
import repo.Repo;
import repo.iRepo;
import view.Command;
import view.RunExample;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class WhileStmt_BBT {

    @Test
    public void tc_InvalidCondition() throws Exception {

        IStmt ex=new CompStmt(new CompStmt(new VarDeclStmt("x", new IntType(),  1),new WhileStmt(new ValueExp(new IntValue(5)),
                new AssignStmt("x",new ArithExp('+',new VarExp("x"), new
                        ValueExp(new IntValue(1))),1),1,1)),
                new AssignStmt("x",new ArithExp('+',new VarExp("x"), new
                        ValueExp(new IntValue(1))),1) )
                ;
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

        boolean aux=true;
        try {
            ctrl.allStep();
        }
        catch(VarNotDefined e){
            aux=false;
        }
        assertFalse(aux);

    }


    @Test
    public void tc_AllValid() throws Exception {

        IStmt ex=new CompStmt(new VarDeclStmt("x", new IntType(),  1),new WhileStmt(new RelationalExp("<=",new VarExp("x"),new ValueExp(new IntValue(11))),
                new AssignStmt("x",new ArithExp('+',new VarExp("x"), new
                        ValueExp(new IntValue(1))),1),1,1))
                ;
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

        assertEquals(symTable.lookup("x"),new IntValue(12));

    }
}
