import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testSchedule {

	@Test
	public void test() {
		String tname="aa";
		int tt1 = 2;
		int tt2 = 2;
		String tname2 = "aaa";
		int ttt1 = 4;
		int ttt2 = 4;
		Work w = new Work(tname, tt1,tt2);
		Work w2 = new Work(tname2, ttt1,ttt2);
		w.getPriority();
		w2.getPriority();
		
		
		Schedule sch = new Schedule();
		
		List<Work> tworks = new ArrayList();
		tworks.add(w);
		tworks.add(w2);
		List<Work> tworks2 = new ArrayList();
		tworks2.add(w);
		tworks2.add(w2);
		
		sch.FCFS(tworks);
		//assertEquals( lst.get(1),sch.FCFS(tworks));
		
		
		

		
	}
	@Test
	public void testAA() {
		String tname="aa";
		int tt1 = 12;
		int tt2 = 2;
		String tname2 = "aaa";
		int ttt1 = 4;
		int ttt2 = 14;
		Work w = new Work(tname, tt1,tt2);
		Work w2 = new Work(tname2, ttt1,ttt2);
		w.getPriority();
		w2.getPriority();
		
		
		Schedule sch = new Schedule();
		
		List<Work> tworks = new ArrayList();
		tworks.add(w);
		tworks.add(w2);
		List<Work> tworks2 = new ArrayList();
		tworks2.add(w);
		tworks2.add(w2);
		
		sch.FCFS(tworks);
		//assertEquals( lst.get(1),sch.FCFS(tworks));
		
		
		

		
	}
	
	@Test
	public void test2() {
		String tname="aa";
		int tt1 = 2;
		int tt2 = 2;
		String tname2 = "aaa";
		int ttt1 = 4;
		int ttt2 = 4;
		Work w = new Work(tname, tt1,tt2);
		Work w2 = new Work(tname2, ttt1,ttt2);
		w.getPriority();
		w2.getPriority();
		
		
		Schedule sch = new Schedule();
		
		List<Work> tworks = new ArrayList();
		tworks.add(w);
		tworks.add(w2);
		List<Work> tworks2 = new ArrayList();
		tworks2.add(w);
		tworks2.add(w2);
		
		sch.SJF(tworks);
		
	}
	
	@Test
	public void test3() {
		String tname="aa";
		int tt1 = 2;
		int tt2 = 2;
		Work w = new Work(tname, tt1,tt2);
		
		
		//List<Work> tworks;
		
		Schedule sch = new Schedule();
		
		List<Work> tworks = new ArrayList<Work>();
		
		List<Double> lst = new ArrayList<Double>();
		assertEquals( lst,sch.sortByServiceTime(tworks));
		
	}
	
	@Test
	public void test4() {
		String tname="aa";
		int tt1 = 8;
		int tt2 = 2;
		String tname2 = "aaa";
		int ttt1 = 1;
		int ttt2 = 4;
		Work w = new Work(tname, tt1,tt2);
		Work w2 = new Work(tname2, ttt1,ttt2);
		w.getPriority();
		w2.getPriority();
		
		
		Schedule sch = new Schedule();
		
		List<Work> tworks = new ArrayList();
		tworks.add(w);
		tworks.add(w2);
		List<Work> tworks2 = new ArrayList();
		tworks2.add(w);
		tworks2.add(w2);
		
		sch.sortByServiceTime(tworks);
		
	}


}
