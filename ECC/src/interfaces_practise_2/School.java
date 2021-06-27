package interfaces_practise_2;

public class School {

	public static void main(String[] args) {
		
		ClassEight c1 = new ClassEight("Duke", 74, 85 , 80 , 77, 90 );
		ClassEight c2 = new ClassEight("Samuel",66 ,76, 75 ,56 , 77);
		ClassEight c3 = new ClassEight("Lucifer", 76, 75 ,88 ,69 , 92);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		double hPercentEight = Percentage.getHighestPercentage(c1.findPercentage(), c2.findPercentage());
		hPercentEight = Percentage.getHighestPercentage(hPercentEight, c3.findPercentage());
		System.out.println("Highest Percentage of Class 8 : "+ hPercentEight);
		
		
		
		ClassEleven d1 = new ClassEleven("Patricck Jane",50 ,35 , 50 ,35 , 38 , 39 ,80 , 90);
		ClassEleven d2 = new ClassEleven("Teresa Lisbon",55 ,30 , 40 ,35 , 25 , 35 ,75 , 80);
		ClassEleven d3 = new ClassEleven("Amanda Green",50 ,25 , 50 ,35 , 30 , 35 ,60 , 70);
		
	
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		double hPercentEleven = Percentage.getHighestPercentage(d1.findPercentage(), d2.findPercentage());
		hPercentEleven = Percentage.getHighestPercentage(hPercentEleven, d3.findPercentage());
		System.out.println("Highest Percent of class 11 : " + hPercentEleven);
		
	}

}
