package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Mainclass {


	public static void main(String[] args) {
		Arraylistindecendingorder q = new Arraylistindecendingorder(1);
		Arraylistindecendingorder q1 = new Arraylistindecendingorder(10);
		Arraylistindecendingorder q2 = new Arraylistindecendingorder(100);
		Arraylistindecendingorder q3 = new Arraylistindecendingorder(1000);
		Arraylistindecendingorder q4 = new Arraylistindecendingorder(10000);

		
		ArrayList<Arraylistindecendingorder>t=new ArrayList();
		t.add(q);
		t.add(q1);
		t.add(q2);
		t.add(q3);
		t.add(q4);
		//System.out.println(t);
		for(Arraylistindecendingorder u:t)
		{
			System.out.println(u);
		}
		
		Numcomparator g = new Numcomparator();
		Collections.sort(t,g);
		System.out.println("based on the num");
		for(Arraylistindecendingorder u:t)
		{
			System.out.println(u);
		}

		
	}

}
