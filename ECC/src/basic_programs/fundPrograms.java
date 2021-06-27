package basic_programs;

public class fundPrograms {

	public static void main(String[] args) {

		//conditionalOperator();
		//testModuloOperator();


	
		
		
	}

	public static void conditionalOperator() {

		int a = 30, b = 40, c = 10;

		int x = (a > b) ? a : b;	

		System.out.println(x);	//40

		int y = (b > c) ? c : b;

		System.out.println(y); 	//10 

		int z = (a == b) ? b : a;

		System.out.println(z);	//30

	}

	public static void testModuloOperator() {

		double a = 23.5, b = 45.75, c = 10;

		double x = a % b;
		System.out.println(x); // 23.5

		double y = b % a;
		System.out.println(y); // 22.25

		double z = b % c;
		System.out.println(z); // 5.75

	}

}
