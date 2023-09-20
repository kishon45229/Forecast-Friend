package View;

import Controller.RegisterControl;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CreateAccount extends javax.swing.JFrame {

    public CreateAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jMainPanel = new javax.swing.JPanel();
        jCloseButton = new javax.swing.JLabel();
        jMinimizeButton = new javax.swing.JLabel();
        jHeadingText = new javax.swing.JLabel();
        jFirstNameText = new javax.swing.JLabel();
        jLastNameText = new javax.swing.JLabel();
        jLastNameTextField = new javax.swing.JTextField();
        jFirstNameTextField = new javax.swing.JTextField();
        jEmailText = new javax.swing.JLabel();
        jPasswordText = new javax.swing.JLabel();
        jEmailTextField = new javax.swing.JTextField();
        jConfirmPasswordText = new javax.swing.JLabel();
        jCreateAccountButton = new javax.swing.JButton();
        jSignInButton = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jConfirmPasswordField = new javax.swing.JPasswordField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jMainPanel.setBackground(new java.awt.Color(153, 153, 255));
        jMainPanel.setPreferredSize(new java.awt.Dimension(600, 400));

        jCloseButton.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jCloseButton.setForeground(new java.awt.Color(255, 255, 255));
        jCloseButton.setText("X");
        jCloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseButtonMouseClicked(evt);
            }
        });

        jMinimizeButton.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jMinimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        jMinimizeButton.setText("-");
        jMinimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizeButtonMouseClicked(evt);
            }
        });

        jHeadingText.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        jHeadingText.setForeground(new java.awt.Color(255, 255, 255));
        jHeadingText.setText("Welcome to Forecast Friend");

        jFirstNameText.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jFirstNameText.setForeground(new java.awt.Color(255, 255, 255));
        jFirstNameText.setText("First name");

        jLastNameText.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jLastNameText.setForeground(new java.awt.Color(255, 255, 255));
        jLastNameText.setText("Last name");

        jLastNameTextField.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jLastNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jFirstNameTextField.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jFirstNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jEmailText.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jEmailText.setForeground(new java.awt.Color(255, 255, 255));
        jEmailText.setText("E-mail");

        jPasswordText.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jPasswordText.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordText.setText("Password");

        jEmailTextField.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jEmailTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jConfirmPasswordText.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jConfirmPasswordText.setForeground(new java.awt.Color(255, 255, 255));
        jConfirmPasswordText.setText("Confirm password");

        jCreateAccountButton.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jCreateAccountButton.setText("Create account");
        jCreateAccountButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jCreateAccountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCreateAccountButton.setFocusPainted(false);
        jCreateAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCreateAccountButtonMouseClicked(evt);
            }
        });

        jSignInButton.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        jSignInButton.setText("<html><u><font color=\"blue\"><html><u><font color=\"blue\">Already have an account?</font></u></html> ");
        jSignInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSignInButtonMouseClicked(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jConfirmPasswordField.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jConfirmPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jSignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordText)
                            .addComponent(jConfirmPasswordText)
                            .addComponent(jEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jConfirmPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEmailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jMainPanelLayout.createSequentialGroup()
                                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFirstNameText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLastNameText)
                                    .addComponent(jLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jMainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jHeadingText)
                                .addGap(91, 91, 91)
                                .addComponent(jMinimizeButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCloseButton)
                        .addGap(15, 15, 15))))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCloseButton)
                            .addComponent(jMinimizeButton)))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jHeadingText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLastNameText)
                    .addComponent(jFirstNameText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEmailText)
                .addGap(2, 2, 2)
                .addComponent(jEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jConfirmPasswordText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jCreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseButtonMouseClicked
        int confirmed = JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?", "Confirm Exit",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jCloseButtonMouseClicked

    private void jMinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizeButtonMouseClicked
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonMouseClicked

    private void jSignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSignInButtonMouseClicked
        final JFrame CreateAccount = this;
        CreateAccount.dispose();

        Login objLogin = new Login();
        objLogin.setVisible(true);
    }//GEN-LAST:event_jSignInButtonMouseClicked

    private void jCreateAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreateAccountButtonMouseClicked
        String firstName;
        String lastName;
        String email;
        String password;
        String confirmPassword;
        
        if (jFirstNameTextField.getText().isBlank() || jLastNameTextField.getText().isBlank() || jEmailTextField.getText().isBlank() || jPasswordField.getText().isBlank() || jConfirmPasswordField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Oops! Looks like you're in a hurry to create an account, but a few important details are missing. Please fill out all the required fields to proceed.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else {
            firstName = jFirstNameTextField.getText();
            lastName = jLastNameTextField.getText();
            email = jEmailTextField.getText();
            password = jPasswordField.getText();
            confirmPassword = jConfirmPasswordField.getText();
            
            if (password.equals(confirmPassword)) {
                final JFrame CreateAccount = this;
                CreateAccount.dispose();
                
                new RegisterControl().register(firstName, lastName, email, password);
            }
            else {
                JOptionPane.showMessageDialog(null, "OOps! It seems the passwords you entered do not match. Please make sure your password and confirm password fields contain the same value.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jCreateAccountButtonMouseClicked
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCloseButton;
    private javax.swing.JPasswordField jConfirmPasswordField;
    private javax.swing.JLabel jConfirmPasswordText;
    private javax.swing.JButton jCreateAccountButton;
    private javax.swing.JLabel jEmailText;
    private javax.swing.JTextField jEmailTextField;
    private javax.swing.JLabel jFirstNameText;
    private javax.swing.JTextField jFirstNameTextField;
    private javax.swing.JLabel jHeadingText;
    private javax.swing.JLabel jLastNameText;
    private javax.swing.JTextField jLastNameTextField;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JLabel jMinimizeButton;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jPasswordText;
    private javax.swing.JLabel jSignInButton;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
