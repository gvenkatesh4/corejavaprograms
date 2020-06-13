package movie.sorting.hashset.sorting.collections;

public class Moviedata {
private String Moviename;
private String Directorname;
private int Duration;
private float rating;
public Moviedata() {
	
}
public Moviedata(String Moviename,String Directorname,int Duration,
		float rating) {
	this.Moviename=Moviename;
	this.Directorname=Directorname;
	this.Duration=Duration;
	this.rating=rating;
}
	
	protected String getMoviename() {
		return Moviename;
	}
	protected void setMoviename(String moviename) {
		Moviename = moviename;
	}
	protected String getDirectorname() {
		return Directorname;
	}
	protected void setDirectorname(String directorname) {
		Directorname = directorname;
	}
	protected int getDuration() {
		return Duration;
	}
	protected void setDuration(int duration) {
		Duration = duration;
	}
	protected float getRating() {
		return rating;
	}
	protected void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Moviedata [Moviename=" + Moviename + ", Directorname=" + Directorname + ", Duration=" + Duration
				+ ", rating=" + rating + "]"+"\n";
	}
	
	
	
}
