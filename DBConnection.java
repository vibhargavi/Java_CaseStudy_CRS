package Util;
import java.sql.*;

public class DBConnection {

	private static Connection conn;
	private  DBConnection() {
	
	
    try {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        

       
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarRentalSystem", "root", "vibha");
        
        
        
        System.out.println("Connected to the database");

      }
    catch(Exception e)
    {
    	System.out.println(e);
    }       
    
    
}
	
	
  public static Connection getConnect()
    {
    	DBConnection d1=new DBConnection();
    			return conn;
    }
}
