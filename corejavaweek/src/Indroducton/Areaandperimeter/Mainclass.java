package Indroducton.Areaandperimeter;

public class Mainclass {

	public static void main(String[] args) {
		
		Circle obj = new Circle();
		//obj.radius=10;
		obj.setradius(4.5f);
		System.out.println(obj.getradius());
		
		System.out.println(obj.Areaofcircle());
		System.out.println(obj.Perimeterofcircle());
		
		

	}

}
