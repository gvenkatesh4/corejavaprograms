package CollectionMappingcollections06;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		HashMap<Integer,String>map1= new HashMap<Integer,String>();
		map1.put(0, "India");
		map1.put(-1, "Usa");
		map1.put(2, "Uk");
		map1.put(3, "Canada");
		map1.put(1, "Aus");
		map1.put(1, "Ausa");

		System.out.println(map1);
		
		TreeMap<Integer,String> map2 = new TreeMap<Integer,String>();
		map2.putAll(map1);
		System.out.println(map2);
		
		System.out.println(map2.containsKey(0));
		System.out.println(map2.containsValue("India"));
		System.out.println(map2.get(2));
		
		for(Map.Entry<Integer, String>e :map2.entrySet()) {
			System.out.println(e.getKey()+ "= "+e.getValue());
			//System.out.println(e);
		
		}
				
		
		
		
	}

}
