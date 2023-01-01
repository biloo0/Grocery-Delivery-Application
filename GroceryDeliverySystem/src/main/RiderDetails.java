package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RiderDetails {
	
	public String getRiderDetails(String bike) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT `RiderName`, `RiderPhNo`, age FROM `riderdetails` where RiderBike = '"+ bike +"'");
			String rider = "";
			
			while(rs.next()) {
			
			 rider = "RiderName: " + rs.getString(1) +  "	PhoneNo.: " + rs.getInt(2) + "	Age: " + rs.getInt(3);
			}
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
