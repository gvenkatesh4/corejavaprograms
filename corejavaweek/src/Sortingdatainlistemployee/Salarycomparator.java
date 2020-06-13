package Sortingdatainlistemployee;

import java.util.Comparator;

public class Salarycomparator implements Comparator<Employee> {

	


	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()<o2.getSalary())
			return 1;
		if(o1.getSalary()>o2.getSalary())
			return -1;
		
		
		return 0;
	}

}
