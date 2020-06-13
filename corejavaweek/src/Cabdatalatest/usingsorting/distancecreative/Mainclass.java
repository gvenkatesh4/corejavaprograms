package Cabdatalatest.usingsorting.distancecreative;

import java.util.ArrayList;
import java.util.Collections;

public class Mainclass {

	public static void main(String[] args) {
		Prize obj = new Prize("sony",100);
		Prize obj1 = new Prize("samsung",1);
		Prize obj2 = new Prize("panasonic",10000);
		Prize obj3 = new Prize("tv",0);
		Prize obj4 = new Prize("phone",1000000);
		
		
		ArrayList<Prize>data=new ArrayList();
		data.add(obj);
		data.add(obj1);
		data.add(obj2);
		data.add(obj3);
		data.add(obj4);
		Collections.sort(data);
		for(Prize e:data)
		{
			System.out.println(e);
		}
		
	}

}
