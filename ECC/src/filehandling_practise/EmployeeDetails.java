package filehandling_practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeDetails {


	public static void main(String[] args) throws IOException {
 
		BufferedReader bf = new BufferedReader(new FileReader("modWorksheet.csv"));

		ArrayList <Employee> employeeList = new ArrayList <Employee>();
		
		String row = bf.readLine(); // column names read

		row = bf.readLine();
				
		while (row != null) {
			
			//System.out.println(createEmployee(row));

			employeeList.add(createEmployee(row));

			row = bf.readLine();
		}

		bf.close();

		System.out.println("*********************************************************************");
		
		
		Employee maxSalaryEmp = null ; Employee minSalaryEmp = null ;
		
		int min = 50000 ; int max = 0;
		
		for(Employee a : employeeList){
			System.out.println(a);
			
			if(a.getSALARY() > max){
				max = a.getSALARY();
				maxSalaryEmp = a ;
			}
			
			if(a.getSALARY() < min){
				min = a.getSALARY();
				minSalaryEmp = a;
			}
			
		}
		
		System.out.println("********************************************************************");
		System.out.println(maxSalaryEmp);
		System.out.println(minSalaryEmp);
		
	}

	public static Employee createEmployee(String data) {

		String[] details = data.split(",");
		int ID = Integer.parseInt(details[0]);
		String NAME = details[1];
		String DEPT = details[2];
		int SALARY = Integer.parseInt(details[3]);

		return new Employee(ID, NAME, DEPT, SALARY);
	}
}
