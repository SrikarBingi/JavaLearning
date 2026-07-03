package com.dql;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DatabaseConnection;

public class MetaData {
	 public static void main(String[] args) throws SQLException {
		Statement statement = DatabaseConnection.getStatement();
		ResultSet rs = statement.executeQuery("select * from students");
		
		ResultSetMetaData metaData = rs.getMetaData();
		
		int colSize = metaData.getColumnCount();
		System.out.println("No of columns : "+colSize);
//		while(rs.next()) {
//			System.out.println("Id :"+rs.getInt(1)+" Name :"+rs.getString(2));
//		}
		
		for(int i=1;i<=colSize;i++) {
			System.out.println(
                    "Column Name: " + metaData.getColumnName(i)
                    + ", Data Type: " + metaData.getColumnTypeName(i)
            );
		}
		System.out.println("Students Records");
		System.out.println("Connection successful");
		
		statement.close();
	}
}
