/*
 * - Create an interface called Bank with calcROI() method.
- Create a class 'Customer' with below fields
        - GainFromInvestment
        - CostOfInvestment

Create two bank classes 'SBI' and 'ICICI' which implement Bank interface and have below fields:
        - customer (Customer)

Create a class 'RoICalculator' with main method and perform below steps:
   - create a customer object
   - create an object of both SBI and ICICI classes and print the customer's RoI.

ROI = (GainFromInvestment - CostOfInvestment)*100 / (CostOfInvestment)

 */
package interfaces_practise_1;

//ALONG WITH ABSTRACT METHODS WE CAN WRITE STATIC METHODS ALSO IN INTERFACE ;

public interface Bank {

	
	public double calcROI() ;
	

	public static double getMaxROI(double r1 , double r2){
		
		if(r1>r2)
			return r1 ;
		return r2 ;
	}
	
}
