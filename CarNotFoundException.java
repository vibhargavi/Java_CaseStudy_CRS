package myExceptions;

public class CarNotFoundException extends Exception {
	public CarNotFoundException (String message) {
		super(message);
	}
	void show() {
			System.out.println("the given vehicle id is not found to be removed");
	}

}







