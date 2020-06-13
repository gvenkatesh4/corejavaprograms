package Collection.basics;

import java.util.ArrayList;
import java.util.Iterator;



public class Loops {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		ArrayList  a = new ArrayList();
		l.add(10);
		l.add(100);
		l.add(1);
		l.add(2);
		l.add(1);
		a.add("I");
		a.add("N");
		a.add("D");
		a.add("I");
		a.add("A");
		
		
		//System.out.print(l);
		
		Iterator itr = l.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}		
		
		Iterator itr1 = a.iterator();
		while(itr1.hasNext()){

			System.out.println(itr1.next());
		}
	}

}
