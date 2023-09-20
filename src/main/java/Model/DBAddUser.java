package Model;

import java.sql.Statement;

public class DBAddUser {
    Statement stmt;
    
    public void addUser(String firstName, String lastName, String email, String password) {
        try {
            stmt = DBConnection.getStatementConnection(); 
            
            //Execute update
            stmt.executeUpdate("INSERT INTO accounts(`First name`, `Last name`, `E-mail`, `Password`, `Home`, `Work`) VALUES ('"+firstName+"','"+lastName+"','"+email+"','"+password+"','','')");
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
