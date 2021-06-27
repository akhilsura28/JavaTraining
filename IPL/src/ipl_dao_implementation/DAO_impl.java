package ipl_dao_implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ipl_dao_implementation.ConnectionFactory;
import ipl_dao_interfaces.DAO_interface;
import team_beans.Team;

public class DAO_impl implements DAO_interface {

	public static void main(String[] args) {
	
		/*List<Team> teamList = new ArrayList<Team>();
		teamList = new DAO_impl().retrieveAllTeams();
		for(Team t : teamList){
			System.out.println(t);
		}*/
		
		//new DAO_impl().getNewTeamId();
		
		//System.out.println(new DAO_impl().deleteTeamById(4));
		
		/*Team t = new Team();
		t.setTeam_id(5);
		Team k = new DAO_impl().getTeamById(t);
		System.out.println(k);*/
		
		
		
		
	}
	
	public int getNewTeamId(){
		
		Connection con = null ;
		int newTeam_id = 1;

		try{
			
			con = ConnectionFactory.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select max(team_id) from team");
			rs.next();
			
			newTeam_id = rs.getInt(1)+1;
			//System.out.println(newTeam_id);
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
		return newTeam_id;
	}
	
	
	

	public List<Team> retrieveAllTeams() {

		List<Team> teamList = new ArrayList<Team>();

		try {

			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from team");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Team t = new Team();

				t.setTeam_id(rs.getInt(1));
				t.setTeam_name(rs.getString(2));
				t.setCity(rs.getString(3));
				t.setState(rs.getString(4));
				t.setCaptain(rs.getString(5));

				teamList.add(t);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return teamList;
	}

	public void insertTeam(Team t) {
		
		Connection con = null;
		
		try{
			
		con = ConnectionFactory.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into team values(?,?,?,?,?);");
			
		ps.setInt(1, t.getTeam_id());
		ps.setString(2, t.getTeam_name());
		ps.setString(3, t.getCity());
		ps.setString(4, t.getState());
		ps.setString(5, t.getCaptain());

		int i = ps.executeUpdate();
		
		System.out.println(i + "records inserted !");
		
		con.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}

	@Override
	public int deleteTeamById(int team_id) {
		
		int row = 0;
		
		try{
			
		Connection con = ConnectionFactory.getConnection();
		
		PreparedStatement ps = con.prepareStatement("delete from team where team_id=?;");
		ps.setInt(1, team_id);
		
		row = ps.executeUpdate();
			
		}catch(Exception e){		
			e.printStackTrace();
		}
	
		return row;
	}

	@Override
	public Team getTeamById(Team t) {
		
		try{
			
			Connection con = ConnectionFactory.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select * from team where team_id=?");
			ps.setInt(1, t.getTeam_id());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				t.setTeam_name(rs.getString(2));
				t.setCity(rs.getString(3));
				t.setState(rs.getString(4));
				t.setCaptain(rs.getString(5));
			}else{
				return null;
			}
				
		}catch(Exception e){
			e.printStackTrace();
		}

		return t;
	}

	@Override
	public int updateTeam(Team t) {
		
		int row = 0;
		
		try{
			
			Connection con = ConnectionFactory.getConnection();

			PreparedStatement ps = con.prepareStatement("update team set team_name=?,city=?,state=?,captain=? where team_id=?;");
			ps.setString(1, t.getTeam_name());
			ps.setString(2, t.getCity());
			ps.setString(3, t.getState());
			ps.setString(4, t.getCaptain());
			ps.setInt(5, t.getTeam_id());
			
			row = ps.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return row;
	}
	
}
