package cabcustomer03dec2019;

public class CabCustomerServiceTester {

public static void main(String args[]) {
	COJ_65_CabCustomerService Customer = new COJ_65_CabCustomerService();
CabCustomer A = new CabCustomer("manish", "esi", "waverock",  46, 94785211l);
CabCustomer B = new CabCustomer("karthik", "malkajgiri", "waverock", 40, 941478525l);
CabCustomer C = new CabCustomer("yeawanth", "lothukunta", "mindspace", 30, 94385230l);
CabCustomer D = new CabCustomer("ravi", "lbnagar", "htechcity", 29, 914785263l);
CabCustomer E = new CabCustomer("prashanth", "dilshiknagar", "wiprocircle", 40, 147852369l);
Customer.addCabCustomer(A);
Customer.addCabCustomer(C);
Customer.addCabCustomer(B);
Customer.addCabCustomer(E);
System.out.println(Customer.isFirstCustomer(B));
System.out.println(Customer.calculateBill(B));
System.out.println(Customer.isFirstCustomer(D));
System.out.println(Customer.calculateBill(D));
Customer.display();

}
}
