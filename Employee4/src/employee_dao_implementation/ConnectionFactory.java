package employee_dao_implementation;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection getConnection(){
		
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","6106");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
	

}
