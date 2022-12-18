package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Pkgs {
	
	public String getPkgs(String product) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			String query = "SELECT * FROM packages where Product= '"+product+"' ;";
			System.out.println(query);
			ResultSet rs=stmt.executeQuery(query);
			
			rs.next();

			String pkg = "Product: " + rs.getString(1) + "	Amount: " + rs.getString(2) + "	Price.: " + rs.getInt(3);

			con.close();
			
			return pkg;
			
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		
		return "";
	}
	
	
	
}





