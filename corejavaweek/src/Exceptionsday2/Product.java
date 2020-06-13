package Exceptionsday2;

public class Product {
private int id = 100;
private int weight;
private int price;
private static int idgenerator=100;
 public Product() {
	 
 }
public Product(int weight,int price) {
	id=idgenerator++;
	this.weight=weight;
	this.price=price;
}
protected int getId() {
	return id;
}
protected void setId(int id) {
	this.id = id;
}
protected int getWeight() {
	return weight;
}
protected void setWeight(int weight) {
	this.weight = weight;
}
protected int getPrice() {
	return price;
}
protected void setPrice(int price) {
	this.price = price;
}
protected static int getIdgenerator() {
	return idgenerator;
}
protected static void setIdgenerator(int idgenerator) {
	Product.idgenerator = idgenerator;
}
@Override
public String toString() {
	return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]"+"\n";
}
	
}
