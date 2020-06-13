package Indroducton.Areaandperimeter;

public class Circle {

	private float radius;
	 private float pi=3.14f;
	 
	 protected void setradius(float r) {
		radius=r;
		// 		this.radius=radius;

	}
	 protected float getradius() {
		 return radius;
	 }
	 protected float pi() {
		 return pi;
	 }

	public double  Areaofcircle()
	{
		System.out.println("area of circle");
		return pi*radius*radius;
	}
	public double Perimeterofcircle()
	{
		System.out.println("perimeter of circle");
		return 2*pi*radius;
	}
}
