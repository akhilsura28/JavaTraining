package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCConnection_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch03","root","6106");
		Connection connect2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sql_store","root","6106");
		
		Statement stmt1 = connect1.createStatement();
		Statement stmt2 = connect1.createStatement();
		Statement inst = connect2.createStatement();
		
		
		String query1 = "select * from customerdetails";
		String query2 = "select * from customers;";
		String query3 = "select * from products;";
		
		ResultSet result1 = stmt1.executeQuery(query1);
		
		ResultSet result2 = stmt2.executeQuery(query2);
		
		ResultSet result3 = inst.executeQuery(query3);
		
		int i = 0 ; 
		
		while(result1.next() && i <= 5){
			
			System.out.println(result1.getString(3) + " " + result1.getString(9));
			i++ ;
			
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		while(result2.next()){
			
			System.out.println(result2.getInt(1) + " " + result2.getString(3) + " ## " + result2.getString(5));			
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		while(result3.next()){
			
			System.out.println(result3.getInt(1)+ " " + result3.getString(2)+" " +result3.getFloat(4));
		}
		
		stmt1.close();
		stmt2.close();
		connect1.close();
		inst.close();
		connect2.close();
	}
}
