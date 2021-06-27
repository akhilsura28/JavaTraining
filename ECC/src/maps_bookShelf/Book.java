package maps_bookShelf;

public class Book {

	private int id ;
	private String bookName , author ;
	
	public Book(){
		
	}
	
	public Book(int id, String bookName, String author) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return bookName;
	}

	public void setName(String name) {
		this.bookName = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id= " + id + ", bookName= " + bookName + ", author= " + author + "]";
	}
	
	
	
	
}
