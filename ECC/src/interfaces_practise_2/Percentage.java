package interfaces_practise_2;

public interface Percentage {

	
	public double findPercentage();
	
	
	public static double getHighestPercentage(double p1 , double p2){
		
		if(p1 > p2)
			return p1 ;
		
		return p2 ;
	}

	
		
}
