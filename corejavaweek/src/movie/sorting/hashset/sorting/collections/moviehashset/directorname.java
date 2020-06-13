package movie.sorting.hashset.sorting.collections.moviehashset;

import java.util.Comparator;

public class directorname implements Comparator<Moviesda>{

	@Override
	public int compare(Moviesda o1, Moviesda o2) {
		// TODO Auto-generated method stub
		return o1.getDirectorname().compareTo(o2.getDirectorname());
	}

}
