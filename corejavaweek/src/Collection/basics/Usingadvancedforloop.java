package Collection.basics;

import java.util.ArrayList;

public class Usingadvancedforloop {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		ArrayList<String>b=new ArrayList<String>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		//using string
		
		b.add("sas");
		b.add("ert");
		b.add("rryy");
		b.add("rty");
		b.add("rtty");
		
		for(Integer num:a)
		{
			System.out.println(num);
		}
		
		for(String str:b)
		{
			System.out.println(str);
		}
	}

}
