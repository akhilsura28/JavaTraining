package jdbc;

import java.sql.SQLException;

public class CabCustomerJDBC_main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		CabCustomerJDBC_Methods z = new CabCustomerJDBC_Methods();
		
	//	z.alterTable();
	//	z.updateTable();
		
		z.printBill();
		
		

	}

}
