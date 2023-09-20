package Model;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBSearchUser {
    ResultSet rs;
    Statement stmt;
    
    public ResultSet searchUser() {
        try {
            stmt = DBConnection.getStatementConnection();
            
            //Execute Query
            rs = stmt.executeQuery("SELECT * FROM accounts");
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
        
    return rs;
    } 
}
