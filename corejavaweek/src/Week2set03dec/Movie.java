package Week2set03dec;

public class Movie {

	public String name;
	public String director_name;
	public Float duration;
	public Float rating;

Movie(){
	
}
Movie(String name,String director_name,Float duration,Float rating){
	this.name=name;
	this.director_name=director_name;
	this.duration=duration;
	this.rating=rating;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDirector_name() {
	return director_name;
}
public void setDirector_name(String director_name) {
	this.director_name = director_name;
}
public Float getDuration() {
	return duration;
}
public void setDuration(Float duration) {
	this.duration = duration;
}
public Float getRating() {
	return rating;
}
public void setRating(Float rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "Moviedata [name=" + name + ", director_name=" + director_name + ", duration=" + duration + ", rating="
			+ rating + "]";

	
}
	
	
}
