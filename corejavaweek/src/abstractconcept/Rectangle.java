package abstractconcept;

public class Rectangle extends Shape{
	protected double width;
	protected  double length;
	
	  
	public Rectangle() {
		
	}
	
	public Rectangle(String Color,boolean filled,double width,double length) {
		super(Color,filled);
		this.width=width;
		this.length=length;
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	public double getArea()
	{
		
		return length*width;
	}
	public double getPerimeter() {
		
		return 2*(length+width);
	}
	@Override
	public String toString() {
		return super.toString()+ ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}
	
	
	
	
	
}
