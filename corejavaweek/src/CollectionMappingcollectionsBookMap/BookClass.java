package CollectionMappingcollectionsBookMap;

public class BookClass {
	private int id;
	private String name;
	private String author;
	private static int idgenerator=100;
	public BookClass(){
		
	}
public BookClass(String name,String author){
	id=idgenerator++;
	this.name=name;
	this.author=author;
}
protected int getId() {
	return id;
}
protected void setId(int id) {
	this.id = id;
}
protected String getName() {
	return name;
}
protected void setName(String name) {
	this.name = name;
}
protected String getAuthor() {
	return author;
}
protected void setAuthor(String author) {
	this.author = author;
}

@Override
public String toString() {
	return "BookClass [id=" + id + ", name=" + name + ", author=" + author + "]";
}


}
