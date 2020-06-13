package bankingProblem;

public class MainClass {
	public static void main(String[]args)
	{
	
	Customer customer = new Customer(2000,50000);
	Sbi s = new Sbi(customer);

	Customer customer1 = new Customer(20000,50056);
	System.out.println(s);
	
	Icci i = new Icci(customer1);
	System.out.println(i);

	
	}
}
