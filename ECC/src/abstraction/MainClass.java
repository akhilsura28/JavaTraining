package abstraction;

public class MainClass {

	public static void main(String[] args) {
		
		Circle c1 = new Circle("Blue", true , 2.3f);
		
		System.out.println(c1);

		Rectangle r1 = new Rectangle("Indigo", false , 34.56 , 12.89);
		
		System.out.println(r1);
	}

}
