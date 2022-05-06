package HotelManagementSystem;


import java.sql.*;

public class conn {

	Connection c;
	Statement s;
	
	public conn() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?autoReconnect=true&useSSL=false","root","");
			s = c.createStatement();		
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
				
	}
}
