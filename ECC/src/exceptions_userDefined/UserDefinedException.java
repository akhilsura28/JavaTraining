package exceptions_userDefined;

import java.util.Scanner;

public class UserDefinedException {

	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n >= 0)
			System.out.println("n = " + n);
		else{
			
			//throw new Exception("n cannot be negative "); (OR)
			
		Exception a = new Exception("n cannot be negative");
		throw a;
		}
	
		while(n <= 20){
			
			System.out.println(n);
			
			if(n > 10 && (n % 2 != 0 )){
				throw new Exception("n = " + n);
			}
			
			n++;
		}
	
	
	}	
}
