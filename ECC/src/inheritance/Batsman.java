package inheritance;

public class Batsman extends Player{

	
	private int runsScored ;
	
	private int ballsFaced ;
	
	private int fours ;
	
	private int sixes ;
	
	private int centuries ;
	
	private int halfCenturies ;
	
	//private static int bId = 1001 ;
	
	////////////////////////////////////////////////
	
	public Batsman(String name ,int runsScored, int ballsFaced, int fours, int sixes, int centuries, int halfCenturies) {
		
		autoIdGen();
		
		setName(name);
		
		this.runsScored = runsScored;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
	}
	
	/////////////////////////////////////////////////
	
	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}
	
	/////////////////////////////////////////////////////

}
