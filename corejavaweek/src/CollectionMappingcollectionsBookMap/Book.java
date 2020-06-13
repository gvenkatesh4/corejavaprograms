package CollectionMappingcollectionsBookMap;

import java.util.HashMap;
import java.util.Map;

public class Book {

	public static void main(String[] args) {
		
		BookClass b1 = new BookClass("infinite jest","David walves");
		BookClass b2 = new BookClass("Gulitravels","davidsa");
		BookClass b3 = new BookClass("frined","jacksyon");

		HashMap<Integer,BookClass>bookmap = new HashMap <Integer,BookClass>();
		bookmap.put(b1.getId(),b1);
		bookmap.put(b2.getId(),b2);
		bookmap.put(b3.getId(),b3);
		
		
		for(Map.Entry<Integer, BookClass> e :bookmap.entrySet()) {
			System.out.println(e.getKey()+ ": "+e.getValue());
	}

}
}
