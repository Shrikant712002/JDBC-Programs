package com.jsp.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertDataIntoTable {
	public static void main(String[] args) {
		try {
			//Step 1 : load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2 : Establish Connection
			String url = "jdbc:mysql://localhost:3306/j2eee?user=root&password=Shrikant@712002";
			Connection connection= DriverManager.getConnection(url);
			
			//Sql Query
			String query = "insert into student(sName,sAddress) values(?,?)";
			
			//Step 3 : Create Platform
			PreparedStatement pstmt = connection.prepareStatement(query);
			
			//Set values to query
			pstmt.setString(1, "Shrikant");
			pstmt.setString(2, "Pune");
			
			//Step 4 : Execute Query
		    int status = pstmt.executeUpdate();
		    
		    System.out.println("No of records updated : "+status);
		    
		    //Step 5 : Close Connection
		    connection.close();
		    
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
