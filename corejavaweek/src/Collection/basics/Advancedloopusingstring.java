package Collection.basics;

import java.util.ArrayList;

public class Advancedloopusingstring {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		
		a.add("India");
		a.add("usa");
		a.add("canada");
		System.out.println(a);
		for(String str: a)
		{
			System.out.println(str);
		}
	}

}
