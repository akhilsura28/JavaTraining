package interfaces_practise_2;

import java.text.DecimalFormat;

public class ClassEleven extends Student implements Percentage,PercentOfTheoryAndPractical {

	private double Tphy , Pphy ,Tmath , Pmath , Tchem , Pchem , eng , hindi ;
	
	public ClassEleven(){}
	
	
	public ClassEleven(String name ,double tphy, double pphy, double tmath, double pmath, double tchem, double pchem, double eng,
			double hindi) {
		
		this.setId(idgen++);
		this.setName(name);
		Tphy = tphy;
		Pphy = pphy;
		Tmath = tmath;
		Pmath = pmath;
		Tchem = tchem;
		Pchem = pchem;
		this.eng = eng;
		this.hindi = hindi;
	}


	public double getTphy() {
		return Tphy;
	}


	public void setTphy(double tphy) {
		Tphy = tphy;
	}


	public double getPphy() {
		return Pphy;
	}


	public void setPphy(double pphy) {
		Pphy = pphy;
	}


	public double getTmath() {
		return Tmath;
	}


	public void setTmath(double tmath) {
		Tmath = tmath;
	}


	public double getPmath() {
		return Pmath;
	}


	public void setPmath(double pmath) {
		Pmath = pmath;
	}


	public double getTchem() {
		return Tchem;
	}


	public void setTchem(double tchem) {
		Tchem = tchem;
	}


	public double getPchem() {
		return Pchem;
	}


	public void setPchem(double pchem) {
		Pchem = pchem;
	}


	public double getEng() {
		return eng;
	}


	public void setEng(double eng) {
		this.eng = eng;
	}


	public double getHindi() {
		return hindi;
	}


	public void setHindi(double hindi) {
		this.hindi = hindi;
	}

	////////////////////////////////////////////////////////

	@Override
	public double getTheoryPercentage() {
		
		return ((Tmath + Tphy + Tchem + eng + hindi)/380.0)*100;
	}


	@Override
	public double getPracticalPercentage() {
		
		return ((Pmath + Pphy + Pchem)/120.0)*100;
	}

	@Override
	public double findPercentage() {
		
		double tPercent = (getTheoryPercentage()+getPracticalPercentage())/2.0;
		
		DecimalFormat d = new DecimalFormat("0.##");
		tPercent = Double.parseDouble(d.format(tPercent));
		
		return tPercent;
	}


	@Override
	public String toString() {
		return "ClassEleven [Id =" + getId() + ", Name = " + getName() + ", Tphy=" + Tphy + ", Pphy=" + Pphy + ", Tmath=" + Tmath + ", Pmath=" + Pmath + ", Tchem="
				+ Tchem + ", Pchem=" + Pchem + ", eng=" + eng + ", hindi=" + hindi + ", Percentage ="
				+ findPercentage() +  "]";
	}

	////////////////////////////////////////////////////////
	
	

	
	
	
}
