package exceptions_practise1;

import java.util.*;

public class Orders {

	public static void main(String[] args) throws OrderNotFoundException{
		
		OrderDetails t1 = new OrderDetails("MRSH1200" ,1100 , 15000);
		OrderDetails t2 = new OrderDetails("MRSH1234" ,3500 , 11000);
		OrderDetails t3 = new OrderDetails("MRSH1299" ,5700 , 12000);
		OrderDetails t4 = new OrderDetails("MRSH1469" ,1400 , 13000);
		OrderDetails t5 = new OrderDetails("MRSH1350" ,2800 , 11500);
		
		HashMap <Integer , OrderDetails> mapOfOrders = new HashMap<Integer , OrderDetails>(); 
		
		mapOfOrders.put(t1.getOrderNo(), t1);
		mapOfOrders.put(t2.getOrderNo(), t2);
		mapOfOrders.put(t3.getOrderNo(), t3);
		mapOfOrders.put(t4.getOrderNo(), t4);
		mapOfOrders.put(t5.getOrderNo(), t5);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the OrderNo to be searched : ");
		
		int orderNo = sc.nextInt();
		
		if(mapOfOrders.containsKey(orderNo))
			System.out.println(mapOfOrders.get(orderNo));
		else
			throw new OrderNotFoundException("OrderNo "+ orderNo + " is not found ");
		

	}

}
