package Mocktest7dec2019;

import java.util.Scanner;

public class Paranthasisproblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		s=scan.nextLine();
		 char c;
		 int count=0;
		 int pcount=0;
		 for(int i=0;i<s.length();i++) {
			 c=	s.charAt(i);
		 if(c=='{'||c=='(')
			 {
				 count++;
			 }
			 else if(c=='}'||c==')')
			 {
				 pcount++;
			 }
			 if(count==pcount)
			 
				 System.out.println("it is correct paranrhases");
			 else
				 System.out.println("it is not correct");
			 
		 }
	}

}
