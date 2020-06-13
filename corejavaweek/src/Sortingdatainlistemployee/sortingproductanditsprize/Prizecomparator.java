package Sortingdatainlistemployee.sortingproductanditsprize;
import java.util.Collections;

import java.util.Comparator;

public class Prizecomparator implements Comparator<Product> {

	

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getPrise()<o2.getPrise())
			
		
			return-1;
		if(o1.getPrise()>o2.getPrise())
			
				return 1;
		else
		return 0;
	}

}
