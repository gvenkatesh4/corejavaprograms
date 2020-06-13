package Exceptionconcept;


public class A implements Ans {
	
	private int num1;
	private int num2;
	
	A(){
		
	}
	A(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
		
	}
	protected void setnum1(int num1) {
		this.num1=num1;
	}
	protected int getnum1() {
		return num1;
	}
	protected void setnum2(int num2) {
		this.num2=num2;
	}
	protected int getnum2() {
		return num2;
	}
	
	public int solution() {  
		int result=0;
		try {
			result=num1/num2;
			
			
		}
		catch (ArithmeticException e) {
			System.out.println("it cannot be divide by zero");
			}
		
		return 0;
	}
	@Override
	public String toString() {
		return "A [num1=" + num1 + ", num2=" + num2 + ", solution()=" + solution() + "]";
	}

	
	
	
}
