package com.jsp.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableInJDBC {
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/j2eee";
			String user = "root";
			String password = "Shrikant@712002";
			Connection connection = DriverManager.getConnection(url,user,password);
			
			String query = "create table student(sId int(20) primary key auto_increment,sName varchar(50) not null,sAddress varchar(50) not null )";
			
			Statement stmt = connection.createStatement();
			
			stmt.executeUpdate(query);
			System.out.println("Table created Successfully...");
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
