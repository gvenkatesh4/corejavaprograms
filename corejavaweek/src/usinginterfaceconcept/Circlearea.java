package usinginterfaceconcept;

public class Circlearea implements Area {
	
	private float pie=(float) 3.14;
	private float radius;
	
	public Circlearea()
	{
		
	}
	public Circlearea(float radius)
	{
		//this.pie=pie;
		this.radius=radius;
	}
	protected float getPie() {
		return pie;
	}
	protected void setPie(float pie) {
		this.pie = pie;
	}
	protected float getRadius() {
		return radius;
	}
	protected void setRadius(float radius) {
		this.radius = radius;
	}
	public float Areaof() {
		return pie*radius*radius;
	}
	@Override
	public String toString() {
		return "area of circle"+Areaof();
	}
	
	
	
	
}
