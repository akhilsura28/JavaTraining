package array_programs;

public class ArraySquares {

	public static void main(String[] args) {
		
		int[] arr = {44,55,66,77,88} ;
			
		int[] newArray = squareTheNums(arr) ;
		
		for(int num : newArray)
			
		System.out.println(num);
		
	}
	
	
	public static int[] squareTheNums(int[] arr){
		
		int[]arrayOfSquares =  new int[arr.length];
		
		int i = 0 ;
		
		for(int num : arr){
			
			num = arr[i]* arr[i];
			
			arrayOfSquares[i] = num ;
			
			i++ ;
		}
		
		
		return arrayOfSquares ;
				
	}


}
