package triangle;

class Democlass {
	
	private int id=100;
	private int side1;
	private int side2;
	private int side3;
	
	private static int idgenerator=100;
	 Democlass(){
		
		
	}
	 Democlass(int side1,int side2,int side3) {
		id=idgenerator++;
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	 }	
	
	
	protected void setSide1(int side1) {
		this.side1 = side1;
	}
	protected int Side1() {
		return side1;
	}
	
	protected void setSide2(int s) {
		this.side2 = s;
	}
	protected int Side2() {
		return side2;
	}
	
	protected void setSide3(int t) {
		this.side3 = t;
	}
	protected int Side3() {
		return side3;
	}
	
	
	public double totalarea() {
		int s=(side1+side2+side3)/2;
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return  area;
	}
	
		
		 public String toString() {
         	return "id:"+id+" sides:"+side1+","+side2+","+side3+","+"area="+totalarea();
         }
	
}


