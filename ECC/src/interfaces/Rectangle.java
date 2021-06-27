package interfaces;

public class Rectangle implements Shape{

	
	private float length , breadth ;
	
/////////////////////////////////////////////////	
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
/////////////////////////////////////////////////
	
	public double getArea(){
		
		return length*breadth ;
	}
	
	public double getPerimeter(){
		
		return 2*(length + breadth);
		
	}

//////////////////////////////////////////////////	
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
///////////////////////////////////////////////////	

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", Area =" + getArea() + ", Perimeter ="
				+ getPerimeter() + "]";
	}
	
	
	
}
