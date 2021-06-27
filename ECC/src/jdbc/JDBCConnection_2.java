package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch03","root","6106");
		
		Statement stmt = connect1.createStatement();
		
		String insertCommand = "insert into studentdata(id,name,marks1,marks2,marks3,marks4) values('1003','akhil','100','80','95','100');";
		stmt.execute(insertCommand);
		
		insertCommand = "insert into studentdata(id,name,marks1,marks2,marks3,marks4) values('1007','ravi','100','25','42','99');";
		stmt.execute(insertCommand);
		
		String query = "select * from studentdata;";
		ResultSet result = stmt.executeQuery(query);
		
		while(result.next()){
			
			System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3)+ " " +
			result.getInt(4)+ " " + result.getInt(5)+ " " + result.getInt(6) + " " + result.getString(7) + " " + result.getInt(8) + " " +
			result.getFloat(9));
		}
		
		
		stmt.close();
		connect1.close();

 	}

}
