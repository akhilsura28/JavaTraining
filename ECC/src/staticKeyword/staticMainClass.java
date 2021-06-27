package staticKeyword;

public class staticMainClass {

	public static void main(String[] args) {
		
		staticDemoTemplate s1 = new staticDemoTemplate();

		s1.calculation();

		staticDemoTemplate s2 = new staticDemoTemplate();

		s2.calculation();
		
		
		staticDemoTemplate.y = 10;
		
		System.out.println(staticDemoTemplate.y);
		
		staticDemoTemplate s3 = new staticDemoTemplate();
		s3.calculation();

	}

}
