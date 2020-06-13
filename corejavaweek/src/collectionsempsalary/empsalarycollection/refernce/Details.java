package collectionsempsalary.empsalarycollection.refernce;

public class Details {
	private int id=100;
	private String product;
	private long price;
	
	private static int idgenerator=100;
	Details()
	{
		
	}
	Details(String product,long price){
		id=idgenerator++;
		this.price=price;
		this.product=product;
	}
	
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getProduct() {
		return product;
	}
	protected void setProduct(String product) {
		this.product = product;
	}
	protected long getPrice() {
		return price;
	}
	protected void setPrice(long price) {
		this.price = price;
	}
	protected static int getIdgenerator() {
		return idgenerator;
	}
	protected static void setIdgenerator(int idgenerator) {
		Details.idgenerator = idgenerator;
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", product=" + product + ", price=" + price + "]";
	}
}
