package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password = "Srikar@123";
		Connection conn = DriverManager.getConnection(url,username,password);
		Statement stmt = conn.createStatement();
		
//		String query = "insert into students values (1,'Srikar')";
//		stmt.executeUpdate(query);
//		stmt.executeUpdate("insert into students values (2,'Keerthana')");
//		stmt.executeUpdate("alter table students modify id int primary key auto_increment");
		stmt.executeUpdate("insert into students (name) values ('bunny')");
		System.out.println("Connection successful");
		
		stmt.close();
		conn.close();
	}
}
