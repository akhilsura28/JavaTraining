package interfaces;

public class Circle implements Shape {
	
	private float radius ;
	
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Circle(float radius) {
		
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		
		return pi*Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		
		return 2*pi*(radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Area =" + getArea() + ", Perimeter =" + getPerimeter() + "]";
	}	
}
