package collections_list_point_sort;

public class Point {

	private String pointName ;
	
	private double x , y ;

	public Point(){
		
	}
	
	public Point(String pointName, double x, double y) {
		this.pointName = pointName;
		this.x = x;
		this.y = y;
	}

	
	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
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
	
}
