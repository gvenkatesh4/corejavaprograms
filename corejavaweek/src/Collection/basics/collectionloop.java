package Collection.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionloop {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		ArrayList<String> l = new ArrayList<String>();
		
		a.add(1);
		a.add(5);
		a.add(10);
		a.add(200);
		a.add(89);
		a.add(55);
		
		l.add("A");
		l.add("B");
		l.add("c");
		
		Iterator itr = a.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		Iterator itr1 = l.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
		

	}

}
