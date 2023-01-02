package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RiderDetails {
	
	public Rider[] getRiderDetails(String bike) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT `RiderName`, `RiderPhNo`, age FROM `riderdetails` where RiderBike = '"+ bike +"'");

			rs.last();
			int i=0,size=rs.getRow();
			
			
			rs.beforeFirst();
			Rider[] riders=new Rider[size];
			
			while(rs.next()) {
			riders[i] = new Rider();
			riders[i].name=rs.getString(1);
			riders[i].phoneno=rs.getInt(2);
			riders[i].age=rs.getInt(3);
			
			i++;
			}
			con.close();
			
			return riders;
			} 
		
		catch(Exception e)
		{
		String[] ex= {e.getMessage()};
		}
		
		return null;
	}
}
