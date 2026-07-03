package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.constants.Constants;

public class DatabaseConnection {
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(Constants.URL, Constants.DB_USER_NAME, Constants.DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static Statement getStatement() {
		Connection conn = getConnection();
		try {
			return conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
