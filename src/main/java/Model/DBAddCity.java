package Model;

import static Model.DBConnection.stmt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBAddCity {
    public void addAddress(String homeCity, String workCity, String email) {
        try {
            stmt = DBConnection.getStatementConnection(); 
            
            ResultSet resultSet = stmt.executeQuery("SELECT UserId FROM accounts WHERE `E-mail` = '"+email+"'");
            
            int userId = -1;
            if (resultSet.next()) {
                userId = resultSet.getInt("UserId");
                
                // Construct the SQL query with dynamically set column names
                String sql = "UPDATE accounts SET Home = ?, Work = ? WHERE UserId = ?";
                
                // Use a prepared statement for the update
                PreparedStatement updateStatement = stmt.getConnection().prepareStatement(sql);
                
                updateStatement.setString(1, homeCity);
                updateStatement.setString(2, workCity);
                updateStatement.setInt(3, userId);
                
                updateStatement.executeUpdate();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
