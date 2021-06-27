package abstraction;

import java.text.DecimalFormat;

public class Rectangle extends Shape {

	private double length ;
	private double breadth ;
	
	////////////////////////////////////////////
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	//////////////////////////////////////////////
	
	@Override
	public double getArea() {
		
		double area = length * breadth ;
		
		DecimalFormat d = new DecimalFormat("0.###");
		
		return Double.parseDouble(d.format(area));
	}

	@Override
	public double getPerimeter() {
		
		return 2*(length+breadth);
	}

	///////////////////////////////////////////////
	
	public Rectangle() {
		super();
		
	}

	public Rectangle(String color, boolean isFilled , double length , double breadth) {
		
		super(color, isFilled);
		
		this.length = length ;
		this.breadth = breadth ;
		
	}

	////////////////////////////////////////////////
	
	public String toString() {
	
		return super.toString() + " Length = " + length + " Breadth = " + breadth + " Area = " + getArea() + " Perimeter = " + getPerimeter();		
	}

	
	
}
