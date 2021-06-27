package abstraction;

import java.text.DecimalFormat;

public class Circle extends Shape { 			////Because we are taking : color and isFilled from the Shape Class//

	private float radius ;
	
	
	/////////////////////////////////////////////////////////////
	
	public Circle(){
		
	}
	
	public Circle(String color , boolean isFilled , float radius){
		
		super(color , isFilled);
		this.radius = radius ;
	}
	
	/////////////////////////////////////////////////////////////

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	//////////////////////////////////////////////////////////////
	
	public double getArea(){
		
		float area = 3.14f * radius * radius ;
		
		DecimalFormat d = new DecimalFormat("0.###");
		
		return Double.parseDouble(d.format(area));
		
	}
	
	public double getPerimeter(){
	
		double peri = 2 * 3.14f * radius ;
		
		DecimalFormat d = new DecimalFormat("0.###");
		
		return Double.parseDouble(d.format(peri));
	}
	
	///////////////////////////////////////////////////////////////
	
	public String toString(){
		
		return super.toString() + " Radius = " + radius + " Area = " + getArea() + " Perimeter = " + getPerimeter();
	}

	////////////////////////////////////////////////////////////////
}
