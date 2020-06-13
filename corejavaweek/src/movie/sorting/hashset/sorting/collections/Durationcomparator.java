package movie.sorting.hashset.sorting.collections;

import java.util.Comparator;

public class Durationcomparator implements Comparator<Moviedata> {

	@Override
	public int compare(Moviedata o1, Moviedata o2) {
	if(o1.getDuration()<o2.getDuration())
		return -1;
	if(o1.getDuration()>o2.getDuration())
		return 1;
	else
		return 0;
	}

}
