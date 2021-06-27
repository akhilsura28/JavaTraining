package string_progams;

public class smallToUppercase {

	public static void main(String[] args) {


		String quote = "Doday is dhe besd day of the resd of my life";
		
		String[] parts = quote.split(" ");
		
		String text  ;
		
		text = quote.replace("D", "T");
		
		text = quote.replace("d", "t");
		
		
		
		
		System.out.println(quote.toUpperCase());
		
		System.out.println(text);
		
		System.out.println(quote.length());

		
		System.out.println("Number of parts :"+ parts.length);
	}

}
