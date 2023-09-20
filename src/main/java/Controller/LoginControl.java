package Controller;

import Model.DBSearchUser;
import View.Login;
import View.UserDashboard;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginControl {
    public static void login(String Email, String Password) {
        String DB_email = null;
        String DB_password = null;
        String homeCity = null;
        String workCity = null;
        String city = null;
        String email = null;
         
        try {
            ResultSet rs = new DBSearchUser().searchUser();
            
            int op = 0;
            
            while(rs.next()) {
                DB_email = rs.getString("E-mail");
                DB_password = rs.getString("Password"); 
                
                if(DB_email.equals(Email) && (DB_password.equals(Password))) {
                    JOptionPane.showMessageDialog(null, "Welcome back! Enjoy checking the weather updates.");
                    
                    homeCity = rs.getString("Home");
                    workCity = rs.getString("Work");
                    email = rs.getString("E-mail");
                    
                    String[] options = {"Home", "Work"};
                    int choice = JOptionPane.showOptionDialog(null, "Select a place to get weather details:", "Home or Work", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
                    if (choice == 0) {   
                        System.out.println("You selected Home. Continuing to Home...");
                        city = homeCity;
                        System.out.println(city);
                    } 
                    else if (choice == 1) {
                        System.out.println("You selected Work. Continuing to Work...");
                        city = workCity;
                    } 
                    
                    UserDashboard objUserDashboard = new UserDashboard();
                    objUserDashboard.updateWeatherData(city, email); 
                    objUserDashboard.setVisible(true);
                    
                    op = 1;
                    break;
                }           
            } 
            
            if (op == 0) {
                JOptionPane.showMessageDialog(null,"Oops, it seems there was an issue with your login credentials. Please double-check and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            
                Login objLogin = new Login();
                objLogin.setVisible(true);
            } 
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
