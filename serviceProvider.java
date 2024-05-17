package serviceLayer;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import Model_Class.vehicle_entity;
import myExceptions.CarNotFoundException;
import myExceptions.CustomerNotFoundException;
import myExceptions.LeaseNotFoundException;
import Model_Class.customer_entity;

import Model_Class.lease_entity;

import Model_Class.payment_entity;


import DAO.ICarLeaseRepository;

public class serviceProvider {
	
	Scanner sc;
	ICarLeaseRepository cdao;
	ICarLeaseRepository customer;
	ICarLeaseRepository lease;
	ICarLeaseRepository payment;
	
	public serviceProvider() {
		
	
		sc=new Scanner(System.in);
		cdao =new ICarLeaseRepository();
		customer=new ICarLeaseRepository();
	    lease=new ICarLeaseRepository();
	    payment=new ICarLeaseRepository();		
		
		
	}
	public void addVehicle() {
		vehicle_entity car=new vehicle_entity();
		
		System.out.println("enter vehicleID");
		car.setVehicleID(sc.nextInt());		
		System.out.println("enter the make of vehicle");
		car.setMake(sc.nextLine());
		sc.nextLine();
		System.out.println("enter model type of vehicle");
		car.setModel(sc.nextLine());
		sc.nextLine();
		System.out.println("enter year of vehicle");
		car.setYear(sc.nextInt());
		sc.nextLine();
		System.out.println("enter status of vehicle");
		car.setStatus(sc.nextLine());
		sc.nextLine();
		System.out.println("enter daily rate of vehicle");
		car.setDailyRate(sc.nextInt());
		System.out.println("enter passenger capacity of vehicle");
		car.setPassengerCapacity(sc.nextInt());
		System.out.println("enter engine capacity of vehicle");
		car.setEngineCapacity(sc.nextInt());
		
		cdao.add(car);
		
	}
		
		
		
	public void removeVehicle() throws CarNotFoundException {
		vehicle_entity ve=new vehicle_entity();
		System.out.println("enter vehicle id that need to be removed");
		ve.setVehicleID(sc.nextInt());
		cdao.remove1(ve);
		
	}
	
	public void countVehicle() {

		
		int count=cdao.countVehicle();
		count++;
		System.out.println("the number of vehicles are:" + count);
		
	}
	
	public void addCustomer() {
		sc=new Scanner(System.in);
		customer=new ICarLeaseRepository();
		
		customer_entity customer1=new customer_entity();
		
		System.out.println("enter customer id to be added");
		customer1.setCustomerID(sc.nextInt());
		
		System.out.println("enter first name to be added");
		customer1.setFirstName(sc.nextLine());
		
		System.out.println("enter last name to be added");
		customer1.setLastName(sc.nextLine());
		
		System.out.println("enter email to be added");
		customer1.setEmail(sc.nextLine());
		
		System.out.println("enter phone number to be added");
		customer1.setPhoneNumber(sc.nextInt());
		
		customer.add(customer1);
					
	}
	
	public void removeCustomer() throws CustomerNotFoundException {
		int customer1;
		System.out.println("enter customer id that need to be removed");
		customer1=sc.nextInt();
		customer.remove(customer1);
		
	}
	
	public void listCustomer() {
		int customer1;
		System.out.println("enter the customer id");
		customer1=sc.nextInt();
		customer.listCustomer(customer1);
	}
	
	    public void getLeaseBy() throws LeaseNotFoundException {
	
		int lease1;
        System.out.println("enter the lease id");
        lease1=sc.nextInt();
        lease.getLeaseBy(lease1);
        
		
	}
	
	public void addPayment() throws LeaseNotFoundException {
		int leaseID;
		int amount;
		System.out.println("enter the lease id");
		leaseID=sc.nextInt();
		System.out.println("enter the amount");
		amount=sc.nextInt();
		payment.recoordPayment(leaseID,amount);
		
	}
	
	
}
