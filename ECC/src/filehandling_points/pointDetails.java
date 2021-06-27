package filehandling_points;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class pointDetails {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new FileReader("point.csv"));

		ArrayList<Point> pointList = new ArrayList<Point>();

		String row = bf.readLine();

		row = bf.readLine();

		while (row != null) {
			pointList.add(createPoint(row));
			row = bf.readLine();
		}

		bf.close();

		for (Point k : pointList) {
			System.out.println(k);
		}

		System.out.println("*****************************************************************");

		int i = 1;
		String maxDistPoints = "";
		double max = 0;

		Map<String, Double> pointsWithDistance = calDistance(pointList);

		for (Map.Entry<String, Double> run : pointsWithDistance.entrySet()) {

			System.out.println(i + " " + run);
			i++;

			if (run.getValue() > max) {
				max = run.getValue();
				maxDistPoints = run.getKey();
			}
		}

		System.out.println("****************************************************");
		System.out.println(maxDistPoints + " " + max);

	}

	public static Point createPoint(String data) {

		String[] s = data.split(",");

		String point = s[0];
		double x = Double.parseDouble(s[1]);
		double y = Double.parseDouble(s[2]);

		return new Point(point, x, y);
	}

	public static Map calDistance(List<Point> pointList) {

		double dist = 0;

		Map<String, Double> distanceList = new TreeMap<String, Double>();

		/*
		 * for(Point k : pointList){ for(Point l : pointList){ if(k != l){ dist
		 * = Math.sqrt(Math.pow(k.getX()-l.getX(),
		 * 2))+Math.pow(k.getY()-l.getY(), 2); double newDistance =
		 * decimalFormatter(dist);
		 * distanceList.put(k.getPoint()+"("+k.getX()+","+k.getY()+")"+"&"+l.
		 * getPoint()+"("+l.getX()+","+l.getY()+")", newDistance); } } }
		 */
		for (int i = 0; i < pointList.size(); i++) {
			for (int j = i + 1; j < pointList.size(); j++) {

				Point a1 = pointList.get(i);
				Point a2 = pointList.get(j);

				double x1 = a1.getX();
				double x2 = a2.getX();
				double y1 = a1.getY();
				double y2 = a2.getY();

				dist = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
				double newDistance = decimalFormatter(dist);
				distanceList.put(a1+"&"+a2, newDistance);

			}
		}

		return distanceList;
	}

	public static double decimalFormatter(double distance) {

		DecimalFormat d = new DecimalFormat("0.##");
		return Double.parseDouble(d.format(distance));
	}

}
