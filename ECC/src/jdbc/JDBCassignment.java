package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCassignment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch03","root","6106");
		
		Statement stmt = connect.createStatement();
		
		String command = "create table movieDetails(name varchar(70),rating float,duration float);";
		stmt.execute(command);
		
		command = "insert into movieDetails(name,rating,duration) values ('ShawshankRedemption',4.7,2.8)"
				+ "	,('TheWolfOfWallStreet',4.5,2.3),('BloodDiamond',4.6,2.2);";
		stmt.execute(command);
		
		command = "select * from movieDetails;";
		ResultSet result = stmt.executeQuery(command);
		
		while(result.next()){
			System.out.println(result.getString(1)+"  "+ result.getFloat(2) + " " + result.getFloat(3));			
		}
		
		stmt.close();
		connect.close();

	}
}
