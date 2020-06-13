package Hospitalproblem07dec2019;

import java.util.ArrayList;
import java.util.List;

public class Hospitalpro {
	private int hospitalcode=1000;
	private String hospitalname;
	private List<String> listoftreatments;
	private String contactperson;
	private String contactnumber;
	private String location;
private static int idgenerator=1000;
 public Hospitalpro(){
	   
	   
   }
   public Hospitalpro(String hospitalname,List<String> listoftreatments,
		   String contactperson,String contactnumber,String location){
	   hospitalcode=idgenerator++;
	   this.hospitalname=hospitalname;
		    this.listoftreatments=listoftreatments;
		    this.contactperson=contactperson;
		    this.contactnumber=contactnumber;
		    this.location=location;
	   }
public int getHospitalcode() {
	return hospitalcode;
}
public void setHospitalcode(int hospitalcode) {
	this.hospitalcode = hospitalcode;
}
public String getHospitalname() {
	return hospitalname;
}
public void setHospitalname(String hospitalname) {
	this.hospitalname = hospitalname;
}
public List<String> getListoftreatments() {
	return listoftreatments;
}
public void setListoftreatments(List<String> listoftreatments) {
	this.listoftreatments = listoftreatments;
}
public String getContactperson() {
	return contactperson;
}
public void setContactperson(String contactperson) {
	this.contactperson = contactperson;
}
public String getContactnumber() {
	return contactnumber;
}
public void setContactnumber(String contactnumber) {
	this.contactnumber = contactnumber;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public static int getIdgenerator() {
	return idgenerator;
}
public static void setIdgenerator(int idgenerator) {
	Hospitalpro.idgenerator = idgenerator;
}
@Override
public String toString() {
	return "Hospitalpro [hospitalcode=" + hospitalcode + ", hospitalname=" + hospitalname + ", listoftreatments="
			+ listoftreatments + ", contactperson=" + contactperson + ", contactnumber=" + contactnumber + ", location="
			+ location + "]";
}

   
   
   
   
}


