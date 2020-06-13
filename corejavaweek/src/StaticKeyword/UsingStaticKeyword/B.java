package StaticKeyword.UsingStaticKeyword;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println("--------");
		obj.i++;
		obj.j++;
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println("------------");
		obj.i++;
		obj.j++;
		System.out.println(obj.i);
		System.out.println(obj.j);
		

	}

}
