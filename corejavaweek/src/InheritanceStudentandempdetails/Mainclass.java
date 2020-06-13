package InheritanceStudentandempdetails;

public class Mainclass {

	public static void main(String[] args) {
		Student obj=new Student("venkatesh","hyd","cse",2019,60000);
		Student objj=new Student("manish","hyd","cse",2019,70000);
		Student objjj=new Student("prashanth","hyd","cse",2019,80000);

		Staff   obj1=new Staff("dhoni","hyd","hps",80000);
		Staff   objj1=new Staff("yeswanth","hyd","oakridge",800000);
		Staff   objjj1=new Staff("karthik","hyd","virtusa",8000000);

		
		System.out.println(obj);
		System.out.println(objj);
		System.out.println(objjj);
		System.out.println(objj1);
		System.out.println(objjj1);

		System.out.println(obj1);
	}

}
