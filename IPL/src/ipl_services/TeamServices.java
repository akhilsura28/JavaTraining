package ipl_services;

import java.util.ArrayList;
import java.util.List;

import ipl_dao_implementation.DAO_impl;
import ipl_dao_interfaces.DAO_interface;
import team_beans.Team;

public class TeamServices {

	public static void main(String[] args) {
		/*
		 * List<Team>teamList = new ArrayList<>(); teamList = new
		 * TeamServices().retrieveAllTeams(); for(Team t : teamList){
		 * System.out.println(t); }
		 */

	}

	public int getNewTeamId() {

		DAO_interface newTeam = new DAO_impl();

		int newTeamId = newTeam.getNewTeamId();

		return newTeamId;
	}

	public void addNewTeam(Team t) {
		
		
		
	//	t.setTeam_id(newTeamId);

		new DAO_impl().insertTeam(t);

	}

	public List<Team> retrieveAllTeams() {
		return new DAO_impl().retrieveAllTeams();
	}

	public void deleteTeamById(int team_id) {
		DAO_interface dao = new DAO_impl();
		int i = dao.deleteTeamById(team_id);
	}

	public Team getTeamById(Team t) {

		return new DAO_impl().getTeamById(t);
	}

	public static int updateTeam(Team t) {

		return new DAO_impl().updateTeam(t);

	}
}
