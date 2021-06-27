package ipl_dao_interfaces;

import java.util.List;

import team_beans.Team;

public interface DAO_interface {

	public List<Team> retrieveAllTeams();
	
	public int deleteTeamById(int team_id);
	
	public Team getTeamById(Team t);
	
	public int updateTeam(Team t);
	
	public int getNewTeamId();
	
	
}
