package Indroducton.Studentdata;

public class Student {
	private int id;
	private String Name;
	private String Address;

	protected void setid(int id) {
		this.id = id;
	}

	protected int getid() {
		return id;
}

	protected void setName(String s) {
		Name = s;
	}
	protected String getName() {
		return Name;
	}

	protected void setAddress(String add) {
		Address = add;
	}
	protected String getAddress() {
		return Address;
	}
	public String toString() {
		return "id"+id+"Name"+Name+"Address"+Address;
	}

}
