package Week2.collections.col2;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Mainclass {

	public static void main(String[] args) {
		Details d1 = new Details("venkatesh","siricilla");
		Details d2 = new Details("manish","hyderabad");
		Details d3 = new Details("yeswanth","hyderabad");
		Details d4 = new Details("prashanth","hyderabad");
		Details d5 = new Details("manish","hyderabad");
		
		LinkedList<Details> Detailslist = new LinkedList<Details>();
		Detailslist.add(d1);
		Detailslist.add(d2);
		Detailslist.add(d3);
		Detailslist.add(d4);
		Detailslist.add(d5);
		
		for(int i=0;i<Detailslist.size();i++)
		{
			Details D = Detailslist.get(i);
			int count=0;
			for(int j=0;j<Detailslist.size();j++)
			{
				Details d11=Detailslist.get(j);
				if(D.getName().equalsIgnoreCase(d11.getName()))
				count++;
			}
			if(count>1)
				System.out.println(D);
		}
		
	}

}
