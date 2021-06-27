package inheritance;

public class Bowler extends Player {
	
	private int wicketsTaken;
	
	private int noOfBalls ;
	
	//private static int boId = 1002;
	
////////////////////////////////////////////////////////////////////
	
	public Bowler(String name , int wicketsTaken, int noOfBalls) {
		
		autoIdGen();
		setName(name);
		//setId(boId++);
		this.wicketsTaken = wicketsTaken;
		this.noOfBalls = noOfBalls;
	}
	
	public Bowler(){
		
	}
	
/////////////////////////////////////////////////////////////////////
	
	public int getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	public int getNoOfBalls() {
		return noOfBalls;
	}

	public void setNoOfBalls(int noOfBalls) {
		this.noOfBalls = noOfBalls;
	}
	
//////////////////////////////////////////////////////////////////////
	
	
		
	
}
