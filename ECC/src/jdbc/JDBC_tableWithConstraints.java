package jdbc;

import java.sql.*;

public class JDBC_tableWithConstraints {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection link = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch03", "root", "6106");

		Statement stmt = link.createStatement();

		String command = "create table movieCons(name varchar(70) primary key,rating float,duration "
				+ "float, check (rating < 5 and duration < 3));";
		stmt.execute(command);

		command = "insert into movieCons(name,rating,duration) values ('ShawshankRedemption',4.7,3.1)"
				+ "	,('TheWolfOfWallStreet',4.5,2.3),('BloodDiamond',4.6,2.2),('ShawshankRedemption',3.2,2.2);";
		// CONSTRAINT VIOLATION OCCCURS AT 1ST ROW AS DURATION > 3 ;
		// CONSTRAINT VIOLATION ALSO OCCCURS AT 4TH ROW AS NAME IS REPEATED ;
		stmt.execute(command);

		command = "select * from movieCons;";
		ResultSet result = stmt.executeQuery(command);

		while (result.next()) {
			System.out.println(result.getString(1) + "  " + result.getFloat(2) + " " + result.getFloat(3));
		}

		stmt.close();
		link.close();
	}
}
