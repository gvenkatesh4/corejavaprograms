package Week2.collections.next;


import java.util.LinkedList;

public class Mainclass {

	public static void main(String[] args) {
		Datasorting a= new Datasorting("Manish","Hyd","India","Cse");
		Datasorting b= new Datasorting("yeswantha","canada","India","IT");
		Datasorting c= new Datasorting("karthik","usa","uk","IT");
		Datasorting d= new Datasorting("prashanth","Hy","India","Cse");
		Datasorting e= new Datasorting("venkatesh","Hyd","India","Cse");
		
		LinkedList<Datasorting> dataananalysis = new LinkedList<Datasorting>();
		dataananalysis.add(a);
		dataananalysis.add(b);
		dataananalysis.add(c);
		dataananalysis.add(d);
		dataananalysis.add(e);

		for(int i=0;i<dataananalysis.size();i++)
			{
			Datasorting dd= dataananalysis.get(i);
			int count=0;
			for(int j=0;j<dataananalysis.size();j++)
			{
				Datasorting ddb = dataananalysis.get(j);
				if(dd.getCountry().equalsIgnoreCase(ddb.getCountry()))
					//if(dd.getAddress().equalsIgnoreCase(ddb.getAddress()))

					count++;
			}
			if(count>1)
				System.out.println(dd);
			
			
		}
		
	}

}
