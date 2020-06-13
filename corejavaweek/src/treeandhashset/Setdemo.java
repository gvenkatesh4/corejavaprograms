package treeandhashset;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setdemo implements Comparator<Cdf>{

	

	public static void main(String[] args) {
	HashSet<Integer> set = new HashSet<Integer>();
	set.add(10);
	set.add(12365);
	set.add(-2);
	set.add(0);

	System.out.println(set);

	IntegerComparator I = new IntegerComparator();


	TreeSet<Integer> t = new TreeSet<Integer> (I);
	t.addAll(set);

	System.out.println(t);



	}

	}

