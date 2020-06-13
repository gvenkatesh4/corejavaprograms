package Cabdatalatest.one;

import java.util.ArrayList;

public class Customerservice {
	private ArrayList<Cabcustomer>cabcustomerlist=new ArrayList();
	
	public void addCabcustomer(Cabcustomer a) {
		cabcustomerlist.add(a);
		}
	public boolean isFirstcustomer(Cabcustomer b) {
		if(Cabcustomer c:cabcustomerlist) {
			if(c.getPhno()==b.getPhno());{
				return false;
				
			}
		}
				
		return true;		
		
		
	}
	
	

}
