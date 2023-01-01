package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Products {
	
	public String[] getItems(String category) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT `ProductName`, `ProductNumber`, `Price` FROM `products` WHERE ProductCategory = '"+ category +"'");
			
			int i=0,size=0;
			while(rs.next())
			{
			size++;
			}
			
			rs.beforeFirst();
			String[] products=new String[size];

			
			while(rs.next()) {
			
			products[i] = "ProductName: " + rs.getString(1) + "	ProductNumber: " + rs.getString(2) + "	Price: " + rs.getInt(3);
			
			
			i++;
			}
			con.close();
			
			return products;
				
		}
		catch(Exception e)
		{
		String[] ex= {e.getMessage()};
		return ex;
		}
	}
	
}

