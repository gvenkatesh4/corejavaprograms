package cabcustomer03dec2019;

public class CabCustomer {
	  private  int id=100;
	  private String Name;
	  private String pickupLocation;
	  private String dropLocation;
	  private int distance;
	  private long phone; 
	  private static int idgenerator=100;

CabCustomer(){
	
}
CabCustomer(String Name,
		String pickupLocation,String dropLocation,int distance,long phone){
	id=idgenerator++;
	this.id=id;
	this.Name=Name;
	this.pickupLocation=pickupLocation;
	this.dropLocation=dropLocation;
	this.distance=distance;
	this.phone=phone;
}
protected int getCustId() {
	return id;
}
protected void setCustId(int custId) {
	this.id = id;
}

protected String getName() {
	return Name;
}
protected void setName(String name) {
	Name = name;
}
protected String getPickupLocation() {
	return pickupLocation;
}
protected void setPickupLocation(String pickupLocation) {
	this.pickupLocation = pickupLocation;
}
protected String getDropLocation() {
	return dropLocation;
}
protected void setDropLocation(String dropLocation) {
	this.dropLocation = dropLocation;
}
protected int getDistance() {
	return distance;
}
protected void setDistance(int distance) {
	this.distance = distance;
}
protected long getPhone() {
	return phone;
}
protected void setPhone(long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "CabCustomer [id=" + id + ", Name=" + Name + ", pickupLocation=" + pickupLocation + ", dropLocation="
			+ dropLocation + ", distance=" + distance + ", phone=" + phone + "]";
}




}