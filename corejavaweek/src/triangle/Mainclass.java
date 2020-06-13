package triangle;

public class Mainclass {

	public static void main(String[] args) {
		Democlass obj = new Democlass(1,12,13);
		Democlass obj1= new Democlass(10,14,15);
		Democlass obj2=new Democlass(8,15,17);
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		
		Democlass p = compare(obj,obj1);
		p = compare(p,obj2);
		
		System.out.println("lowest percentage"+p);
		
	}

	private static Democlass compare(Democlass obj, Democlass obj1) {
		if(obj.totalarea()<obj1.totalarea())
			return obj;
		else
		return obj1;

	}
}
