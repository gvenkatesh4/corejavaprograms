package InheritanceStudentandempdetails;

public class Staff extends Person {
	private String school;
	private double pay;

  public Staff() {
	  
  }
  public Staff(String name,String Address,String school,double pay) {
	  super(name,Address);
	  this.school=school;
	  this.pay=pay;
  }
protected String getStaff() {
	return school;
}
protected void setStaff(String staff) {
	this.school = staff;
}
protected double getPay() {
	return pay;
}
protected void setPay(double pay) {
	this.pay = pay;
}
@Override
public String toString() {
	return "staffdetails="+","+"name="+getName()+","+"Address="+getAddress()+","+"school="+","+school+","+"pay ="+pay;
}
  }