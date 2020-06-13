package Sortingdatainlistemployee.sortingproductanditsprize;

import java.util.ArrayList;
import java.util.Collections;

public class pdetails {
	public static void main (String[] args) {
		Product obj = new Product("tv",12);
		Product obj1 = new Product("phone",1);
		Product obj2 = new Product("watch",12567);

		
		
		ArrayList<Product> productdata = new ArrayList();
		productdata.add(obj);
		productdata.add(obj1);
		productdata.add(obj2);
		//productdata.add(obj3);
		//productdata.add(obj4);

		for(Product e:productdata) {
			System.out.println(e);
		}
	
		Productcomparator p = new Productcomparator();
		Collections.sort(productdata,p);


		System.out.println("product----");
		for(Product e:productdata)
		{
			System.out.println(e);
		}
		
		Prizecomparator pri = new Prizecomparator();
		Collections.sort(productdata, pri);
		System.out.println("prise------");
		for(Product e:productdata)
		{
			System.out.println(e);
		}
		
		
}
}