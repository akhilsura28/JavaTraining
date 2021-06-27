package interfaces_practise_1;

public class ICICI implements Bank {

	private Customer customer ;
		
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	public ICICI(Customer customer){
		
	this.customer = customer ;	
	}
	
	
	@Override
	public double calcROI() {
		
		return (double)(customer.getGainFromInvestment()-customer.getCostOfInvestment())*100/customer.getCostOfInvestment();
	}
}
