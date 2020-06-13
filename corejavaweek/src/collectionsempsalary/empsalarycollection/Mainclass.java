package collectionsempsalary.empsalarycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Mainclass {
public static void main(String[] args) {
	Empdata obj1 = new Empdata("manish",30000);
	Empdata obj2 = new Empdata("karthik",35000);
	Empdata obj3 = new Empdata("karthik",300);

	ArrayList<Empdata>s=new ArrayList<Empdata>();
	//s.add(obj);
	s.add(obj1);
	s.add(obj2);
	s.add(obj3);
	Collections.sort(s);

	
	ArrayList<Empdata>fresher = new ArrayList<Empdata>();
	
	
	System.out.println("emp list-------------");
	for(Empdata e:s)
	{
		System.out.println(e);
	}
	Iterator<Empdata>t = s.iterator();

	//Iterator<Empdata>t = s.iterator();
	while (t.hasNext())
	{
		Empdata i = t.next();
		if(i.getSalary()<20000)
		{
			fresher.add(i);
			t.remove();
			
		}
		
	}
	System.out.println("emp list--------");
	for(Empdata e: s )
	{
		System.out.println(e);
	}
	System.out.println("fresher list-------");
	for(Empdata e:fresher)
	{
		System.out.println(e);
	}
	
	
}
}
