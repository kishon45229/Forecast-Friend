package Controller;

import Model.DBAddUser;
import Model.DBSearchUser;
import View.CreateAccount;
import View.GetCity;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class RegisterControl {
    
    public void register(String firstName, String lastName, String email, String password) {
        String DB_email = null;
       
        try {
            ResultSet rs = new DBSearchUser().searchUser();
            
            int op = 0;
            
            while(rs.next()) {
                DB_email = rs.getString("E-mail"); 
                
                if ((DB_email.equals(email))){
                    JOptionPane.showMessageDialog(null,"Sorry, but it looks like this email is already associated with an account. Please use a different email or try signing in.", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    CreateAccount objCreateAccount = new CreateAccount();
                    objCreateAccount.setVisible(true);
                    
                    op = 1;
                    break;      
                } 
            } 
                    
            if (op == 0) {
                new DBAddUser().addUser(firstName, lastName, email, password);
                JOptionPane.showMessageDialog(null, "Congratulations! Your account has been successfully created. Add your home and work city to continue. 🎉");
                
                GetCity objGetAddress = new GetCity();
                objGetAddress.setEmail(email); // Set the email using the setter
                objGetAddress.setVisible(true);
            }          
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
