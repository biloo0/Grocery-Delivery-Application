package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import main.ProductDetails;

public class Products {
	
	public ProductDetails[] getItems(String category) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT `ProductName`, `ProductNumber`, `Price` FROM `products` WHERE ProductCategory = '"+ category +"'");
			
			rs.last();
			int i=0,size=rs.getRow();
			
			rs.beforeFirst();
			ProductDetails[] products= new ProductDetails[size];

			
			while(rs.next()) {
				products[i] = new ProductDetails();
				products[i].productname=rs.getString(1);
				products[i].productnumber=rs.getString(2);
				products[i].price=rs.getInt(3);
				
				i++;
				}
			
			
			con.close();
			
			return products;
				
		}
		catch(Exception e)
		{
		String[] ex= {e.getMessage()};
		}
		
		return null;
	}
	
}
