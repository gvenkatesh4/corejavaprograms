package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Collset {

	public static void main(String[] args) {
			
			TreeSet<Integer> obj = new TreeSet();
			obj.add(10);
			obj.add(20);
			obj.add(30);
			obj.add(10);
			obj.add(10);

			
			for(Integer e: obj)
			{
				System.out.println(e);
			}
	}
}/*Iterator itr=obj.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}*/	


