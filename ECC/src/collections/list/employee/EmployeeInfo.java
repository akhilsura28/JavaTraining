package collections.list.employee;

import java.util.*;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new LinkedList<Employee>();
		
		employeeList.add(new Employee("Chandler Bing","Marketing",17000));
		employeeList.add(new Employee("Joey Tribbiani","Marketing",40000));
		employeeList.add(new Employee("Monica Geller","Development",18000));
		employeeList.add(new Employee("Rachel Green","Marketing",15000));
		employeeList.add(new Employee("Ross Geller","Testing",21000));
		employeeList.add(new Employee("Phoebe Buffay","Consulting",35000));
		employeeList.add(new Employee("Pete Becker","Marketing",21000));
		
		List<Employee> fresherEmployeeList = new LinkedList<Employee>();
		
		
		Iterator<Employee> itr = employeeList.iterator();
		
		/* hasNext() : checks whether next element is present
		 * next()    : checks the present element
		 * remove()	 : removes the present element
		*/
		
		while(itr.hasNext()){
			Employee m1 = itr.next();
			
			if(m1.getSalary() < 20000){
				fresherEmployeeList.add(m1);
				itr.remove();
			}
		}
		
/*		
		for(Employee m1 : employeeList){
			
			if(m1.getSalary()<20000){
													//	WRONG METHOD//
				fresherEmployeeList.add(m1);
				employeeList.remove(m1);
			}
		}
*/		
		System.out.println("********************************");
		
		for(Employee m : employeeList){
		System.out.println(m);
		}
		
		System.out.println("********************************");
		
		for(Employee m : fresherEmployeeList){
		System.out.println(m);
		}
	}

}
