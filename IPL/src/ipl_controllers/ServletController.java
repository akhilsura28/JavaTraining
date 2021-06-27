package ipl_controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ipl_services.TeamServices;
import team_beans.Team;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action == null) {
			action = "view_all_teams";
		}

		if (action.equalsIgnoreCase("view_all_teams")) {

			viewAllTeams(request, response);
		}

		if (action.equalsIgnoreCase("add")) {
			newTeamPage(request, response);
		}

		if (action.equalsIgnoreCase("add_the_team")) {

			addTeam(request, response);
			System.out.println("testing");
			response.sendRedirect("ServletController");
			//viewAllTeams(request, response);
			
		}

		if (action.equalsIgnoreCase("delete")) {
			deleteTeamById(request, response);
		}

		if (action.equalsIgnoreCase("get_team_details")) {
			getTeamDetails(request, response);
		}

		if (action.equalsIgnoreCase("update")) {

			updateTeam(request, response);
		}

	}

	public void newTeamPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Team t = new Team();
		
		int newTeamId = new TeamServices().getNewTeamId();

		request.setAttribute("newTeamId", newTeamId);

		RequestDispatcher rd = request.getRequestDispatcher("/AddNewTeam.jsp");

		rd.forward(request, response);

	}

	public static void addTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Team t = new Team();

		int newTeamId = Integer.parseInt(request.getParameter("newTeamId"));
		String teamName = request.getParameter("teamName");
		String cityName = request.getParameter("cityName");
		String stateName = request.getParameter("stateName");
		String captainName = request.getParameter("captainName");

		t.setTeam_id(newTeamId);
		t.setTeam_name(teamName);
		t.setCity(cityName);
		t.setState(stateName);
		t.setCaptain(captainName);
		
		new TeamServices().addNewTeam(t);

	}	
	
	public void getTeamDetails(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int teamId = Integer.parseInt(request.getParameter("team_id"));
		Team t = new Team();
		t.setTeam_id(teamId);

		t = new TeamServices().getTeamById(t);

		request.setAttribute("oldT", t);
		RequestDispatcher rd = request.getRequestDispatcher("UpdateTeam.jsp");
		rd.forward(request, response);

	}

	public void updateTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int teamId = Integer.parseInt(request.getParameter("team_id"));
		String teamName = request.getParameter("team_name");
		String city = request.getParameter("city");
		String stateName = request.getParameter("state");
		String captainName = request.getParameter("captain");

		Team t = new Team();

		t.setTeam_id(teamId);
		t.setTeam_name(teamName);
		t.setCity(city);
		t.setState(stateName);
		t.setCaptain(captainName);

		TeamServices.updateTeam(t);
		
		response.sendRedirect("ServletController");
		//viewAllTeams(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	public static void viewAllTeams(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Team> teamList = new TeamServices().retrieveAllTeams();

		request.setAttribute("ListOfTeam", teamList);

		RequestDispatcher rd = request.getRequestDispatcher("/ViewAllTeams.jsp");

		rd.forward(request, response);

	}

	public static void deleteTeamById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int team_id = Integer.parseInt(request.getParameter("team_id"));
		new TeamServices().deleteTeamById(team_id);
		
		response.sendRedirect("ServletController");
		//viewAllTeams(request, response);
	}

}
