package corejavaexceptions;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age");
		int age = scan.nextInt();
		
		try {
			
			if(age<18)
			
				throw new Ageinvalidexception("Age must be greater than 18");
				else
					System.out.println("Eligible for voting");
		}
			catch(Ageinvalidexception a) {
				a.printStackTrace();
			}
		
		
		
	}	

}