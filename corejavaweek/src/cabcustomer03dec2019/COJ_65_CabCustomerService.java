package cabcustomer03dec2019;

import java.util.ArrayList;

public class COJ_65_CabCustomerService {
	



private ArrayList<CabCustomer> cabCustomerlist = new ArrayList<>();

public COJ_65_CabCustomerService() {

}

public ArrayList<CabCustomer> getCabCustomerList() {
return cabCustomerlist;
}

public void addCabCustomer(CabCustomer objj) {
cabCustomerlist.add(objj);
}

public boolean isFirstCustomer(CabCustomer objj) {
for (CabCustomer c : cabCustomerlist) {
if (c.getPhone() == objj.getPhone()) {
return false;
}
}
return true;
}
public double calculateBill(CabCustomer objj) {
if(isFirstCustomer(objj)){
return 0;
}
else if (objj.getDistance()<=4){
return 80;
}
else if (objj.getDistance() > 4){
return 80+((objj.getDistance()-4)* 6);
}
return 0;
}
public void display() {
for (CabCustomer c : cabCustomerlist) {
System.out.println(c);
System.out.println("Bill is " + calculateBill(c));

}
}
}


