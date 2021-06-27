package filehandling_points;

public class Point {

	private String point ;
	
	private double x;
	private double y;
	private double distance;
	
	public Point(){
		
		
	}
	
	public Point(String point, double x, double y, double distance) {
		this.point = point;
		this.x = x;
		this.y = y;
		this.distance = distance;
	}
	
	
	public Point(String point, double x, double y) {
		this.point = point;
		this.x = x;
		this.y = y;
	}

	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return point + "(" + x + "," + y + ")";
	}
		
}
