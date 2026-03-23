package Day4.ExceptionHandling;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckedReal2 {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement stmt = (Statement) conn.createStatement();

            ResultSet rs = ((java.sql.Statement) stmt).executeQuery("SELECT * FROM users");

            while(rs.next()){
                System.out.println("User: "+rs.getString("username"));
            }
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Database error: "+e.getMessage());
        }
    }
}
