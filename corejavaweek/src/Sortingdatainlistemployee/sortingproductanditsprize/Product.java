package Sortingdatainlistemployee.sortingproductanditsprize;

public class Product {
	private int id=100;
	private String products;
	private int prise;
	private static int idgenerator=100;
	public Product() {
		
	}
public Product(String products,int prise) {
	id=idgenerator++;
	this.products=products;
	this.prise=prise;
}
protected int getId() {
	return id;
}
protected void setId(int id) {
	this.id = id;
}
protected String getproducts() {
	return products;
}
protected void setproducts(String products) {
	this.products = products;
}
protected int getPrise() {
	return prise;
}
protected void setPrise(int prise) {
	this.prise = prise;
}
protected static int getIdgenerator() {
	return idgenerator;
}
protected static void setIdgenerator(int idgenerator) {
	Product.idgenerator = idgenerator;
}
@Override
public String toString() {
	return "Products [id=" + id + ", product=" + products + ", prise=" + prise + "]";
}

}
