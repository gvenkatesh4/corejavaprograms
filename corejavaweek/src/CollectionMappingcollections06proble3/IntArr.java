package CollectionMappingcollections06proble3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IntArr {

	public static void main(String[] args) {
		HashMap<Integer,Integer>map1= new HashMap<Integer,Integer>();
		int arr[]= {1,1,2,1,3,2,3,4,4,3,4,4,6};
		for(int element: arr)
		{   
			if(map1.containsKey(element)) {
				int value = map1.get(element);
						value++;
						map1.put(element,value);
			}else
						
							map1.put(element, 1);
			System.out.println(map1);
						

			
		}
		
		System.out.println("odd number of times occured elements:");
		for(Entry<Integer, Integer> entry:map1.entrySet()) {
			if(entry.getValue()%2!=0)
				System.out.println(entry.getKey());
		}
		
		

		
	}

}
