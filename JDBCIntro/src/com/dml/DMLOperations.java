package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
		
//		String query = "insert into students (name) values ('Ramesh'),('Milky')";
//		stmt.executeUpdate(query);
//		stmt.executeUpdate("insert into students values (2,'Keerthana')");
//		stmt.executeUpdate("alter table students modify id int primary key auto_increment");
//		stmt.executeUpdate("insert into students (name) values ('bunny')");
		
//		int rows = stmt.executeUpdate(query);
//		System.out.println("Rows inserted :"+rows);
		
		String query = "select * from students";
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			System.out.println("Id :"+id+" Name :"+name);
		}
		System.out.println("Connection successful");
		
		stmt.close();
		conn.close();
	}
}
