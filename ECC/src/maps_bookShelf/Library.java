package maps_bookShelf;

import java.util.*;

public class Library {

	public static void main(String[] args) {
		
		Book b1 = new Book(1001 , "TheMerchantOfVenice" , "Shakespeare");
		Book b2 = new Book(1002 , "AntonyAndCleopatra" , "Shakespeare");
		Book b3 = new Book(1003 , "MeinKampf" ,"AdolfHitler"); 
		Book b4 = new Book(1004 , "AliceInWonderLand" , "LewisCarrol");
		
		List <Book> bookInfo = new LinkedList <Book>();
		bookInfo.add(b1);
		bookInfo.add(b2);
		bookInfo.add(b3);
		bookInfo.add(b4);
		
		HashMap <Integer , Book > bookIndex = new HashMap <Integer , Book >();
		
		for(Book b : bookInfo){
			
			int id = b.getId();
			bookIndex.put(id, b);			
		}
			
		//bookIndex.clear();
		//System.out.println(bookIndex);
				
		System.out.println("**************************************************************");
		
		for(Map.Entry<Integer, Book> run : bookIndex.entrySet()){
			
			System.out.println(run);
		}
	}

}
