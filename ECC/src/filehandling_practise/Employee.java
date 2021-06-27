package filehandling_practise;

public class Employee {

	private int ID;
	private String NAME ;
	private String DEPT ;
	private int SALARY ;
	
	public Employee(int iD, String nAME, String dEPT, int sALARY) {
		ID = iD;
		NAME = nAME;
		DEPT = dEPT;
		SALARY = sALARY;
	}
	
	public Employee(){
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getDEPT() {
		return DEPT;
	}

	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}

	public int getSALARY() {
		return SALARY;
	}

	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", NAME=" + NAME + ", DEPT=" + DEPT + ", SALARY=" + SALARY + "]";
	}
	
}
