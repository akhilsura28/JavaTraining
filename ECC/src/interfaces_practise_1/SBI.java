package interfaces_practise_1;

public class SBI implements Bank {

	private Customer customer; // Customer class is used as data type to create
								// customer object //
	// customer object can access the instance variables in Customer class//

	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	public SBI( Customer customer) {

		this.customer = customer;
	}

	
	@Override
	public double calcROI() {
		
		return (customer.getGainFromInvestment()-customer.getCostOfInvestment())*100/ customer.getCostOfInvestment();
		
	}
	
	
	
}
