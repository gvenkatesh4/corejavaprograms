package CollectionMappingcollections06;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Baicdemo {

	public static void main(String[] args) {
		HashMap<Integer,String>ab=new HashMap<Integer,String>();
		ab.put(1,"india");
		ab.put(2,"canada");
		ab.put(3,"Usa");
		ab.put(0,"uk");
		ab.put(5,"aus");
		ab.put(5,"aust");
		
		
		System.out.println(ab);
		TreeMap<Integer,String>abc=new TreeMap<Integer,String>();
		abc.putAll(ab);
		System.out.println(abc.containsKey(0));
		System.out.println(abc.containsKey(1));
		System.out.println(abc.containsValue("india"));
		System.out.println(abc.containsValue("india"));
		for(Map.Entry<Integer, String>d:abc.entrySet())
	 {
			System.out.println(d);
		}
																								
		
	}

}
