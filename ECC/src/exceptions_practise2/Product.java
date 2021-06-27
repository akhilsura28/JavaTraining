package exceptions_practise2;

public class Product {

	public static void main(String[] args) {}

	private int id ;
	private double weight ;
	private double price ;
	
	public Product(){
		
	}
	
	public Product(int id, double weight, double price) {
		this.id = id;
		this.weight = weight;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
	}
		
}
