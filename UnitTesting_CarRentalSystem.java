package test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import DAO.ICarLeaseRepository;
import Model_Class.customer_entity;
import Model_Class.lease_entity;
import Model_Class.vehicle_entity;
import myExceptions.CustomerNotFoundException;
import myExceptions.LeaseNotFoundException;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnitTesting_CarRentalSystem {

    private ICarLeaseRepository repository;

    @BeforeEach
    public void setUp() {
        repository = new ICarLeaseRepository();
    }

    @Test
    public void testAddVehicle() {

        vehicle_entity car = new vehicle_entity();
        car.setVehicleID(123);
        car.setMake("City");
        car.setModel("Honda");
        car.setYear(1999);
        car.setStatus("not available");
        car.setDailyRate(3000);
        car.setPassengerCapacity(5);
        car.setEngineCapacity(800);
        repository.add(car);

    }

    @Test
    public void testAddLease() {

        lease_entity lease = new lease_entity();
        lease.setLeaseID(100);
        lease.setCustomerID(11);
        lease.setVehicleID(1);
        lease.setStartDate(2021);
        lease.setEndDate(2022);
        repository.add(lease);

    }
    @Test
    public void testListActiveLeases() {

        repository.listActiveLeases();
    }
  

	@Test
    public void testGetLeaseBy() throws LeaseNotFoundException {

        repository.getLeaseBy(1);
    }

   

    
}
