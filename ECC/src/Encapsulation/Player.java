package Encapsulation;

import java.text.DecimalFormat;

//import java.util.Random;

public class Player {

	private int id ;
	
	private static int idGenerator = 101 ;
	
	private String name ;
	
	private int runsScored , centuries , halfCenturies , ballsFaced , sixes , fours ;
	
//////////////////////////////////////////////////////
	
	public  Player (String pName , int runScore , int century ,int halfCentury ,int ballFace , int six, int four){
			
		id = idGenerator++ ;
		
		name = pName ;
	
		runsScored = runScore ;
		
		centuries = century ;
		
		halfCenturies = halfCentury ;
		
		ballsFaced = ballFace ;
		
		sixes = six ;
		
		fours = four ;
	}
	

	public Player(){
		
		id = idGenerator++ ;
	}

///////////////////////////////////////////////////////////
	
	
	
	public void setName(String playerName){
	
		name = playerName ;
	}
	
	public void setRunsScored(int runs){
		
		runsScored = runs ;
	}
	
	public void setCenturies(int cen){
		centuries = cen ;
	}
	
	public void setHalfCenturies(int halfCens){
		
		halfCenturies = halfCens ;
	}
	
	public void setBallsFaced(int ballface){
		
		ballsFaced = ballface ;
	}
	
	public void setSixes(int six){
		
		sixes = six ;
	}
	
	public void setFours(int four){
		
		fours = four ;
	}
///////////////////////////////////////////////////////////
/*	
	public int getRandomNum(){
		int min = 100, max = 199 ;
		
		Random num = new Random();
		 
		return min + num.nextInt(max);;
	}
*/	
/////////////////////////////////////////////////////////////
	
	
	public String getName(){
		return name ;
	}
	
	public int getRunsScored(){
		return runsScored ;
	}
	
	public int getCenturies(){
		return centuries ;
	}
	
	public int getHalfCenturies(){
		return halfCenturies ;
	}
	
	public int getBallsFaced(){
		return ballsFaced ;
	}
	
	public int getSixes(){
		return sixes ;
	}
	
	public int getFours(){
		return fours ;
	}
	
	
	public float getStrikeRate(){
		
		float strikerate = (float)(runsScored*100)/ballsFaced ;
		
		DecimalFormat d = new DecimalFormat("0.##");
		
		return Float.parseFloat(d.format(strikerate)); 
		
	} 
	
	
	public int getRunsScoredInBoundaries(){
		
		return (4*fours+6*sixes);		
	}
	
	
	public String toString(){
		
		return ("Player ID = " + id +" PlayerName :" + getName() +" Total Runs Scored = " + runsScored +" Centuries = " + getCenturies() +" HalfCenturies = " + halfCenturies +" Balls Faced = " + ballsFaced +" Sixes = " + sixes+" Fours = " + fours);
	}

}
