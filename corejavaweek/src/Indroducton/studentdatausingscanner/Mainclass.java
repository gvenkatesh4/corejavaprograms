package Indroducton.studentdatausingscanner;

import java.util.Scanner;


public class Mainclass {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		Studentdata stude = new Studentdata();
	
		System.out.println("enter the three subject markes");
		stude.id=scan.nextInt();
		stude.sub1=scan.nextInt();
		stude.sub2=scan.nextInt();
		stude.sub3=scan.nextInt();
		
		
		
		System.out.println(stude.id);
		System.out.println(stude.name);
		System.out.println("total marks"+stude.marks());
		System.out.println("percentage"+stude.percentage());

	}

}
