package movie.sorting.hashset.sorting.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;



public class Mainclass {

	public static void main(String[] args) {
		Moviedata obj = new Moviedata("sahoo","sujeeth",2 ,3.5f);
		Moviedata obj1 = new Moviedata("Baahubali","raja-mouli",3,4.0f );

		Moviedata obj2 = new Moviedata("Goodachari","kiran",4,3.0f);
		HashSet<Moviedata>set=new HashSet();
		set.add(obj);
		set.add(obj1);
		set.add(obj2);
		System.out.println(set);
		System.out.println("name-----------");
		NameComparator a= new NameComparator();
		TreeSet<Moviedata>t=new TreeSet<Moviedata>(a);
		t.addAll(set);
		System.out.println("based on movie name----");
		System.out.println(t);
		
		Directcomparator b = new Directcomparator();
		TreeSet<Moviedata>t1=new TreeSet<Moviedata>(b);
		t1.addAll(set);
		System.out.println("based on the director-------");
		System.out.println(t1);
		
		Durationcomparator c= new Durationcomparator();
		TreeSet<Moviedata>t2=new TreeSet<Moviedata>(c);
		t2.addAll(set);
		
		System.out.println("based on the duration------");
		System.out.println(t2);
		}

}
