package Indroducton.cal;
//import java.util.Scanner;
public class calmethods {
	int num1;
	int num2;
	int num3;
	public calmethods(int num1,int num2,int num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
		protected void setnum1(int num1) {
	   		this.num1 = num1;
	   	}
		protected int getnum1() {
	   		return num1;
	   	}	
		protected void setnum2(int num2) {
	   		this.num2 = num2;
	   	}
		protected int getnum2() {
	   		return num2;
	   	}
		protected void setnum3(int num3) {
			this.num3=num3;
		}
		protected int  getnum3() {
			return num3;
			
		}
		protected int addition() {
			return num1+num2+num3;
		}
		public String toString() {
			return "num1="+num1+"num2="+num2+"num3="+num3+"addition of three numbers"+addition();
		}
	}
	


