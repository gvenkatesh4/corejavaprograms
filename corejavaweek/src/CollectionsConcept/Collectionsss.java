package CollectionsConcept;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class Collectionsss {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(10.5f);
		l.add("india");
		l.add('A');
		l.add(10);
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.remove(4));// it is used for removing the element in an array
		System.out.println(l);
		System.out.println(l.indexOf(10));
		System.out.println(l.contains(10));
		l.add(2,100);
		System.out.println(l);
		l.set(1, 15);
		System.out.println(l);
		
		
		LinkedList l2 = new LinkedList();
		l2.add(100);
		l2.add(15.6f);
		l2.add("world");
		l2.add('w');
		l2.set(0, 10000);
		//l2.clear();
		System.out.println(l2);

	}

}
