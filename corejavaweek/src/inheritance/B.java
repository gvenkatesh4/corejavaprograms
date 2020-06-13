package inheritance;

public class B extends A{
	
	private int j;
	
  B(int i,int j){
	  super(i);
	  this.j=j;
  }
	void method() {
		System.out.println("i="+getI());
		System.out.println("j="+j);
	}
	
}


	


