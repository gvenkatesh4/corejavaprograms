package Indroducton.Studentdata;

public class Mainclass {

	public static void main(String[] args) {
		Student object = new Student();
		Student object1 = new Student();
		Student object2= new Student();
		
		object.setid(12345);
		object.setName("venkatesh");
		object.setAddress("hyd");
		System.out.println("student id:"+object.getid()
		+",student name:"+object.getName()
		+",student address:"+object.getAddress()); 
		
		System.out.println(object);
		
        object1.setid(123456789);
		object1.setName("dvarg");
		object1.setAddress("hyd -banjara hills road no 10");
		System.out.println("student id:"+object1.getid()
		+",student name:"+object1.getName()
		+",student address:"+object1.getAddress()); 
		

        object2.setid(123456789);
		object2.setName("gg");
		object2.setAddress("hyd -banjara hills road no 10");
		System.out.println("student id:"+object2.getid()
		+",student name:"+object2.getName()
		+",student address:"+object2.getAddress()); 
		

		
	}

}
