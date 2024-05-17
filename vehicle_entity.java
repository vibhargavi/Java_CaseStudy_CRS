package Model_Class;

import java.sql.Date;

public class vehicle_entity {

	
	private int vehicleID;
    private String make;
    private String model;
    private int year;
    private String status;
    private int dailyRate;
    private int passengerCapacity;
    private int engineCapacity;
    
    public vehicle_entity() {
    }
    
    
    public vehicle_entity(int vehicleID,String make,String model,int year,String status,int dailyRate,int passengerCapcity,int engineapacity) {
    	this.vehicleID=vehicleID;
    	this.make=make;
    	this.model=model;
    	this.year=year;
    	this.status=status;
    	this.dailyRate=dailyRate;
    	this.passengerCapacity=passengerCapacity;
    	this.engineCapacity=engineCapacity;
    } 
    
    
      
    
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDailyRate() {
		return dailyRate;
	}
	public void setDailyRate(int dailyRate) {
		this.dailyRate = dailyRate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

}
