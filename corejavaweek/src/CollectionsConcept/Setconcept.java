package CollectionsConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setconcept {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(12);
		set.add(15);
		set.add(20);
		set.add(35);
		System.out.println(set);
	
	
LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();	
	
	set1.add(256);	
	set1.add(2526);	
	set1.add(25623);	
	set1.add(25623);	
	set1.add(25611);	
System.out.println(set1);
	TreeSet<Integer> set2 = new TreeSet<Integer>();
	set2.add(12345);
	set2.add(1452);
	set2.add(1);
	set2.add(2);
	set2.add(3);

System.out.println(set2);
}
}