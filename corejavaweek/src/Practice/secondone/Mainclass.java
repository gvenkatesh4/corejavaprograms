package Practice.secondone;

import java.util.ArrayList;
import java.util.Collections;  


public class Mainclass {

	public static void main(String[] args) {
		ReverseArrraylist obj = new ReverseArrraylist(10);
		ReverseArrraylist obj1 = new ReverseArrraylist(20);
		ReverseArrraylist obj2 = new ReverseArrraylist(30);
		ReverseArrraylist obj3 = new ReverseArrraylist(50);
		ReverseArrraylist obj4 = new ReverseArrraylist(90);

		
		ArrayList<ReverseArrraylist>t=new ArrayList();
		t.add(obj);
		t.add(obj1);
		t.add(obj2);
		t.add(obj3);
		t.add(obj4);
		
		
		for(ReverseArrraylist e:t)
		{
			System.out.println(e);
		}
		
	     Collections.reverse(t);  

System.out.println(t+"\n");
	}

}
