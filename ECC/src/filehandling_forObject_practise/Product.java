package filehandling_forObject_practise;

public class Product {

	private int id ;
	private String name;
	private int quantity;
	private int priceEach;
	
	public Product(int id, String name, int quantity, int priceEach) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.priceEach = priceEach;
	}
	
	public Product(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(int priceEach) {
		this.priceEach = priceEach;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", priceEach=" + priceEach + "]";
	}
		
}
