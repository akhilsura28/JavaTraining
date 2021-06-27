package inheritance_school;

public class Student extends Person {

	private String program ;
	
	private int standard ;
	
	private double fee ;

	//////////////////////////////////////////////
	
	public Student(String name, String address, String program, int standard, double fee) {
		super(name, address);
		this.program = program;
		this.standard = standard;
		this.fee = fee;
	}

	//////////////////////////////////////////////
	
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return super.toString() + " Student [program=" + program + ", standard=" + standard + ", fee=" + fee + "]";
	}
		
}
