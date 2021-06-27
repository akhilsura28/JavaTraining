package collections.list.cabcustomer.test;

import java.util.*;

public class CabCustomerService {

	private List<CabCustomer> customerList = new ArrayList<CabCustomer>();
	
	
	public void addCabCustomer(CabCustomer customer){
		
		customerList.add(customer);
		
		/*for(CabCustomer c : customerList){
			System.out.println(c);
		}*/
	}
	
	
	public boolean isFirstCustomer(CabCustomer customer){
		for(CabCustomer c : customerList){
			if(customer.getPhoneNumber() == c.getPhoneNumber())
				return false;
		}
		
		customerList.add(customer);		// stores the customer to prevent repetition//
		
		return true;
	}
	
	
	public double calculateBill(CabCustomer customer){
		if(isFirstCustomer(customer))
			return 0.0;
		
		if(customer.getDistance() <= 4)
			return 80.0;
		
		return 80 + (customer.getDistance()-4)*6;
	}
	
	
	public String printBill(CabCustomer customer){
		
		return customer.getCustomerName().toUpperCase() +" Please pay your bill of " + calculateBill(customer);
	}
	
	
	
}
