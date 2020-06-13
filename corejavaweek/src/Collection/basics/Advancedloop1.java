package Collection.basics;

import java.util.ArrayList;

public class Advancedloop1 {

	public static void main(String[] args) {
		ArrayList<Integer>obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		for(Integer num:obj)
		{
			System.out.println(num+2);
		}
		
		
	}

}
