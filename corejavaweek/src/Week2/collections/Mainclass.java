package Week2.collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import Week2.collections.Book;

public class Mainclass {

	public static void main(String[] args) {
		
		
		Book obj = new Book("jersey","arjun","livin");
		Book obj1 = new Book("jersey1","arjun","livin");
		Book obj2 = new Book("gfgff","afsf","ggr");
		Book obj3 = new Book("travels","erty","livin");
		
		LinkedList<Book>  booklist = new LinkedList<Book>();
		booklist.add(obj);
		booklist.add(obj1);
		booklist.add(obj2);
		booklist.add(obj3);
		
		for(Book b:booklist)
		//for(int i=0;i<booklist.size();i++)
		{
			//Book b = booklist.get(i);
			int count=0;
			for(Book d:booklist)
			//for(int j=0;j<booklist.size();j++)
			{
				//Book d=booklist.get(j);
				
				if(b.getPublisher().equalsIgnoreCase(d.getPublisher()))
					count++;
			}
			if(count>1)
				System.out.println(b);
				
		}
	}
	}


