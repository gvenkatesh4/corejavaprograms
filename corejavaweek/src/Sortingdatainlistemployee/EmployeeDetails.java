package Sortingdatainlistemployee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeDetails  {
	public static void main(String[] args) {

	
	Employee obj = new Employee("ven",1001);
	Employee obj1 = new Employee("manish",1000);
	Employee obj2 = new Employee("prashanth",1002);
	Employee obj3 = new Employee("karthik",1004);
	Employee obj4 = new Employee("yeswanth",1005);
	Employee obj5 = new Employee("pruthvi",1006);
	
	
	ArrayList<Employee>emdata= new ArrayList();
	
	emdata.add(obj);
	emdata.add(obj1);
	emdata.add(obj2);
	emdata.add(obj3);
	emdata.add(obj4);
	emdata.add(obj5);
	
	for(Employee e:emdata)
	{
		System.out.println(e);
	}
	Namecamparator namec=new Namecamparator();
	Collections.sort(emdata,namec);
	System.out.println("based on name");
	for(Employee e:emdata)
	{
		System.out.println(e);
	}
	System.out.println("based on salary");

	Salarycomparator salc=new Salarycomparator();
	Collections.sort(emdata,salc);

//Collections.sort(emdata, new Salarycomparator());
System.out.println("\n---------------------------------------");
System.out.println("Based On Salary : ");
for(Employee e : emdata){
System.out.println(e);
}

	
	}	
}
