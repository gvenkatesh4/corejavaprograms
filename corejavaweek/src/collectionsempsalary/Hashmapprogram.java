package collectionsempsalary;

import java.util.HashMap;
import java.util.Map;

public class Hashmapprogram {

public static void main(String[] args) {
	
	HashMap<Integer,String>hashmap = new HashMap<Integer,String>();
	
	hashmap.put(1,"apple");
	hashmap.put(2,"apple");
	
	
	for(Map.Entry<Integer, String>hash:hashmap.entrySet()) {
	System.out.println(hash);
	}
}
}
