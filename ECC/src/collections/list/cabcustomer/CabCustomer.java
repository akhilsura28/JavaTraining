package collections.list.cabcustomer;

public class CabCustomer {

	private String name ;
	private String pickupLocation , dropLocation ;
	private float distance ;
	private long phoneNumber ;
	
	public CabCustomer(){}

	public CabCustomer(String name, String pickupLocation, String dropLocation, float distance, long phoneNumber) {
		this.name = name;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phoneNumber = phoneNumber;
	}
	

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getPickupLocation() {
		return pickupLocation;
	}

	
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	
	public String getDropLocation() {
		return dropLocation;
	}

	
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	
	public float getDistance() {
		return distance;
	}

	
	public void setDistance(float distance) {
		this.distance = distance;
	}

	
	public long getPhoneNumber() {
		return phoneNumber;
	}

	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CabCustomer [name=" + name + ", pickupLocation=" + pickupLocation + ", dropLocation=" + dropLocation
				+ ", distance=" + distance + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
