package Exceptionconcept1;

import java.util.Scanner;

public class p {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num;
		num= scan.nextInt();
		try {
			if(num<18||num>80)
			//while(num%2==0) 
			
			
				throw new Validex("it is not correct");
				else
					System.out.println("it is correct");
	
		}
		catch(Exception e) {
		//System.out.println("jjr");
		e.printStackTrace();
	}
		finally{
			System.out.println(num);
		}
	}
}
