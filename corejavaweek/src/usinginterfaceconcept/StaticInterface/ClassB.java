package usinginterfaceconcept.StaticInterface;

public class ClassB implements A{
	public int num;
	public String name1;
	ClassB(){
		
	}
	ClassB(int num,String name1){
		this.num=num;
		this.name1=name1;
	}
	protected void getnum() {
		this.num=num;
		
	}
	protected int num() {
		return num;
		
	}
	protected String getName() {
		return name1;
	}
	protected void setName(String name) {
		this.name1 = name;
	}
	public int number() {
		int a=num()*num()*num();
		return a;
	}
	@Override
	public String toString() {
		return "ClassB [name=" + name1 + ", number()=" + number() + "]";
	}
	

	
	
	
}
