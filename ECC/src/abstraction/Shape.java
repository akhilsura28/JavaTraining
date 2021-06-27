package abstraction;

public abstract class Shape {

/*	public static void main(String[] args) {
														//THESE LINES ARE USED FOR DISPLAY CONSOLE
	}*/

	
	private String color ;
	private boolean isFilled ;							//THESE ARE THE COMMON PARAMETERS FOR BOTH CIRCLE AND RECTANGLE
	
	/////////////////////////////////////////////////
	
	public abstract double getArea();
														//THESE METHODS ARE BEING RE USED IN CIRCLE AND RECTANGLE
	public abstract double getPerimeter();
	
	/////////////////////////////////////////////////
	
	public Shape(){
		
	}
	
														//THESE METHODS ARE COMMONLY USED BY BOTH CIRCLE AND
	public Shape(String color , boolean isFilled){		//RECTANGLE CLASSES FOR ASSIGNING
		this.color = color;
		this.isFilled = isFilled ;	
	}

	//////////////////////////////////////////////////
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	///////////////////////////////////////////////////
	
	public String toString(){							//THIS METHOD COMMONLY RETURNS BOTH THE VARIABLES FOR
														//CIRLE AND RECTANGLE CLASSES AS BOTH EXTEND THE shape() class
		return " color = " + color + " is Filled = " + isFilled ; 
	}
	
	////////////////////////////////////////////////////	
}
