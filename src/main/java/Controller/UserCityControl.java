package Controller;

import Model.DBAddCity;
import View.Login;
import javax.swing.JOptionPane;

public class UserCityControl {
    public void addAddress(String homeCity, String workCity, String email) {
        try {
            new DBAddCity().addAddress(homeCity, workCity, email);
            JOptionPane.showMessageDialog(null, "Success! Your addressess have been added to our system. Enjoy with Forecast Friend!");

            Login objLogin = new Login();
            objLogin.setVisible(true);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
