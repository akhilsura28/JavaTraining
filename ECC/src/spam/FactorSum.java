package spam;

public class FactorSum {

	public static void main(String[] args) {
		
		int num = 9;
		
		int i = 1;
		
		int sum = 0;

		while (i <= Math.sqrt(num)) {
			
			if (num % i == 0) {
				
				if (i == (num / i))
					sum += i;
				else
					sum += (i + num / i);
			}
			
			i++;
		}

		System.out.println("sum of factors: " + sum);
		
		System.out.println(Math.sqrt(num));
	}
}