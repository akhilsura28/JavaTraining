package Encapsulation;

public class Cricket {

	public static void main(String[] args) {
		
		Player p1 = new Player(); // using empty constructor to be called
		
		p1.setName("Ajinkya Rahane");
		p1.setRunsScored(87);
		p1.setBallsFaced(36);
		p1.setFours(9);
		p1.setSixes(4);
		
		
		Player p2 = new Player(); // using empty constructor to be called
		
		p2.setName("Rohit Sharma");
		p2.setRunsScored(157);
		p2.setBallsFaced(45);
		p2.setFours(6);
		p2.setSixes(8);
		
		
		Player p3 = new Player(); // using empty constructor to be called
		
		p3.setName("Kedar Jadhav");
		p3.setRunsScored(103);
		p3.setBallsFaced(48);
		p3.setFours(11);
		p3.setSixes(7);
		
		System.out.println(p1.toString());
		System.out.println(p1.getStrikeRate());
		
		System.out.println(p2);
		System.out.println(p2.getStrikeRate());
		
		System.out.println(p3.toString());
		System.out.println(p3.getStrikeRate());
		
		
		Player p4 = new Player("Mayank Agarwal ", 178 , 0 , 0 , 50 , 2 , 10 ); //using constructor with arguments to be called//

		System.out.println(p4);
		System.out.println(p4.getStrikeRate());
		
	}

}
