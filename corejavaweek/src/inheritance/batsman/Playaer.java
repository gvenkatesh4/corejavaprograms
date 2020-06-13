package inheritance.batsman;

public class Playaer {
	private int  id=100;
	private String  name; 
	
	private static int idgenerator=100;
	public Playaer(){
		
	}
	public Playaer(String name) {
		id=idgenerator++;
		this.name=name;
		
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
	protected static int getIdgenerator() {
		return idgenerator;
	}
	protected static void setIdgenerator(int idgenerator) {
		Playaer.idgenerator = idgenerator;
	}
  public String toString() {
	  return "id"+id+"name"+name;
  }
}
