package interfaces_practise_2;

public class ClassEight extends Student implements Percentage{

	private double  phy , che , math , hindi , eng ;
	
	public ClassEight(){}
	
	public ClassEight(String name ,double phy, double che, double math, double hindi, double eng) {
	
		this.setName(name);
		this.setId(idgen++);
		this.phy = phy;
		this.che = che;
		this.math = math;
		this.hindi = hindi;
		this.eng = eng;
	}

	////////////////////////////////////////
	
	public double getPhy() {
		return phy;
	}

	public void setPhy(double phy) {
		this.phy = phy;
	}

	public double getChe() {
		return che;
	}

	public void setChe(double che) {
		this.che = che;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getHindi() {
		return hindi;
	}

	public void setHindi(double hindi) {
		this.hindi = hindi;
	}

	public double getEng() {
		return eng;
	}

	public void setEng(double eng) {
		this.eng = eng;
	}

	@Override
	public double findPercentage() {
		
		return (phy+ che + math + eng + hindi)/5.0;
	}

	@Override
	public String toString() {
		return "ClassEight [Id = " + getId() + ", Name = " + getName() + ", phy=" + phy + ", che=" + che + ", math=" + math + ", hindi=" + hindi + ", eng=" + eng
				+ ", Percentage =" + findPercentage() + "]";
	}
	
	
	
	
}
