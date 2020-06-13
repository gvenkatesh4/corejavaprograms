package InheritanceStudentandempdetails;

public class Student  extends Person{
       private String program;
       private int year;
       private double fee;
       
       
       public Student(){
    	   
       }
       public Student(String name,String Address,String program,int year,int fee) {
    	   super(name, Address);
    	   
    	   this.program=program;
    	   this.year=year;
    	   this.fee=fee;
       }
	protected String getProgram() {
		return program;
	}
	protected void setProgram(String program) {
		this.program = program;
	}
	protected int getYear() {
		return year;
	}
	protected void setYear(int year) {
		this.year = year;
	}
	protected double getFee() {
		return fee;
	}
	protected void setFee(double fee) {
		this.fee = fee;
	}
	
	
	public String toString() {
		return super.toString();
		// "student details="+"name="+getName()+","+"Address="+getAddress()+","+"program="+program+" ,"+"year="+year+","+"fees="+fee;
	}
///super.tostring() getting reffered elements.
}
