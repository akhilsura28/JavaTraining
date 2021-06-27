package collections.list.book;

public class Book {

	private String bName , author , publisher , zoner ;

	public Book(){}
	
	public Book(String bName, String author, String publisher, String zoner) {
		this.bName = bName;
		this.author = author;
		this.publisher = publisher;
		this.zoner = zoner;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getZoner() {
		return zoner;
	}

	public void setZoner(String zoner) {
		this.zoner = zoner;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bName + ", author=" + author + ", publisher=" + publisher + ", zoner=" + zoner + "]";
	}
	
	
	
}
