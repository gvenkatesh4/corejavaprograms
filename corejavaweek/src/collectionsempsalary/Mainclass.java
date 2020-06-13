package collectionsempsalary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Mainclass {

	public static void main(String[] args) {
		
		Employeeedata obj = new Employeeedata("venkatesh",4258);
		Employeeedata obj1 = new Employeeedata("manish",4258);
		Employeeedata obj2 = new Employeeedata("karthik",25000);
		Employeeedata obj3 = new Employeeedata("prashanth",25000);

		
		
		ArrayList<Employeeedata> emp = new ArrayList<Employeeedata>();
		emp.add(obj);
		emp.add(obj1);
		emp.add(obj2);
		emp.add(obj3);
		Collections.sort(emp);


		
		ArrayList<Employeeedata>fresher = new ArrayList<Employeeedata>();

		for(Employeeedata e:emp)
		{
			System.out.println(e);
		}
		Iterator<Employeeedata>it = emp.iterator();
		while(it.hasNext()) {
			Employeeedata i = it.next();
			if(i.getId()==103) {
				fresher.add(i);
				it.remove();

		}
		}
		System.out.println("it is"+fresher);
		
		
		
		for(Employeeedata e:emp)
		{
			System.out.println(e);
		}
		Iterator<Employeeedata>its = emp.iterator();
		while(it.hasNext()) {
			Employeeedata i = its.next();
			if(i.getSalary()<20000) {
				fresher.add(i);
				its.remove();

		}
		}
		System.out.println("-------------");
		System.out.println("emp list");
		for(Employeeedata e:emp)
		{
			System.out.println(e);
		}
		System.out.println("------------------");
		System.out.println("fresher list");
		for(Employeeedata e:fresher) {
			System.out.println(e);

		}
	}

}
