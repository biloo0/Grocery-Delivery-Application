package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import main.Storemin;


public class Stores {
	
	public Storemin[] getStores(int ratings) {
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT `StoreName`, `WorkingSince`, `Location` FROM stores WHERE ratings = '"+ ratings +"'");
			
			
			rs.last();
			int i=0,size=rs.getRow();
			
			
			rs.beforeFirst();
			Storemin[] stores=new Storemin[size];
			
			while(rs.next()) {
				stores[i] = new Storemin();
				stores[i].storename=rs.getString(1);
				stores[i].experience=rs.getString(2);
				stores[i].location=rs.getString(3);
				
				i++;
				}
			
			con.close();
			
			return stores;
			
		}
		
		catch(Exception e)
		{
		String[] ex= {e.getMessage()};
		}
		
		return null;
	}

}
