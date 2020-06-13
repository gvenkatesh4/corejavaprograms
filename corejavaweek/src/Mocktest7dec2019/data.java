package Mocktest7dec2019;

public abstract class  data {
	private int id=100;
	private String studentName;
	private String studentclass;
	
	private static int idgenerator=100;
	
	public data(){
		
	}
	public data(String studentName,String studentclass ){
		id=idgenerator++;
		this.studentName=studentName;
		this.studentclass=studentclass;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getStudentName() {
		return studentName;
	}
	protected void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	protected String getStudentclass() {
		return studentclass;
	}
	protected void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}
	protected static int getIdgenerator() {
		return idgenerator;
	}
	protected static void setIdgenerator(int idgenerator) {
		data.idgenerator = idgenerator;
	}
	
	public abstract double percentage();
	@Override
	public String toString() {
		return "data [id=" + id + ", studentName=" + studentName + ", studentclass=" + studentclass + "]";
	}
	

}
