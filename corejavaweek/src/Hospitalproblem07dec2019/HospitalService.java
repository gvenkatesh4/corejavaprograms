package Hospitalproblem07dec2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HospitalService {

	private List<Hospitalpro> hospitalist = new ArrayList<Hospitalpro>();

	public int addHospitalpro(Hospitalpro details) {
		hospitalist.add(details);
		return details.getHospitalcode();
	}

	public Map<Integer, String> getHospitalpro() {
		Map<Integer, String> hmap = new TreeMap<Integer, String>();

		for (Hospitalpro h : hospitalist) {
			hmap.put(h.getHospitalcode(), h.getHospitalname());

		}

		return hmap;
	}

	public Hospitalpro getHospitalprodetails(int Hospitalcode) {
		for (Hospitalpro h : hospitalist) {
			if (h.getHospitalcode() == Hospitalcode)
				return h;
		}
		return null;
	}
}
