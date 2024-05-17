package myExceptions;

public class CustomerNotFoundException extends Exception {
 public CustomerNotFoundException(String message) {
	 super(message);
 }
 void show() {
	 System.out.println("the customer id is not found in database");
 }
}
 

