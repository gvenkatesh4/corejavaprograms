package Cabdatalatest;

public class Customerservicetester {
	public static void main(String[] args) {
		Customerservice customer = new Customerservice();
		Cabcustomer A = new Cabcustomer("Aman", "dilsukhnagar", "dLF", 46, 12345l);
		Cabcustomer B = new Cabcustomer("livin", "goa", "canada", 12, 55222l);
		Cabcustomer C = new Cabcustomer("shravan", "india", "canada", 14, 12345l);
		Cabcustomer D = new Cabcustomer("shrrravan", "india", "canada", 14, 12345l);
		Cabcustomer E = new Cabcustomer("shraefevan", "india", "canada", 14, 12345l);

		System.out.println(customer.PrintBill(A));
		System.out.println(customer.PrintBill(B));
		System.out.println(customer.PrintBill(C));
		System.out.println(customer.PrintBill(D));
		System.out.println(customer.PrintBill(E));
		System.out.println("===============================================");
		System.out.println(customer.PrintBill(A));
		System.out.println(customer.PrintBill(B));
		System.out.println(customer.PrintBill(C));
		System.out.println(customer.PrintBill(D));
		System.out.println(customer.PrintBill(E));
	}
}