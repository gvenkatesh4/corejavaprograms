package Cabdatalatest;

import java.util.ArrayList;

public class Customerservice {

	private ArrayList<Cabcustomer> cabcustomerlist = new ArrayList<>();

	public void addCabcustomer(Cabcustomer a) {
		cabcustomerlist.add(a);
	}

	public boolean isFirstcustomer(Cabcustomer customer) {
		for (Cabcustomer c : cabcustomerlist) {
			if (c.getPhno() == customer.getPhno()) {

				return false;

			}
		}
		return true;

	}

	public double CalculateBill(Cabcustomer c) {
		boolean isFirst = isFirstcustomer(c);
		if (isFirst) {
			cabcustomerlist.add(c);
			return 0.0;
		} else if (c.getDistance() <= 4) {
			return 80.0;
		} else {
			return ((c.getDistance() - 4) * 6) - 80;
		}
	}

	public String PrintBill(Cabcustomer cust) {
		return cust.getCustomername() + "please pay your bill of RS." + CalculateBill(cust);

	}

}
