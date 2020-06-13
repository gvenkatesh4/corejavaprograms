package Practice;

import java.util.Comparator;

public class Numcomparator implements Comparator<Arraylistindecendingorder>{


	

	@Override
	public int compare(Arraylistindecendingorder o1, Arraylistindecendingorder o2) {
		// TODO Auto-generated method stub
		if(o1.getA()<o2.getA())
			return 1;
		if(o1.getA()>o2.getA())
			return -1;
		else
			return 0;
				
	}

}
