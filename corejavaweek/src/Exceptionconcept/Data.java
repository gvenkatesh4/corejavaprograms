package Exceptionconcept;

public class Data {

	public static void main (String[] args)
	{
		int a=10;
		int b = 0;
	
	System.out.println(da(a,b));
	}
	public static int da(int a,int b) {
		int result=0;
		try {
			result = a/b;
		}
		catch(ArithmeticException e) {
			
			System.out.println("you cannot divide by zero");
			}
		
		
		
		return result;
		
	}
}
