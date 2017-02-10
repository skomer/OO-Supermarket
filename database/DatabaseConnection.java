package database;

import java.sql.*;
import java.util.Properties;
 
// modified from 
// http://www.codejava.net/java-se/jdbc/connect-to-postgresql-database-server-via-jdbc


public class DatabaseConnection {
 
    public static void main(String[] args) {
        Connection conn = null;
 
        try {
            String db = "jdbc:postgresql:supermarket";
            conn = DriverManager.getConnection(db);
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM customers;");
                while (rs.next()) {
                    String name = rs.getString("name");
                    System.out.println(name);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}