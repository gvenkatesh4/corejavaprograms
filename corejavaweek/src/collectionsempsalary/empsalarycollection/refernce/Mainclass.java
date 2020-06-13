package collectionsempsalary.empsalarycollection.refernce;

import java.util.ArrayList;
import java.util.Iterator;



public class Mainclass {

	public static void main(String[] args) {
		Details obj = new Details("refridgerator",500);
		Details obj1 = new Details("tv",1000000);	
		Details obj2 = new Details("i phone",999);	
		Details obj3 = new Details("tab",159000);	
		Details obj4 = new Details("music system",12596);
		Details obj5 = new Details("speaker",1200000);
		Details obj6 = new Details("smart swatch",350000);
		Details obj7 = new Details("smart light",24000);
		Details obj8 = new Details("ear phones",12593);
		Details obj9 = new Details("smart phone",3500000);

		
		ArrayList<Details>data=new ArrayList<Details>();
		data.add(obj);
		data.add(obj1);
		data.add(obj2);
		data.add(obj3);
		data.add(obj4);
		data.add(obj5);
		data.add(obj6);
		data.add(obj7);
		data.add(obj8);
		data.add(obj9);

		
		ArrayList<Details>lowcost=new ArrayList<Details>();
		ArrayList<Details>highcost=new ArrayList<Details>();
		ArrayList<Details>overhighcost=new ArrayList<Details>();

		System.out.println("list---------");
		for(Details e:data)
		{
			System.out.println(e);
		}
		System.out.println("list--------");
		Iterator<Details>t= data.iterator();

		while(t.hasNext())
		{
			Details i=t.next();
			if(i.getPrice()<25000)
				{
					lowcost.add(i);
				}
				if(i.getPrice()>300000)

				{
					highcost.add(i);
			   }
				if(i.getPrice()>3000000)

				{
					overhighcost.add(i);
			   }
			
				t.remove();
	}
		for(Details e:data) {
			System.out.println(e);
		}
		System.out.println("lowcost------");
		for(Details e:lowcost) {
			System.out.println(e);
		}
		System.out.println("highcost-----");
		for(Details e:highcost) {
			System.out.println(e);
		}
		System.out.println("overhighcost-----");
		for(Details e:overhighcost) {
			System.out.println(e);
		}

	}
}
