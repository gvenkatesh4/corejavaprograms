package Sortingdatainlistemployee;

import java.util.Comparator;

public class Employee {
	    private int id=100;
		private String name;
		private long salary;
		private static int idgenerator=100;
		
     public Employee() {
			
		}
 public Employee(String name,long salary){
	id=idgenerator++;
	this.name=name;
	this.salary=salary;
	
}
protected int getId() {
	return id;
}
protected void setId(int id) {
	this.id = id;
}
protected String getName() {
	return name;
}
protected void setName(String name) {
	this.name = name;
}
protected long getSalary() {
	return salary;
}
protected void setSalary(long salary) {
	this.salary = salary;
}
protected static int getIdgenerator() {
	return idgenerator;
}
protected static void setIdgenerator(int idgenerator) {
	Employee.idgenerator = idgenerator;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}




	}


