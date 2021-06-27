package polymorphism;

public class OverLoadedMethodsMain {

	public static void main(String[] args) {
		
		OverLoadedMethodsTemplate o1 = new OverLoadedMethodsTemplate();
		
		o1.add(6);
		
		System.out.println("------------------------");
		
		o1.add(5.6f);
		
		System.out.println(o1.add(2.2f, 4.7f));
		
		o1.add("Mystic", 70.3f);

	}

}
