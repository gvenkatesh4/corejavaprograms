package Week2.collections.next;

public class Datasorting {
	private int id=100;
	private String name;
	private String Address;
	private String Country;
	private String Course;
	
	private static int idgenerator=100;
	
	
	Datasorting(){
		
	}
	Datasorting(String name,String Address,String Country,String course){
		id=idgenerator++;
		this.name=name;
		this.Address=Address;
		this.Country=Country;
		this.Course=course;
		
		
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
	
	protected void setAddress(String address) {
		Address = address;
	}
	protected String getAddress() {
		return Address;
	}
	
	protected void setCountry(String country) {
		Country = country;
	}
	protected String getCountry() {
		return Country;
	}
	
	protected void setCourse(String course) {
		Course = course;
	}
	protected String getCourse() {
		return Course;
	}
	
@Override
public String toString() {
	return "Datasorting [id=" + id + ", name=" + name + ", Address=" + Address + ", Country=" + Country + ", Course="
			+ Course + "]";
}
 
}



