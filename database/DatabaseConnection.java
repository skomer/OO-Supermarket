package database;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
                System.out.println("Connected to supermarket");
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