package ctrl;
import model.*;
import model.adt.*;
import model.stmt.*;
import model.values.*;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import MyException.*;
import repo.*;

public class Ctrl implements iCtrl{
	iRepo repo; 
	boolean flag=false;
	public Ctrl(iRepo r) {repo=r;}
	public Ctrl(iRepo r, boolean _flag) {repo=r;flag=_flag;}
//	int nextInstruction=1;
	
	Map<Integer,Value> unsafeGarbageCollector(List<Integer> symTableAddr, Map<Integer,Value> heap){
	return heap.entrySet().stream()
			.filter(e->(symTableAddr.contains(e.getKey()) ||  getAddrFromHeap(heap.values()).contains(e.getKey())))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue) ) ;}
	
	List<Integer> getAddrFromSymTable(Collection<Value> symTableValues){
	return symTableValues.stream()
			.filter(v-> v instanceof RefValue)
			.map(v-> {RefValue v1 = (RefValue)v; return v1.getAddr();})
			.collect(Collectors.toList());
	}
	
	List<Integer> getAddrFromHeap(Collection<Value> HeapValues){
		return HeapValues.stream()
				.filter(v-> v instanceof RefValue)
				.map(v-> {RefValue v1 = (RefValue)v; return v1.getAddr();})
				.collect(Collectors.toList());
		}


	public PrgState oneStep(PrgState state) throws ExeStackEmpty, VarNotDefined, DivByZero, VarIsDefined,Exception{
		 if(flag==true)
			 displayPrgState(state);
		 MyIStack<IStmt> stk=state.getStk();
		 MyIStack<IStmt> stk_executed=state.getStkExecuted();
		 if(stk.isEmpty()) 
			 throw new ExeStackEmpty("prgState stack is empty");
		 IStmt crtStmt = stk.pop();
		stk_executed.push(crtStmt);

		 return crtStmt.execute(state);
		 }


	public PrgState oneStepUsingDictionary(PrgState state) throws ExeStackEmpty, VarNotDefined, DivByZero, VarIsDefined, TaintedAddress, CustomException {
		if(flag==true)
			displayPrgState(state);

		int nextInstruction=state.getNextInstruction();


		MyIDictionary<Integer,IStmt> exeDictionary=state.getExeDictionary();
		IStmt crtStmt = exeDictionary.getValue(nextInstruction);

		return crtStmt.execute(state);
	}
	public void allStep() throws Exception {

		 PrgState prg = repo.getCrtPrg();

		 repo.logPrgStateExec();

		 while (!prg.getStk().isEmpty()){

			 oneStep(prg);


			 repo.logPrgStateExec();

			 prg.getHeap().setContent(unsafeGarbageCollector(
					 getAddrFromSymTable(prg.getSymTable().getContent().values()),
					 prg.getHeap().getContent()));
		 }
		 if(flag==true)
			 displayPrgState(prg);
		 }
	public void allStep(int b) throws ExeStackEmpty, VarNotDefined, DivByZero, VarIsDefined,Exception{
		 PrgState prg = repo.getCrtPrg();
		 try {
				repo.logPrgStateExec();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 while (!prg.getStk().isEmpty() && b>0){
			 oneStep(prg);
			 b--;
			 try {
					repo.logPrgStateExec();
				 	prg.getHeap().setContent(unsafeGarbageCollector(
				 	getAddrFromSymTable(prg.getSymTable().getContent().values()),
					prg.getHeap().getContent()));
			 }
			 catch(Exception e) {
					System.out.println(e);
			 }
		 }
		 if(flag==true)
			 System.out.println(prg);	 //display last prg state
		 }
	public void displayPrgState (PrgState state) {
		System.out.println(state);
	}
	public void setFlag (boolean val) {
		flag=val;
	}
	public int getLength() {
		return repo.getLength();
	}
	
}
