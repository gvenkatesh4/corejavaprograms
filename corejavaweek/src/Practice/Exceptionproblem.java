package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionproblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int num1;
		float s = 0.0f;
		num = scan.nextInt();
		num1=scan.nextInt();
		try {
			s =num/num1;
				
			
		}
		catch(InputMismatchException e) {
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
