package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Stores {
	
	String storename, workingsince, location;
	
	public String getStores(int ratings) {
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT `StoreName`, `WorkingSince`, `Location` FROM stores WHERE ratings >= '"+ ratings +"'");
			String stores = "";
			
			rs.next();
			
			stores = "ProductName: " + rs.getString(1) + "	Experience: " + rs.getString(2) + "	Location: " + rs.getString(3);
			
			con.close();
			
			return stores;
			
		}
		catch(Exception ex){
			System.out.println(ex);

		}

		return null;

	}

}
