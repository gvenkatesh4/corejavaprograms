package CollectionMappingcollections06proble3;

import java.util.HashMap;
import java.util.Map.Entry;

public class Arrayele {

	public static void main(String[] args) {
		HashMap<Integer,Integer>q=new HashMap<Integer,Integer>();
		int w[]= {1,1,2,1,3,2,3,4,4,3,4,4,6};
		for(int element:w)
		{
		      if(q.containsKey(w))
		      {
		    	  int va=q.get(element);
		                 va++;
		                 q.put(element, va);

		      }else
		    	  q.put(element,1);
		      System.out.println(q);
		}
		
		System.out.println("------------");
		for(Entry<Integer, Integer> entry1:q.entrySet()) {
			if(entry1.getValue()%2!=0)
				System.out.println(entry1.getKey());
		
		
	}

	}
}
