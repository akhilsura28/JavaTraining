package exceptions_practise2;

import java.util.*;

public class ListOfProducts {

	public static void main(String[] args) throws InvalidProductException{
		
		Product p1 = new Product(1001 , 500 , 11000);
		Product p2 = new Product(1002 , 199 , 12000);
		Product p3 = new Product(1003 , 250 , 13000);
		Product p4 = new Product(1004 , 150 , 14000);
		Product p5 = new Product(1005 , 220 , 11500);
		Product p6 = new Product(1006 , 180 , 12500);
		Product p7 = new Product(1007 , 175 , 13500);
		Product p8 = new Product(1008 , 225 , 14500);
		Product p9 = new Product(1009 , 465 , 15000);
		Product p10 = new Product(1010 , 300 , 13000);
		
		Set<Product> productCollection = new HashSet<Product>();
		
		productCollection.add(p1);
		productCollection.add(p2);
		productCollection.add(p3);
		productCollection.add(p4);
		productCollection.add(p5);
		productCollection.add(p6);
		productCollection.add(p7);
		productCollection.add(p8);
		productCollection.add(p9);
		productCollection.add(p10);
		
		Iterator <Product> itr = productCollection.iterator();
		
		while(itr.hasNext()){
			
			Product p = itr.next();
		
			if(p.getWeight() < 200)
			try 
			{
				throw new InvalidProductException(p + " : product is Invalid ");
				
			}catch(InvalidProductException t){
				
				t.printStackTrace();
				itr.remove();	
			}			
		}
		
		for(Product p : productCollection){
			System.out.println(p);
		}
			
	}

}
