package student.percentage;

public class Mainclass {

	public static void main(String[] args) {
		Studentclass s1 = new Studentclass("venkatesh",52,53,54);
		Studentclass s2 = new Studentclass("sharavan",52,93,54);
		Studentclass s3 = new Studentclass("livin",56,69,54);
		//Studentclass s4 = new Studentclass("venkat",62,53,94);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//System.out.println(s4);
		
		Studentclass p =compare(s1,s2);
		p = compare(p,s3);
		//p = compare(p,s4);
  
		System.out.println("highest percentage "+p);
	}

	private static Studentclass compare(Studentclass p1, Studentclass p2) {
		if(p1.percentage()>p2.percentage())
		return p1;
		else
			return p2;
	}

}
