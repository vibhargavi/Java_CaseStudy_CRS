package Model_Class;

import java.util.Date;

public class payment_entity {

	private int paymentID;
    private int leaseID;
    private int paymentDate;
    private int amount;
    
    
    public payment_entity() {
    }
    
    
    public payment_entity(int paymentID,int leaseID,int paymentDate,int amount) {
    	this.paymentID=paymentID;
    	this.leaseID=leaseID;
    	this.paymentDate=paymentDate;
    	this.amount=amount;
    }
    
    
    
    
    
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public int getLeaseID() {
		return leaseID;
	}
	public void setLeaseID(int leaseID) {
		this.leaseID = leaseID;
	}
	public int getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(int paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
