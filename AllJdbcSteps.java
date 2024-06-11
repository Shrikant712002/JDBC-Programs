package com.jsp.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AllJdbcSteps {
	public static void main(String[] args) {
		
		try {
			//Step 1 : load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2 : Establish Connection
			String url = "jdbc:mysql://localhost:3306/j2eee?user=root&password=Shrikant@712002";
			Connection connection= DriverManager.getConnection(url);
			
			//Sql Query
			String query = "Select * from employee";
			
			//Step 3 : Create Platform
			Statement stmt = connection.createStatement();
			
			//Step 4 : Execute Query
			ResultSet rs = stmt.executeQuery(query);
			
			//Step 5 : Process the Data
			while(rs.next()) {
				System.out.println("Employee Id : "+rs.getInt("empId"));
				System.out.println("Employee Name : "+rs.getString("ename"));
				System.out.println("Employee Salary : "+rs.getDouble("salary"));
				System.out.println("Employee DeptNo : "+rs.getInt("deptNo"));
				System.out.println("Employee Mobile : "+rs.getLong("mobile"));
				System.out.println("Employee Email : "+rs.getString("email"));
				System.out.println("Employee Location : "+rs.getString("location"));
				System.out.println("Employee Password : "+rs.getString("password"));	
			}
			//Step 6 : Close Connection
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
