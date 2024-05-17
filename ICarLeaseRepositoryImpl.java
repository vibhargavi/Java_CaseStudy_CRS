package DAO;
import Model_Class.customer_entity;
import Model_Class.vehicle_entity;
import Model_Class.lease_entity;
import Model_Class.payment_entity;
import java.util.ArrayList;
import java.util.List;



public interface ICarLeaseRepositoryImpl {
	

	    void add(vehicle_entity car);

	    void remove1(int vehicleID);

	    int countVehicle();

	    void add(customer_entity customer1);

	    void remove(int customerID);

	    void listCustomer(int customerID);

	    void getLeaseBy(int leaseID);

	    void recordPayment(int leaseID, int amount);
	}


