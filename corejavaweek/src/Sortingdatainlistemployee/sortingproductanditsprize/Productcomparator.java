package Sortingdatainlistemployee.sortingproductanditsprize;
import java.util.Collections;

import java.util.Comparator;

public class Productcomparator implements Comparator<Product> {

	
	public int compare(Product o1, Product o2) {
		return o1.getproducts().compareTo(o2.getproducts());
	}

}
