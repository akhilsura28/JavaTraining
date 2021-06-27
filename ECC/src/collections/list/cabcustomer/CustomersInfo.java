package collections.list.cabcustomer;

import java.util.*;

public class CustomersInfo {

	public static void main(String[] args) {
		
		CabCustomer c1 = new CabCustomer("Ravi","gachibowli","sainikpuri",7,9845632145l);
		
		CabCustomer c2 = new CabCustomer("Deepak","gachibowli","sainikpuri",7,7745632145l);
		
		CabCustomer c3 = new CabCustomer("Sandeep","Financial Dist","Kanapur",4,6745632145l);
		
		CabCustomer c4 = new CabCustomer("Charan","Hitech City","madhapur",9,8845655145l);
		
		CabCustomer c5 = new CabCustomer("Ayesha","gachibowli","sainikpuri",5,9745632145l);
		
		CabCustomer c6 = new CabCustomer("Snigdha","Tolichowki","sainikpuri",6,8845632145l);
		
		CabCustomer c7 = new CabCustomer("Rachana","Hitech City","Sec'bad",4,6845632145l);
		
		
		LinkedList<CabCustomer> CabCustomerList = new LinkedList<CabCustomer>();
		
		CabCustomerList.add(c1);
		CabCustomerList.add(c2);
		CabCustomerList.add(c3);
		CabCustomerList.add(c4);
		CabCustomerList.add(c5);
		CabCustomerList.add(c6);
		CabCustomerList.add(c7);
		
		
		for(CabCustomer eachCustomer : CabCustomerList){
			if(eachCustomer.getDistance() > 5)
			System.out.println(eachCustomer.getName());
		}
		
		
		
		
	}

}
