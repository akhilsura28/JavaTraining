package jdbc;

import java.sql.*;
import java.util.*;

public class JDBCRunTimeInputs {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch03", "root", "6106");
		
		Statement stmt = connect.createStatement();
		
		/*
		
		stmt.execute("create table movieDatabase(name varchar(50) primary key, duration "
				+ "float , rating float ,check(duration <= 3 and rating <= 5))");
		
		}*/
		

		Scanner sc = new Scanner(System.in);
		int i = 0 ;
		
		System.out.println("Enter no of movie details to be added : ");
		int n = sc.nextInt();
		
		for(int r = 1 ; r <= n ; r++ ){
			
			System.out.println("Enter details in sequence - movieName , duration , rating : ");
			String name = sc.next();
			float duration = sc.nextFloat();
			float rating = sc.nextFloat();
			
			PreparedStatement p = connect.prepareStatement("insert into movieDatabase values(?,?,?)");
			p.setString(1, name);
			p.setFloat(2, duration);
			p.setFloat(3, rating);
			
			/*i = p.executeUpdate();
			i = i + p.executeUpdate() ; */
			
			i += p.executeUpdate();
			
		}
		
		System.out.println(i + " rows inserted ");
		
		ResultSet result = stmt.executeQuery("select * from movieDatabase;");
		
		while(result.next()){
			System.out.println(result.getString(1) + "\t" +result.getFloat(2)+ "\t" +result.getFloat(3));		
		}
		
		sc.close();
		result.close();
		stmt.close();
		connect.close();
				
	}

}
