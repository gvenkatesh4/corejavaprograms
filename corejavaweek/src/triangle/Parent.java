package triangle;




class Parent {
	public Parent() {		
		System.out.println("Parent Constructor");		
	}
}


class Child extends Parent {

	Child(int i) {
		System.out.println("Child Constructor");		
	}
    
	public static void main(String[] args) {
		
		Parent p = new Child(3);

	}
}