package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import collections.list.cabcustomer.CabCustomer;

public class CabCustomerJDBC_Methods {

	public Connection createConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch03", "root", "6106");

		return connect;
	}

	public void createTable() throws ClassNotFoundException, SQLException {

		Connection connect = createConnection();
		Statement stmt = connect.createStatement();

		stmt.execute("create table CabCustomer(customerName varchar(50), pickUpLocation varchar(50),"
				+ " dropLocation varchar(50), distance int , phone long);");
	}

	
	public void insertData() throws ClassNotFoundException, SQLException {

		Connection connect = createConnection();

		List<CabCustomer> custList = getCabCustomerDetails();
		int rows = 0;
		for (CabCustomer customer : custList) {

			PreparedStatement p = connect.prepareStatement("insert into CabCustomer values(?,?,?,?,?);");

			p.setString(1, customer.getName());
			p.setString(2, customer.getPickupLocation());
			p.setString(3, customer.getDropLocation());
			p.setFloat(4, customer.getDistance());
			p.setLong(5, customer.getPhoneNumber());

			rows += p.executeUpdate();

		}

		System.out.println(rows + "rows inserted !");

	}

	
	public static List<CabCustomer> getCabCustomerDetails() {

		List<CabCustomer> custList = new ArrayList<CabCustomer>();

		custList.add(new CabCustomer("Ravi", "gachibowli", "sainikpuri", 7, 9845632145l));
		custList.add(new CabCustomer("Deepak", "gachibowli", "sainikpuri", 7, 7745632145l));
		custList.add(new CabCustomer("Sandeep", "Financial Dist", "Kanapur", 4, 6745632145l));
		custList.add(new CabCustomer("Charan", "Hitech City", "madhapur", 9, 8845655145l));
		custList.add(new CabCustomer("Ayesha", "gachibowli", "sainikpuri", 5, 9745632145l));
		custList.add(new CabCustomer("Snigdha", "Tolichowki", "sainikpuri", 6, 8845632145l));
		custList.add(new CabCustomer("Rachana", "Hitech City", "Sec'bad", 4, 6845632145l));

		return custList;

	}

	public void alterTable() throws ClassNotFoundException, SQLException{
		
		Connection connect = createConnection();
		
		Statement stmt = connect.createStatement();
		
		stmt.execute("alter table CabCustomer add column bill float;");
		
	}
	
	public void updateTable() throws ClassNotFoundException, SQLException {
		
		Connection connect = createConnection();
		
		PreparedStatement p = connect.prepareStatement("update cabCustomer set bill = distance*6 ;");
		
		int i = p.executeUpdate();
		
		System.out.println(i + "rows updated !");
	}

	public void printBill() throws ClassNotFoundException, SQLException{
		
		Connection connect = createConnection();
		Statement stmt = connect.createStatement();
		
		ResultSet res = stmt.executeQuery("select * from CabCustomer;");
		
		while(res.next()){
			System.out.println(res.getString("customerName") + " \t " +res.getFloat("bill"));
		}
	}
	
	
}
