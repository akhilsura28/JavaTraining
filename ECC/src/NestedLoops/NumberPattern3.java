package NestedLoops;

public class NumberPattern3 {

	public static void main(String[] args) {


		for(int row = 1 ; row <= 4 ; row++){
			
			for(int col = 1 ; col <= row ; col++){
				
				System.out.print(row + " ");
			}
			
			System.out.println();
		}
		
	System.out.println("--------------------------------");
		
		for(int row = 1 ; row <= 7 ; row++){
			
			for(int col = 7 ; col >= row ; col--){
				
				System.out.print(col + " ");
			}
			
			System.out.println();
		}
		
	System.out.println("--------------------------------");	
	
		for(int row = 7 ; row > 0 ; row--){
			
			for(int col = 1 ; col <= row ; col++){
				
				System.out.print(col + " ");
				
			}
			
			System.out.println();
		}
		
	System.out.println("----------------------------------");	
		
		for(int row = 1 ; row <= 5 ; row++){
			
			for(int col = 1 ; col <= row ; col++){
				
				System.out.print(" * " + " ");
			}
			
			System.out.println();
		}
	}

}
