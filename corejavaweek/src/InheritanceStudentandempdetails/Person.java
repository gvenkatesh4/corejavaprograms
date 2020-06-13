package InheritanceStudentandempdetails;

public class Person {
	private String name;
	private String Address;
	
	public Person() {
		
	}
	public Person(String name,String Address) {
		this.name=name;
		this.Address=Address;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getAddress() {
		return Address;
	}
	protected void setAddress(String address) {
		Address = address;
	}
	
	public String toString() {
		return "name"+name+"address"+Address;
	}
	
}
