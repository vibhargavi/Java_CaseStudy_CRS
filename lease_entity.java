package Model_Class;

import java.util.Date;

public class lease_entity {
	
	private int leaseID;
    private int vehicleID;
    private int customerID;
    private int startDate;
    private int endDate;
    
    public lease_entity() {
    }
    
    public lease_entity(int leaseID,int vehicleID,int customerID,int startDate,int endDate) {
    	this.leaseID=leaseID;
    	this.customerID=customerID;
    	this.vehicleID=vehicleID;
    	this.startDate=startDate;
    	this.endDate=endDate; 
    }
    
    
    
    
    public int getLeaseID() {
		return leaseID;
	}
	public void setLeaseID(int leaseID) {
		this.leaseID = leaseID;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int i) {
		this.startDate = i;
	}
	public int getEndDate() {
		return endDate;
	}
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String type;

	public static lease_entity getLeaseBy(int customerID2) {
		
		return null;
	}

	
}
