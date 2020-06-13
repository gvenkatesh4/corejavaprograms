package Constructorss;

public class Demo {
	
	Demo(){
		this(10);
		
		System.out.println("default constructor");
	}
	Demo(int i){
	//this();
	
		System.out.println("i="+i);
	}
	Demo(float i){
	this(10);
	
		System.out.println("i="+i);
	}

	}


