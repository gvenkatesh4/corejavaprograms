package Indroducton;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class name objname=new classname();
		Mobile samsung = new Mobile();
		
		samsung.Rom = 16;
		samsung.Ram = 4;
		samsung.os="android";
		samsung.camera=15;
		samsung.battery=5000;
		samsung.processor=(float) 1.7;
		
		
		
		
		System.out.println("features:");
		System.out.println("samsung specufications");
		System.out.println("Ram:"+samsung.Ram);
		System.out.println("Rom:"+samsung.Rom);
	    System.out.println("os"+samsung.os);
	    System.out.println("camera"+samsung.camera);
	    System.out.println("battery"+samsung.battery);
	    System.out.println("processor"+samsung.processor);
	    

System.out.println("functions");
samsung.calling();
samsung.gaming();
samsung.chatting();


Mobile apple=new Mobile();
apple.Ram=8;
apple.Rom=64;
apple.os="ios 13.0";
apple.processor=18;
apple.battery=4000;
apple.camera=12;
System.out.println("apple specificatios");
System.out.println(apple.Ram);
System.out.println(apple.Rom);
System.out.println(apple.os);
System.out.println(apple.processor);
System.out.println(apple.battery);
System.out.println(apple.camera);
apple.calling();
apple.gaming();
apple.chatting();

	}

}
