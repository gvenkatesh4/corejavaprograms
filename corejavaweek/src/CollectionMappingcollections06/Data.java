package CollectionMappingcollections06;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Data {

	public static void main(String[] args) {
		HashMap<Integer,String>product=new HashMap<Integer,String>();
		product.put(1, "Amazon");
		product.put(2,"Flipcart");
		product.put(3,"Google");
		product.put(4,"Oracle");
		product.put(6,"Oracle");

		product.put(5,"Adobe");
		System.out.println(product);
		
		
		TreeMap<Integer,String>company=new TreeMap<Integer,String>();
		company.putAll(product);
		System.out.println(company);
		
		for(Map.Entry<Integer, String> ee:company.entrySet()){
			System.out.println(ee);
		}
	}

}
