package collections_list_point_sort;

import java.text.DecimalFormat;
import java.util.*;

public class DistanceCalculation {

	public static void main(String[] args) {

		List<Point> allPoints = new ArrayList<Point>();

		Point p1 = new Point("P1", 1, 2);
		Point p2 = new Point("P2", 2, 3);
		Point p3 = new Point("P3", 3, 4);
		Point p4 = new Point("P4", 4, 5);
		Point p5 = new Point("P5", 5, 6);

		allPoints.add(p1);
		allPoints.add(p2);
		allPoints.add(p3);
		allPoints.add(p4);
		allPoints.add(p5);

		List<Double> distanceList = new ArrayList<Double>();

		distanceList = distanceBetweenPoints(allPoints);

		System.out.println("Distance list before Sorting : ");
		System.out.println(distanceList);

		System.out.println("****************************************************************");
		Collections.sort(distanceList);

		System.out.println("Distance list after Sorting : ");
		System.out.println(distanceList);

	}

	public static List<Double> distanceBetweenPoints(List<Point> allPoints) {

		List<Double> distanceList = new ArrayList<Double>();

		for (Point p : allPoints) {

			for (Point q : allPoints) {
				double distance = 0;
				
				if (p != q) {
					distance = Math.sqrt(Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2));
					double newDistance = decimalFormatter(distance);
					distanceList.add(newDistance);
				}
			}

		}

		return distanceList;
	}

	
	public static double decimalFormatter (double distance){
		
		DecimalFormat d = new DecimalFormat("0.##");
		double newDistance = Double.parseDouble(d.format(distance));
		
		return newDistance;	
	}
}
