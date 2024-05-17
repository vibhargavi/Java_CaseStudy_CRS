package Model_Class;

public class customer_entity {

	private int customerID;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    
    public customer_entity() {
    }
    
    public customer_entity(int customerID,String firstName,String lastName,String email,int phoneNumber) {
    	super();
    	this.customerID=customerID;
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.email=email;
    	this.phoneNumber=phoneNumber;
    
       
    
    }
    
    
    
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
