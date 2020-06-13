package StaticKeyword;

public class Mainclass {

	public static void main(String[] args) {
   Demo obj = new Demo();
   obj.i++;
   obj.j++;
   System.out.println("before increment");
   System.out.println(obj.i);
   System.out.println(obj.j);
   obj.i++;
   obj.j++;
   System.out.println("after increment");
   System.out.println(obj.i);
   System.out.println(obj.j);
   obj.method();
   System.out.println("-----------");
   Demo obj1=new Demo();
   obj1.i++;
   obj1.j++;
System.out.println(obj1.i);
System.out.println(obj1.j);
    
	}

}
