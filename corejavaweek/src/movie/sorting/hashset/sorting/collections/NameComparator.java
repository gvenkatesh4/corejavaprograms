package movie.sorting.hashset.sorting.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Moviedata> {

	@Override
	public int compare(Moviedata o1, Moviedata o2) {
		return o1.getMoviename().compareTo(o2.getMoviename());
	}

}
