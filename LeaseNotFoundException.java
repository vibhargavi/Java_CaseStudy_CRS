package myExceptions;

public class LeaseNotFoundException extends Exception {
	public LeaseNotFoundException(String Message){
		super(Message);
		
	}
	void show() {
		System.out.println("the given lease id is not found in database");
	}

}
