package com.soumik.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class RegistrationModel {
	
	private String name;
	private String password;
	private String course;
	private String location;
	private Connection connect=null;
	private PreparedStatement pstmt=null;
	private int rowsAffected;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public int insert()
	{
		
		try {
			connect=JdbcUtility.getDbConnection();
			String sql="insert into TeluskoCourse(name,,course,location) values(?,?,?,?)";
			pstmt=connect.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setString(3, course);
			pstmt.setString(4, location);
			
			rowsAffected =pstmt.executeUpdate();
		
		} 
		
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		finally {
			
			try {
				
				JdbcUtility.closeResourse(connect, pstmt);
			} 
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return rowsAffected;
		
}


}
