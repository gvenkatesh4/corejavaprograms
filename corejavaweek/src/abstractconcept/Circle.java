package abstractconcept;

public  class Circle extends Shape {
	protected  double radius;
	
	public Circle()
	{
		
	}
	public Circle(double radius) {
		this.radius=radius;
		
	}
	
	public Circle(String Color,boolean filled,double radius) {
		super(Color,filled);
		this.radius=radius;
		
	}

	protected double getRadius() {
		return radius;
	}

	protected void setRadius(String color, double radius) {
		this.radius = radius;
	}
	
	public double getArea()
	{
		float pie=(float) 3.14;
	
		
		return pie*radius*radius;
		
	}
	public double getPerimeter() {
		float pie=(float) 3.14;
		
        return 2*pie*radius;
		
	}

	@Override
	public String toString() {
		return super.toString()+ ", getarea()=" + getArea() + ", getperimeter()="
				+ getPerimeter() + "]";
	}

	
}
