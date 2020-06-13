package corejavaexceptionsarraymarksdataofstudent1111;

import java.util.ArrayList;


public class A {
private int sub1;
private int sub2;
private int sub3;

  public A() {
	  
  }
public A(int sub1,int sub2,int sub3) {
	this.sub1=sub1;
	this.sub2=sub2;
	this.sub3=sub3;
	
}
protected int getSub1() {
	return sub1;
}
protected void setSub1(int sub1) {
	this.sub1 = sub1;
}
protected int getSub2() {
	return sub2;
}
protected void setSub2(int sub2) {
	this.sub2 = sub2;
}
protected int getSub3() {
	return sub3;
}
protected void setSub3(int sub3) {
	this.sub3 = sub3;
}

	//A t = new A(50,56,9);
	//ArrayList<A> emp = new ArrayList<A>();
	//emp.add(t);
	
	float value = ((sub1+sub2+sub3/300)*100);
	{
	try {
			if(sub1<35||sub2<35||sub3<35) {
				throw new Marksnotvalid("enter greater then 35");

			}
			else
				System.out.println("you are passed in subject");
		
	}

catch(Marksnotvalid a) {
	
	a.printStackTrace();
}
	finally {
		System.out.println("percentage is"+value);
	}


}
}







	

