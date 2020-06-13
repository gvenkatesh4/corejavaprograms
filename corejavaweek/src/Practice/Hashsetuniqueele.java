package Practice;

import java.util.HashSet;

public class Hashsetuniqueele {

	public static void main(String[] args) {
		
		HashSet<String>a=new HashSet();
		a.add("venkatesh");
		a.add("India");
		a.add("Hyderabad");
		a.add("venkatesh");
		a.add("Hyderabad");

		for(String e:a)
		{
			System.out.println(e);
		}
		//System.out.println(a);
	}

}
