package Mocktest7dec2019;

public class ScienceStudent extends data{

	private int physicsmarks;
	private int chemistrymarks;
	private int mathmarks;
	
	public ScienceStudent(){
		
	}
	public ScienceStudent(String studentName,String studentclass,int physicsmarks,int chemistrymarks,int mathmarks ){
		super(studentName,studentclass);
		this.physicsmarks=physicsmarks;
		this.chemistrymarks=chemistrymarks;
		this.mathmarks=mathmarks;
	}
	protected int getPhysicsmarks() {
		return physicsmarks;
	}
	protected void setPhysicsmarks(int physicsmarks) {
		this.physicsmarks = physicsmarks;
	}
	protected int getChemistrymarks() {
		return chemistrymarks;
	}
	protected void setChemistrymarks(int chemistrymarks) {
		this.chemistrymarks = chemistrymarks;
	}
	protected int getMathmarks() {
		return mathmarks;
	}
	protected void setMathmarks(int mathmarks) {
		this.mathmarks = mathmarks;
	}
	public double percentage() {
		int marks=physicsmarks+chemistrymarks+mathmarks;
		return (marks/300)*100;
	}
	
	public String toString() {
		return "ScienceStudent [physicsmarks=" + physicsmarks + ", chemistrymarks=" + chemistrymarks + ", mathmarks="
				+ mathmarks + ", percentage()=" + percentage() + ", getId()=" + getId() + ", getStudentName()="
				+ getStudentName() + ", getStudentclass()=" + getStudentclass() + "]";
	}
	
	
	
	
	
	
	
	
	

}
