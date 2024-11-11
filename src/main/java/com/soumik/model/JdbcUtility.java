package com.soumik.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtility {
	
static {
		
		//load and register driver
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Driver Register Successfully.");
		
	}
	
	
	public static Connection getDbConnection() throws SQLException {
		
		//Establish Connection
		
		String url="jdbc:mysql://localhost:3306/teluskodb";
		String userName="root";
		String password="Soumik@1993";
		return DriverManager.getConnection(url, userName, password);
		
	}
	
	public static void closeResourse(Connection c, PreparedStatement s) throws SQLException
	{
		
		if(c!=null) {
			c.close();
		}
		if(s!=null) {
			s.close();
		}
	}

}
