
package Main;

import java.util.Scanner;

import myExceptions.CarNotFoundException;
import myExceptions.CustomerNotFoundException;
import myExceptions.LeaseNotFoundException;
import serviceLayer.serviceProvider;

public class Main{
	public static void main(String args[]) throws LeaseNotFoundException {
		Scanner sc=new Scanner(System.in);
		serviceProvider  sp =new serviceProvider();
		while(true) {
			System.out.println("1. Car Management menu");
			System.out.println("2. Customer Management menu");
            System.out.println("3. Lease Management menu");
            System.out.println("4. Payment Management menu");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice");
            
            int choice=sc.nextInt();
            int option;
            
            
            if(choice==1) {
            	System.out.println("1. add vehicle");
            	System.out.println("2. remove vehicle");
            	System.out.println("3. Count number of vehicle");
            	System.out.println("enter your option" );
            	option=sc.nextInt();
            	
            	if(option==1) {
            		sp.addVehicle();
            	}
            	
            	else if(option==2) {
            		try {
            		sp.removeVehicle();
            	}
            	
            	catch(CarNotFoundException e) {
            		System.out.println(e.getMessage());
            	}
            }
            	else if(option==3) {
            		sp.countVehicle();
            	}
            	else {
            		break;
            	}
            	
            }
            else if(choice==2) {
            	
            	System.out.println("1. add customers");
            	System.out.println("2. remove customers");
            	System.out.println("enter you option");
            	option=sc.nextInt();
            	
            	if(option==1) {
            		sp.addCustomer();
            	}
            	else if(option==2) {
            		try {
            			
            		sp.removeCustomer();
            	}
            		catch(CustomerNotFoundException e) {
            			System.out.println(e.getMessage());
            		}
            	}
            		
            	else {
            		break;
            	}
            }
            else if(choice==3) {
            	
            	sp.getLeaseBy();
            	}
           
            	            	
            else if(choice==4) {
            	System.out.println("records of payment of amount and leaseid");
            	sp.addPayment();
            }
            else {
            	break;

            }
            
		}
		
		sc.close();
		
	}
	
}


	
