package Cabdatalatest.usingsorting.distance;

import java.util.ArrayList;
import java.util.Collections;

public class Customerservicetester {
	public static void main(String[] args) {
		//Customerservice customer = new Customerservice();
		Cabcustomer A = new Cabcustomer("Aman", "dilsukhnagar", "dLF", 46, 12345l);
		Cabcustomer B = new Cabcustomer("livin", "goa", "canada", 12, 55222l);
		Cabcustomer C = new Cabcustomer("shravan", "india", "canada", 14, 12345l);
		Cabcustomer D = new Cabcustomer("shrrravan", "india", "canada", 14, 12345l);
		Cabcustomer E = new Cabcustomer("shraefevan", "india", "canada", 14, 12345l);

		ArrayList<Cabcustomer>emp=new ArrayList();
		emp.add(A);
		emp.add(B);
		emp.add(C);
		emp.add(D);
		emp.add(E);
		Collections.sort(emp);
		for(Cabcustomer ab:emp)
		{
			System.out.println(ab);
		}
	}
}
