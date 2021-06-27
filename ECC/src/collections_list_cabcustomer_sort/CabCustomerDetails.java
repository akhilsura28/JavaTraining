package collections_list_cabcustomer_sort;

import java.util.*;

public class CabCustomerDetails {

	public static void main(String args[]){
		
		CabCustomerParameters c1 = new CabCustomerParameters("Ravi","gachibowli","sainikpuri",7,9845632145l);
		
		CabCustomerParameters c2 = new CabCustomerParameters("Deepak","gachibowli","sainikpuri",7,7745632145l);
		
		CabCustomerParameters c3 = new CabCustomerParameters("Sandeep","Financial Dist","Kanapur",4,6745632145l);
		
		CabCustomerParameters c4 = new CabCustomerParameters("Charan","Hitech City","madhapur",9,8845655145l);
		
		CabCustomerParameters c5 = new CabCustomerParameters("Ayesha","gachibowli","sainikpuri",5,9745632145l);
		
		CabCustomerParameters c6 = new CabCustomerParameters("Snigdha","Tolichowki","sainikpuri",6,8845632145l);
		
		CabCustomerParameters c7 = new CabCustomerParameters("Rachana","Hitech City","Sec'bad",4,6845632145l);
		
		
//		ArrayList<CabCustomerParameters> CabCustomerList = new ArrayList<CabCustomerParameters>();
		
		LinkedList<CabCustomerParameters> CabCustomerList = new LinkedList<CabCustomerParameters>();
		
		CabCustomerList.add(c1);
		CabCustomerList.add(c2);
		CabCustomerList.add(c3);
		CabCustomerList.add(c4);
		CabCustomerList.add(c5);
		CabCustomerList.add(c6);
		CabCustomerList.add(c7);
		
		System.out.println("**********BEFORE SORTING********************************");
		
		for(CabCustomerParameters c : CabCustomerList){
			
			System.out.println(c);
		}

		System.out.println("***********AFTER SORTING********************************");
		
		Collections.sort(CabCustomerList);
		
		for(CabCustomerParameters c : CabCustomerList){
		
			System.out.println(c);
		}
		
		
	}
}
