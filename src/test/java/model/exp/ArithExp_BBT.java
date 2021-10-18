package model.exp;

import MyException.CustomException;
import MyException.DivByZero;
import MyException.VarNotDefined;
import ctrl.Ctrl;
import ctrl.iCtrl;
import model.PrgState;
import model.adt.*;
import model.stmt.IStmt;
import model.values.IntValue;
import model.values.StringValue;
import model.values.Value;
import org.junit.BeforeClass;
import org.junit.Test;
import repo.Repo;
import repo.iRepo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ArithExp_BBT {
    static MyIStack<IStmt> exeStack;
    static MyIDictionary<Integer,IStmt> exeDictionary;
    static MyIDictionary<String, Value> symTable;
    static MyIDictionary<String,Pair<Value,Value>> dynaimcSymTable;
    static MyIList<Value> out;
    static MyIDictionary<StringValue, BufferedReader> fTbl;
    static MyIHeap heap;

    static PrgState prg;

    static ArrayList<PrgState> list;
    static iRepo repo;
    static iCtrl ctrl;

    @BeforeClass
    public static void setup() throws FileNotFoundException {
        exeStack=new MyStack<IStmt>();
        exeDictionary=new MyDictionary<Integer,IStmt>();
        symTable=new MyDictionary<String, Value>();
        dynaimcSymTable=new MyDictionary<String,Pair<Value,Value>>();
        out=new MyList<Value>();
        fTbl=new MyDictionary<StringValue,BufferedReader>();
        heap=new MyHeap();

    }


    @Test
    public void tc_FirstOperandInvalid() throws CustomException, VarNotDefined, DivByZero {

        ArithExp exp = new ArithExp('*',new ValueExp(new StringValue("0")),new ValueExp(new IntValue(3)));
        boolean aux=true;
        try {
            IntValue res = (IntValue)exp.eval(symTable,heap);
        }
        catch(Exception e){
            aux=false;
        }
        assertFalse(aux);

    }
    @Test
    public void tc_SecondOperandInvalid() throws CustomException, VarNotDefined, DivByZero {

        ArithExp exp = new ArithExp('-',new ValueExp(new IntValue(3)),new ValueExp(new StringValue("0")));
        boolean aux=true;
        try {
            IntValue res = (IntValue)exp.eval(symTable,heap);
        }
        catch(Exception e){
            aux=false;
        }
        assertFalse(aux);

    }
    @Test
    public void tc_SecondOperandInvalid_WhileDividing() throws CustomException, VarNotDefined, DivByZero {

        ArithExp exp = new ArithExp('/',new ValueExp(new IntValue(3)),new ValueExp(new IntValue(0)));
        boolean aux=true;
        try {
            IntValue res = (IntValue)exp.eval(symTable,heap);
        }
        catch(Exception e){
            aux=false;
        }
        assertFalse(aux);

    }
    @Test
    public void tc_OperatorInvalid() throws CustomException, VarNotDefined, DivByZero {

        ArithExp exp = new ArithExp('%',new ValueExp(new IntValue(3)),new ValueExp(new IntValue(2)));
        boolean aux=true;
        try {
            IntValue res = (IntValue)exp.eval(symTable,heap);
        }
        catch(Exception e){
            aux=false;
        }
        assertFalse(aux);

    }
    @Test
    public void tc_AllValid_Addition() throws CustomException, VarNotDefined, DivByZero {

        ArithExp exp = new ArithExp('+',new ValueExp(new IntValue(3)),new ValueExp(new IntValue(2)));
        IntValue res = (IntValue)exp.eval(symTable,heap);
        assertEquals(res.getVal(),5);

    }

    @Test
    public void tc_AllValid_Subtraction() throws CustomException, VarNotDefined, DivByZero {

        ArithExp exp = new ArithExp('-',new ValueExp(new IntValue(10)),new ValueExp(new IntValue(19)));
        IntValue res = (IntValue)exp.eval(symTable,heap);
        assertEquals(res.getVal(),-9);

    }
    @Test
    public void tc_AllValid_WithOperator_Multiplication() throws CustomException, VarNotDefined, DivByZero {

        ArithExp exp = new ArithExp('*',new ValueExp(new IntValue(5)),new ValueExp(new IntValue(7)));
        IntValue res = (IntValue)exp.eval(symTable,heap);
        assertEquals(res.getVal(),35);

    }
    @Test
    public void tc_AllValid_WithOperator_Division() throws CustomException, VarNotDefined, DivByZero {

        ArithExp exp = new ArithExp('/',new ValueExp(new IntValue(40)),new ValueExp(new IntValue(13)));
        IntValue res = (IntValue)exp.eval(symTable,heap);
        assertEquals(res.getVal(),3);

    }
}
