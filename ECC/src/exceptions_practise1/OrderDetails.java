package exceptions_practise1;

public class OrderDetails {

	public static void main(String[] args) {}
	
	private int orderNo ;
	private String productCode ;
	private int quantityOrdered ;
	private double priceEach ;
	static int autoGen = 1000 ;
	
	public OrderDetails(){
		
	}
	
	public OrderDetails(String productCode, int quantityOrdered, double priceEach) {
		
		this.orderNo = autoGen ++;
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderNo=" + orderNo + ", productCode=" + productCode + ", quantityOrdered="
				+ quantityOrdered + ", priceEach=" + priceEach + "]";
	}
	
	
}
