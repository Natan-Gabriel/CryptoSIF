package model.stmt;
import model.PrgState;
import model.exp.*;
import model.adt.*;
import MyException.*;

public class CompStmt implements IStmt{
	 IStmt first;
	 IStmt snd;
	 int endingLine;
	 public CompStmt(IStmt f,IStmt s) {first=f;snd=s; endingLine = Math.max(f.getEndingLine(),s.getEndingLine());  }
	 public String toString() { return "CompStmt("+first.toString() + ";" + snd.toString()+")";}
	 public PrgState execute(PrgState state) {
	 
		 MyIStack<IStmt> stk=state.getStk();
		 stk.push(snd);
		 stk.push(first);

		 return state;
	 }
	public int getStatementNumber(){return 1;}
	public int  getLineNumber(){return -1;}
	public int getEndingLine() {return endingLine;}
}
