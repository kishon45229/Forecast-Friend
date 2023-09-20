package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
    static Connection conn;
    static Statement stmt = null;
    
    public static Statement getStatementConnection() {
        try {
            //Establish connection
            String url = "jdbc:mysql://localhost:3306/weatherapplication?zeroDateTimeBehavior=CONVERT_TO_NULL";
            conn = DriverManager.getConnection(url, "root", "");
            
            //Create Connection
            stmt = conn.createStatement();
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
        
    return stmt;
    }
}
