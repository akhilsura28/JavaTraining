package interfaces_practise_1;

public class RoICalculator {

	public static void main(String[] args){
		
	
		Customer c1 = new Customer(15000 , 20000);
		Customer c2 = new Customer(20000 , 40000);
		Customer c3 = new Customer(40000 , 15000);

		SBI s1 = new SBI(c1);
		ICICI a1 = new ICICI(c2);
		ICICI a2 = new ICICI(c3);
		
		System.out.println(c1 + " ROI : " + s1.calcROI());
	
		System.out.println(c2 + " ROI : " + a1.calcROI());
		
		System.out.println(c3 + " ROI : " + a2.calcROI());
		
		double MaxROI = Bank.getMaxROI(s1.calcROI() , a1.calcROI());
		MaxROI = Bank.getMaxROI(MaxROI , a2.calcROI());
	
		System.out.println("MAX ROI =" + MaxROI);
	}
	
}
