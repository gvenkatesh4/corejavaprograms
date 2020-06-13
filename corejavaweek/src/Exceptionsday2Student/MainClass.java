package Exceptionsday2Student;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		Student obj = new Student(null,null);
		Student obj1 = new Student("karthik","hyd.malkajgiri");
		Student obj2 = new Student("karthik","hyd.malkajgiri");
		Student obj3 = new Student("karthik","hyd.malkajgiri");
		Student obj4 = new Student("karthik","hyd.malkajgiri");
		Student obj5 = new Student("karthik","hyd.malkajgiri");
		Student obj6 = new Student("karthik","hyd.malkajgiri");
		Student obj7 = new Student("kar","hyd.malkajgiri");
		Student obj8 = new Student(null,"hyd.malkajgiri");
		Student obj9 = new Student("karthik",null);

		
		ArrayList<Student>h=new ArrayList();
		h.add(obj);
		h.add(obj1);
		h.add(obj2);
		h.add(obj3);
		h.add(obj4);
		h.add(obj5);
		h.add(obj6);
		h.add(obj7);
		h.add(obj8);
		h.add(obj9);

		for(Student data:h) {
			System.out.println(data);
		}
		Iterator<Student>it=h.iterator();
		while(it.hasNext()) {
			Student i=it.next();
			if(i.getAddress()==null||i.getName()==null) {
				it.remove();
				try {
					throw new Detailsinvalid("Student details not found exception");
					
						}
				catch(Detailsinvalid y)
				{
					System.out.println("not found");
					y.printStackTrace();
				}
				System.out.println("--------------");
				for(Student data:h) {
					System.out.println(data);
				}
				
			}
		}
		
	}}

