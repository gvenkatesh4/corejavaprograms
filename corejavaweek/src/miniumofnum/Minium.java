package miniumofnum;

public class Minium {
	private int id=100;
	 private int num1;
	private int num2;
	private int num3;
	
private static int idgenerator=100;


 Minium() {
	
}
 Minium(int num1,int num2,int num3) {
	 id=idgenerator++;
	this.num1=num1;
	this.num2=num2;
	this.num3=num3;
	
}
 
protected void setNum1(int num1) {
	this.num1 = num1;
}
protected int Num1() {
	return num1;
}

protected void setNum2(int num2) {
	this.num2 = num2;
}
protected int Num2() {
	return num2;
}

protected void setNum3(int num3) {
	this.num3 = num3;
}
protected int Num3() {
	return num3;
}

public String tostring() {
   return "numbers"+id+num1+num2+num3;
}
}