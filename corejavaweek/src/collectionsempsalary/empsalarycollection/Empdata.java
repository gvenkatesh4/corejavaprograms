package collectionsempsalary.empsalarycollection;

public class Empdata implements Comparable <Empdata> {
private int id=100;
private String name;
private long salary;
private static int idgenerator=100;
public Empdata()
{
	}
public Empdata(String name,long salary)
{
	id=idgenerator++;
	this.name=name;
	this.salary=salary;
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
protected long getSalary() {
	return salary;
}
protected void setSalary(long salary) {
	this.salary = salary;
}
protected static int getIdgenerator() {
	return idgenerator;
}
protected static void setIdgenerator(int idgenerator) {
	Empdata.idgenerator = idgenerator;
}
@Override
public String toString() {
	return "Empdata [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
@Override
public int compareTo(Empdata o) {
	// TODO Auto-generated method stub
	if(salary>o.getSalary())
		return 1;
	else if(salary<o.getSalary())
		return-1;
	return 0;
}

	
}
