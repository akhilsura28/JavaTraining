package inheritance;

public class Cricket {

	public static void main(String[] args) {
		
		Batsman bA1 = new Batsman(" K L Rahul " , 4000 , 859 , 40 , 28 , 5 , 14);
		
		Bowler bO1 = new Bowler(" Jaspreet Bumrah " , 99 , 1100);
		
		Batsman bA2 = new Batsman( " Rohit Sharma " , 7000 , 1400 , 50 , 37 , 7 , 15);
		
		System.out.println(bA1.getId() + bA1.getName());
		
		System.out.println(bO1.getId() + bO1.getName());
		
		System.out.println(bA2.getId() + bA2.getName());
		
		
	
	}

}
