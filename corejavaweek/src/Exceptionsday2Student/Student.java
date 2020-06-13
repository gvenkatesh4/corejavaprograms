package Exceptionsday2Student;


public class Student {
	private int id=100;
	private String Name;
	private String Address;
	
	private static int idgenerator=100;
	
	public Student() {
		
	}
		public Student(String Name,String Address) {
			id=idgenerator++;
			this.Name=Name;
			this.Address=Address;
		}
		
		protected int getId() {
			return id;
		}
		protected void setId(int id) {
			this.id = id;
		}
		protected String getName() {
			return Name;
		}
		protected void setName(String name) {
			Name = name;
		}
		protected String getAddress() {
			return Address;
		}
		protected void setAddress(String address) {
			Address = address;
		}
		protected static int getIdgenerator() {
			return idgenerator;
		}
		protected static void setIdgenerator(int idgenerator) {
			Student.idgenerator = idgenerator;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + "]";
		}
		

}

