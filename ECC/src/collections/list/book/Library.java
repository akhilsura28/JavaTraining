package collections.list.book;

import java.util.*;

public class Library {

	public static void main(String[] args) {
		
		List<Book> bookList = new LinkedList<Book>();
		
		bookList.add(new Book("TheSelfishGene","RichardDawkins","Oxford","NonFiction"));
		bookList.add(new Book("Romeo&Juliet","CarlSagan","McGrawHill","Fiction"));
		bookList.add(new Book("TheBlueUmbrella","RuskinBond","Oxford","Fiction"));
		bookList.add(new Book("Cosmos","CarlSagan","Pearson","NonFiction"));
		bookList.add(new Book("Meditations","MarcusAurilius","McGrawHill","NonFiction"));
		bookList.add(new Book("TheOdyssy","RichardDawkins","Pearson","Fiction"));
		bookList.add(new Book("Hemingway","MarcusAurilius","Oxford","Fiction"));
		
		List<String> authorList = new LinkedList<String>();

		for (Book b : bookList) {
			String authorName = b.getAuthor();
			String books = "";

			if (!authorList.contains(authorName)) {
				authorList.add(authorName);

				for (Book b2 : bookList) {

					if (authorName.equals(b2.getAuthor())) {
						books += b2.getbName() + "\n";

					}
				}

				System.out.println("Books Written By Author : " + authorName);
				System.out.println(books);
				System.out.println("*****************************************");

			}
		}
		
		System.out.println("---------------------------------------------------------");
		
		List<String> publisherList = new LinkedList<String>();
		
		for(Book b : bookList){
			String publisherName = b.getPublisher();
			String books = "" ;
			
			if(!publisherList.contains(publisherName)){
				publisherList.add(publisherName);
				
				for(Book b2 : bookList){
				
					if(publisherName.equalsIgnoreCase(b2.getPublisher())){
						books += b2.getbName() + "\n";
					}
					
				}
				
				System.out.println("Books by Publisher : " + publisherName );
				System.out.println(books);
				System.out.println("******************************************");
			}
		}
		
	
		System.out.println("--------------------------------------------------------------");
		
		List<String> zonerList = new ArrayList<String>();
		
		for(Book b : bookList){
			String zonerName = b.getZoner();
			String books = "";
			
			if(!zonerList.contains(zonerName)){
				zonerList.add(zonerName);
				
				for(Book b2 : bookList){
					
					if(zonerName.equalsIgnoreCase(b2.getZoner())){
						books += b2.getbName() + "\n";
					}
				}
				
				System.out.println("Books by Zoner : " + zonerName);
				System.out.println(books);
				System.out.println("*********************************************");
			}
		}
		
		
		
	}

}
