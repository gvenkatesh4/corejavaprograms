package usinginterfaceconcept.Multipleinheritance;

public class oneof implements A,B{

		String name;
		String Address;
     oneof() {
    	 
     }
     oneof(String name,String Address)
     {
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
	public String Def() {
		return name;
	}
	public String Abc() {
		// TODO Auto-generated method stub
		return Address;
	}
	@Override
	public String toString() {
		return "oneofgod name=" + name + ", Address=" + Address;
	}
	

}
