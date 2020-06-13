package movie.sorting.hashset.sorting.collections;

import java.util.Comparator;

public class Directcomparator implements Comparator<Moviedata> {

	@Override
	public int compare(Moviedata o1, Moviedata o2) {
		// TODO Auto-generated method stub
		
		return o1.getDirectorname().compareTo(o2.getDirectorname());
	}

}
