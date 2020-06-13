package movie.sorting.hashset.sorting.collections.moviehashset;

import java.util.Comparator;

public class Duration implements Comparator<Moviesda> {

	@Override
	public int compare(Moviesda o1, Moviesda o2) {
		// TODO Auto-generated method stub
		if(o1.getDuration()<o2.getDuration())
			return-1;
		if(o1.getDuration()>o2.getDuration())
			return 1;
		else
		return 0 ;
	}

}
