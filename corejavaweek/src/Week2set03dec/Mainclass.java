package Week2set03dec;

import java.util.HashSet;

public class Mainclass {
public static void main(String[] args) {
	Movie obj = new Movie("sahoo","sujeeth",2.50f,3.5f);
	HashSet<Movie>obj1=new HashSet<Movie>();
	obj1.add(obj);
	System.out.println(obj);
	
}
}
