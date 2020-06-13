package inheritance;

public class A {

		 private int i;
		 A(){
			System.out.println("default constructor"); 
		 }
		 A(int i){
			 this.i=i;
			 
		 }
		protected int getI() {
			return i;
		}
		protected void setI(int i) {
			this.i = i;
		}
		
	}


