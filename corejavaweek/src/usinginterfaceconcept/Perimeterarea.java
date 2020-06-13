package usinginterfaceconcept;

public class Perimeterarea implements Area {
	private float length;
	private float breadth;

	public Perimeterarea()
	{
		
	}
	public Perimeterarea(float length,float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	protected float getLength() {
		return length;
	}
	protected void setLength(float length) {
		this.length = length;
	}
	protected float getBreadth() {
		return breadth;
	}
	protected void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public float Areaof() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	public String toString() {
		return "area of rectangle"+Areaof();
	}
	
	
	
}
