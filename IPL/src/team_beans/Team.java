package team_beans;

import java.io.Serializable;

public class Team implements Serializable {

	private int team_id;
	private String team_name;
	private String city;
	private String state;
	private String captain;
	
	public Team() {
		
	}

	
	public static int idGen = 1;
	

	public Team(String team_name, String city, String state, String captain) {
		this.team_name = team_name;
		this.city = city;
		this.state = state;
		this.captain = captain;
	}

	

	public Team(int team_id, String team_name, String city, String state, String captain) {
		this.team_id = team_id;
		this.team_name = team_name;
		this.city = city;
		this.state = state;
		this.captain = captain;
	}



	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "Team [team_id=" + team_id + ", team_name=" + team_name + ", city=" + city + ", state=" + state
				+ ", captain=" + captain + "]";
	}
	
	
		
}
