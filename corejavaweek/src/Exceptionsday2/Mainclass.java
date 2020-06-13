package Exceptionsday2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Mainclass {

	public static void main(String[] args) throws IOException {
		Product obj= new Product(100,500);
		Product obj1= new Product(150,500);
		Product obj2= new Product(200,500);
		Product obj3= new Product(200,500);
		Product obj4= new Product(200,500);


		ArrayList<Product>t=new ArrayList<Product>();
		t.add(obj);
		t.add(obj1);
		t.add(obj2);
		t.add(obj3);
		t.add(obj4);
FileOutputStream tt = new FileOutputStream("layu.txt");		
		for(Product e:t)
		{
			System.out.println(e);
		}
		System.out.println("--------------");
		Iterator<Product> itr = t.iterator();
		while(itr.hasNext()) {
			Product i = itr.next();
		if(i.getWeight()<200) {
			itr.remove();
		
			
			try{
				
				throw new Datainvalid("weight must be greater");	
			}
			catch(Datainvalid a) {
				//System.out.println("give correct");
				a.printStackTrace();
			}
				
			for(Product e:t)
			{
				String s =e.toString();
				tt.write(s.getBytes());
				//System.out.println(e);
			}
			}
	}
}	
		
}
	


