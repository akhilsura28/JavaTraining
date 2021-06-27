package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection_3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch03","root","6106");
		
		Statement stmt = connect.createStatement();
		
		String updateCommand = "update studentdata set total = marks1+marks2+marks3+marks4, percentage = total/4.0 ;" ;
		stmt.execute(updateCommand);
		
		updateCommand = "update studentdata set result = if((marks1 < 40 or marks2 < 40 or marks3 < 40 or marks4 <40),'FAIL','PASS')";
		stmt.execute(updateCommand);
		
		String query = "select * from studentdata;";
		ResultSet result = stmt.executeQuery(query);
		
		while(result.next()){
			
			System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3)+ " " +
			result.getInt(4)+ " " + result.getInt(5)+ " " + result.getInt(6) + " " + result.getString(7) + " " + result.getInt(8) + " " +
			result.getFloat(9));
		}
		
		stmt.close();
		connect.close();
	}

}
