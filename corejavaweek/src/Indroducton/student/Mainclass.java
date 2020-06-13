package Indroducton.student;

public class Mainclass {

	public static void main(String[] args) {
		Studentmarks stude = new Studentmarks();
		stude.id=12345;
		stude.name="venkat";
		stude.sub1=55;
		stude.sub2=63;
		stude.sub3=72;
		
		

		
		System.out.println(stude.id);
		System.out.println(stude.name);
		System.out.println("total  marks"+stude.marks());
		System.out.println("percentage"+stude.percentage());
		
		Studentmarks student1 = new Studentmarks();
		student1.id=12365;
		student1.name="venaktesh";
		student1.sub1=55;
		student1.sub2=74;
		student1.sub3=76;
		
		System.out.println(student1.id);
		System.out.println(student1.name);
		System.out.println("total marks"+student1.marks());
		System.out.println("percentage"+student1.percentage());

		

	}

}
