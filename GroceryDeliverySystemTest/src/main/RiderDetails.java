package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RiderDetails {
	
	public String getRiderDetails(int age) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT `RiderName`, `RiderBike`, `RiderPhNo` FROM `riderdetails` where age <= '"+ age +"'");
			String rider = "";
			
			rs.next();
			
			 rider = "RiderName: " + rs.getString(1) + "	RiderBike: " + rs.getString(2) + "	PhoneNo.: " + rs.getInt(3);
			
			con.close();
			
			return rider;
			} 
		
		catch(Exception e)
			{
			System.out.println(e);
			}
		return "";
	}
}
