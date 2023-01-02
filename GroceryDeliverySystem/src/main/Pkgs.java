package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Pkgs {
	
	public PackDetails[] getPkgs(String product) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydeliverysystem","root","");
			Statement stmt=con.createStatement();
			String query = "SELECT * FROM packages where Product= '"+product+"' ;";
			System.out.println(query);
			ResultSet rs=stmt.executeQuery(query);
			
			rs.last();
			int i=0,size=rs.getRow();
			
			rs.beforeFirst();
			PackDetails[] pkgs=new PackDetails[size];
			
			while(rs.next()) {
				pkgs[i] = new PackDetails();
				pkgs[i].product =rs.getString(1);
				pkgs[i].amount =rs.getString(2);
				pkgs[i].price =rs.getInt(3);
				
				i++;
				}
			
			con.close();
			
			return pkgs;
			
		}
		catch(Exception e)
		{
		String[] ex= {e.getMessage()};
		}
		
		return null;
		
	}
	
	
	
}




