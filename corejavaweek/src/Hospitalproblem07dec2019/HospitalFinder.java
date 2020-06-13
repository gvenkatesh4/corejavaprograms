package Hospitalproblem07dec2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HospitalFinder {

	public static void main(String[] args) {
		List<String>listoftreatments=new ArrayList();
		listoftreatments.add("Cardiac");
		listoftreatments.add("Ent");
		listoftreatments.add("ortho");
		listoftreatments.add("pediatric");
		listoftreatments.add("gastro");
		
		Hospitalpro h1 = new Hospitalpro( "yashoda",listoftreatments,"mathews","963258741","sec");
		Hospitalpro h2 = new Hospitalpro( "Apollo",listoftreatments,"john","96325228741","Hyd");
		
		HospitalService service = new HospitalService();
		int code1=service.addHospitalpro(h1);
		int code2=service.addHospitalpro(h2);
		
		Map<Integer,String>map= service.getHospitalpro();
		System.out.println(map);
		System.out.println(service.getHospitalprodetails(code1));
		System.out.println(service.getHospitalprodetails(code2));
		
	}

}
