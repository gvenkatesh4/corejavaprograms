package Practice;

import java.util.ArrayList;

public class ArrayusingString {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		
		String arr[]=new String[a.size()];
		
		for(int j=0;j<a.size();j++)
		{
			arr[j]=a.get(j);
			}
				for(String abc:a){
				System.out.println(abc);
			}
}

}
