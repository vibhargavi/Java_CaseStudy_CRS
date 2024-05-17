package DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Model_Class.customer_entity;
import Model_Class.lease_entity;
import Model_Class.payment_entity;
import Model_Class.vehicle_entity;
import Util.DBConnection;
import myExceptions.LeaseNotFoundException;
public class ICarLeaseRepository   {
	
	private Connection con;
	PreparedStatement stat;
	
	public  ICarLeaseRepository () {
		
		con=DBConnection.getConnect();
	}
	
	public void add(vehicle_entity car) {
   
	try
	{
		stat=con.prepareStatement("insert into vehicle_entity values(?,?,?,?,?,?,?,?)");
		stat.setInt(1, car.getVehicleID());
		stat.setString(2, car.getMake());
		stat.setString(3, car.getModel());
		stat.setInt(4, car.getYear());
		stat.setString(6, car.getStatus());
		stat.setInt(5, car.getDailyRate());
		stat.setInt(7, car.getPassengerCapacity());
		stat.setInt(8, car.getEngineCapacity());
		stat.executeUpdate();
		System.out.println("Records Added");
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	public void remove1(vehicle_entity ve) {
		
        try {
            
            PreparedStatement updateStatemenmt = con.prepareStatement("update lease_entity set vehicleID = null where vehicleID = ?");
            updateStatemenmt.setInt(1, ve.getVehicleID());
            updateStatemenmt.executeUpdate();
            PreparedStatement deleteStatement = con.prepareStatement("delete from vehicle_entity where vehicleID = ?");
            deleteStatement.setInt(1, ve.getVehicleID());
            deleteStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error occurred while removing vehicle: " + e.getMessage());
        }
    }

		
	public int countVehicle() {
	    int count = 0;
	    try {
	        stat = con.prepareStatement("select count(*) AS vehicle_count from vehicle");
	        ResultSet rs = stat.executeQuery();
	        if (rs.next()) {
	            count = rs.getInt("vehicle_count");
	        }
	        rs.close(); 
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	    return count;
	}

	
	

	public void add(customer_entity customer1) {
		try {
			stat=con.prepareStatement("insert into customer_entity values(?,?,?,?,?)");
		
		stat.setInt(1, customer1.getCustomerID());
		stat.setString(2, customer1.getFirstName());
		stat.setString(3, customer1.getLastName());
		stat.setString(4, customer1.getEmail());
		stat.setInt(4, customer1.getPhoneNumber());
		stat.executeUpdate();
		
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		

	public void remove(int customerID) {
		try {
			PreparedStatement leaseCheckStmt = con.prepareStatement("select * from lease_entity where customerID = ?");
	        leaseCheckStmt.setInt(1, customerID);
	        ResultSet leaseResultSet = leaseCheckStmt.executeQuery();
	        
	        if (leaseResultSet.next()) {
	            System.out.println("Cannot delete customer with active leases. Please close the leases first.");
	            return;
			
	        }
			
			
			stat=con.prepareStatement("delete from customer_entity where customerid=?");
			stat.setInt(1,customerID);
			stat.executeUpdate();
			System.out.println("customer id is deleted");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	
	public void listCustomer(int customerID) {
        try {
            stat = con.prepareStatement("select * from customer_entity where customerid=?");
            stat.setInt(1, customerID);
            ResultSet rs = stat.executeQuery();
            

            while(rs.next())
            {
            	System.out.println("Customer ID : "+rs.getInt(1));
            	System.out.println("First name  : "+rs.getString(2));
            	System.out.println("Lat name: "+rs.getString(3));
            	System.out.println("\n");
            }
    		}
    		catch(Exception e)
    		{
    			System.out.println(e.getMessage());
    			
    		}
	}
	public void getLeaseBy(int leaseID){
			try
			{
			
			stat=con.prepareStatement("select * from lease_entity where leaseid =? ");
			stat.setInt(1,leaseID);
	        ResultSet rs = stat.executeQuery();
	        
	        while(rs.next())
	        {
	        	System.out.println("Lease ID : "+rs.getInt(1));
	        	System.out.println("Customer ID : "+rs.getInt(2));
	        	System.out.println("Vehicle ID : "+rs.getInt(3));
	        	System.out.println("Start Date : "+rs.getString(4));
	        	System.out.println("End Date: "+rs.getInt(5));
	        	System.out.println("\n");
	        }
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				
				
			}
	}
	
	
	public void recoordPayment(int leaseID, int amount) {
	    try {
	       
	        PreparedStatement stat = con.prepareStatement("select * from payment_entity where leaseid=? and amount=?");
	        stat.setInt(1, leaseID);
	        stat.setInt(2, amount);
	        ResultSet rs = stat.executeQuery();

	        if (rs.next()) {
	            
	            System.out.println("Payment Details:");
	            System.out.println("Lease ID: " + rs.getInt("leaseID"));
	            System.out.println("Amount: " + rs.getInt("amount"));
	            System.out.println("Payment ID:" + rs.getInt("paymentID"));
	            System.out.println("Start Date:" + rs.getInt("startDate"));
	        } else {
	        
	            System.out.println("Invalid payment details.");
	        }
	    } catch (SQLException e) {
	 
	        System.out.println("Error occurred while checking payment details: " + e.getMessage());
	    }
	}


	public void add(lease_entity lease) {
		
	}

	public void listActiveLeases() {
		
	}
}
	
	


	