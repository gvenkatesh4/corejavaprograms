package Indroducton.empdetails;

public class Emp {

	private int id;
	private String Firstname;
	private String Lastname;
	private int salary;
	public Emp(int id,String Firstname,String Lastname,int salary ) {
		this.id=id;
		this.Firstname=Firstname;
		this.Lastname=Lastname;
		this.salary=salary;
		
	}
	

	public int getid() {
		return id;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	
	public String getLastname() {
		return Lastname;
		
	}
	public String getName() {
		return Firstname+Lastname;
	}
  public void setsalary(int s) {
	  this.salary=s;
  }
  public int getsalary() {
	  return salary;
  }
  public int getannualsalary() {
	  return salary*12;
  }
  public int raisesalary(int percentage) {
	  return getsalary()*(100+percentage)/100;
  }
  public String toString() {
	  return "emp id"+id+"name="+
  Firstname+Lastname+"salary="+raisesalary(10);
  }
}
