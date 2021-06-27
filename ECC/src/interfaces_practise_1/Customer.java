package interfaces_practise_1;

public class Customer implements Bank {

	private float CostOfInvestment , GainFromInvestment ; 
	
	
	/////////////////////////////////////////////
	
	public Customer(){
		
	}

	public Customer(float costOfInvestment, float gainFromInvestment) {
		CostOfInvestment = costOfInvestment;
		GainFromInvestment = gainFromInvestment;
	}
	
	/////////////////////////////////////////////
	@Override
	public double calcROI() {
		// TODO Auto-generated method stub
		return 0;
	}
	/////////////////////////////////////////////

	public float getCostOfInvestment() {
		return CostOfInvestment;
	}

	public void setCostOfInvestment(float costOfInvestment) {
		CostOfInvestment = costOfInvestment;
	}

	public float getGainFromInvestment() {
		return GainFromInvestment;
	}

	public void setGainFromInvestment(float gainFromInvestment) {
		GainFromInvestment = gainFromInvestment;
	}

	///////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "Customer [CostOfInvestment=" + CostOfInvestment + ", GainFromInvestment=" + GainFromInvestment + "]";
	}
	
	//////////////////////////////////////////////////
	
		
}
