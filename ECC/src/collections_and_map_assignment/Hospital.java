package collections_and_map_assignment;

import java.util.*;

public class Hospital {

	private  static int hospitalCode = 1001 ;
	private String hospitalName ;
	private List<String> listOfTreatments ;
	private String contactPerson , contactNumber , location ;
	
	public Hospital(){
		
	}
	
	public Hospital(String hospitalName, List<String> listOfTreatments, String contactPerson,
			String contactNumber, String location) {
		hospitalCode++;
		this.hospitalName = hospitalName;
		this.listOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}


	public static int getHospitalCode() {
		return hospitalCode;
	}

	public static void setHospitalCode(int hospitalCode) {
		Hospital.hospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}

	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", listOfTreatments=" + listOfTreatments + ", contactPerson="
				+ contactPerson + ", contactNumber=" + contactNumber + ", location=" + location + "]";
	}
	
	
	
}
