package Collection.basics;

import java.util.ArrayList;

public class ConvertArraylisttoarray {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("saibaba");
		a.add("shirdi");
		//int a[] = new int[5];
//Arraylist to array conversion
		String array[]=new String[a.size()];
		for(int j=0;j<a.size();j++)
		{
			array[j]=a.get(j);
		}
		//Displaying Arraying elements 
		for(String abc:a) {
			System.out.println(abc);
		}
		
	}

}
