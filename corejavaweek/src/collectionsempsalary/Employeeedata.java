package collectionsempsalary;

public class Employeeedata implements Comparable<Employeeedata> {
	private int id=100;
	private String name;
	private double salary;
	private static int idgenerator=100;
	Employeeedata(){
		
	}
	Employeeedata(String name,double salary)
	{
		id=idgenerator++;
		this.name=name;
		this.salary=salary;
		
	}
	
	protected void setId(int id) {
		this.id = id;
	}
	protected int getId() {
		return id;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	protected String getName() {
		return name;
	}
	
	protected void setSalary(double salary) {
		this.salary = salary;
	}
	protected double getSalary() {
		return salary;
	}
	
	protected static void setIdgenerator(int idgenerator) {
		Employeeedata.idgenerator = idgenerator;
	}
	protected static int getIdgenerator() {
		return idgenerator;
	}
	@Override
	public String toString() {
		return "Employeeedata [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employeeedata e) {
		return name.compareTo(e.getName());
	}
	

}
