package corejavaexceptionsarraymarksdataofstudent;

import java.util.ArrayList;
import java.util.List;


public class Marksinvalidexception {
public static void main(String[] args) {
	List<Integer>m= new ArrayList<Integer>();
	
	m.add(50);
	m.add(10);
	m.add(100);
	float s = 50+10+100; 
	int totalmarks = 300;
	float value = ((s/300)*100);
	try {
		for(Integer e:m) {
			if(e<35) {
				throw new Marksnotvalid("enter greater then 35");

			}
			else
				System.out.println("you are passed in subject");
		}
	}

catch(Marksnotvalid a) {
	
	a.printStackTrace();
}
	finally {
		System.out.println("percentage is"+value);
	}
}
}
