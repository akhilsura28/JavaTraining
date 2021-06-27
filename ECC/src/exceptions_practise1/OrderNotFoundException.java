package exceptions_practise1;

public class OrderNotFoundException extends Exception{

	public OrderNotFoundException(){
		super();
	}
	
	public OrderNotFoundException(String s){
		super(s);
	}
	
}
