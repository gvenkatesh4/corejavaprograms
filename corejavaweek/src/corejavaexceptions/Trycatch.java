package corejavaexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the numbers");
		//int n1=scan.nextInt();
		//int n2 = scan.nextInt();
		int n1;
		int n2;
		float s =0.0f;
		try {
			//s=n1/n2;
			 n1=scan.nextInt();
			 n2 = scan.nextInt();
			s = n1/n2;
			int a[] = new int[1];
			
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("you cannot divide");
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println(s);
		}
	}

}
