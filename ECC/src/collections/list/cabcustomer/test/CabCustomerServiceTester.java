package collections.list.cabcustomer.test;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		
		
		CabCustomer c1 = new CabCustomer(101,"Ravi","gachibowli","sainikpuri",7,9845632145d);
		
		CabCustomer c2 = new CabCustomer(102,"Deepak","gachibowli","sainikpuri",7,7745632145d);
		
		CabCustomer c3 = new CabCustomer(103,"Sandeep","Financial Dist","Kanapur",4, 9775632145d);
		
		CabCustomer c4 = new CabCustomer(104,"Charan","Hitech City","madhapur",9,8845655145d);
		
		CabCustomer c5 = new CabCustomer(105,"Ayesha","gachibowli","sainikpuri",5, 9745632145d);
		
		CabCustomer c6 = new CabCustomer(106,"Snigdha","Tolichowki","sainikpuri",6,8845632145d);
		
		CabCustomer c7 = new CabCustomer(107,"Rachana","Hitech City","Sec'bad",4,6845632145d);
		
		
		CabCustomerService service = new CabCustomerService();
		
		service.addCabCustomer(c1);
		service.addCabCustomer(c3);
		
		System.out.println(service.printBill(c1));
		
		System.out.println(service.printBill(c2));
		
		System.out.println(service.printBill(c3));
		
		System.out.println(service.printBill(c2));
		

	}

	
	
}
