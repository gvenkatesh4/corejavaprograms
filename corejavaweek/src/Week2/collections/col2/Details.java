package Week2.collections.col2;

public class Details {
	private int id=100;
	private String name;
	private String Address;
	private static int idgenerator=100;
	Details(){
		
	}
	Details(String name,String Address){
		id=idgenerator++;
		this.name=name;
		this.Address=Address;
	}
	
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
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
	protected static int getIdgenerator() {
		return idgenerator;
	}
	protected static void setIdgenerator(int idgenerator) {
		Details.idgenerator = idgenerator;
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	
	
	
	
}
