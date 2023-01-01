package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Products {
	
	public String getItems(String category) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT `ProductName`, `ProductNumber`, `Price` FROM `products` WHERE ProductCategory = '"+ category +"'");
			String products = " ";
			
			rs.next();
			
			products = "ProductName: " + rs.getString(1) + "	ProductNumber: " + rs.getString(2) + "	Price: " + rs.getInt(3);
			
			con.close();
			
			return products;
				
		}
		catch(Exception e)
			{
			System.out.println(e);
			}
		return null;
	}
	
}

