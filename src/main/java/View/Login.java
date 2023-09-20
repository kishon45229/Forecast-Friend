package View;

import Controller.LoginControl;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanel = new javax.swing.JPanel();
        jLeftPanel = new javax.swing.JPanel();
        jLeftPanelText1 = new javax.swing.JLabel();
        jLeftPanelText2 = new javax.swing.JLabel();
        jLeftPanelText3 = new javax.swing.JLabel();
        jContinueAsGuestButton = new javax.swing.JButton();
        jRightPanel = new javax.swing.JPanel();
        jRightPanelText1 = new javax.swing.JLabel();
        jRightPanelText2 = new javax.swing.JLabel();
        jEmailText = new javax.swing.JLabel();
        jEmailTextField = new javax.swing.JTextField();
        jPasswordText = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jForgotPasswordButton = new javax.swing.JLabel();
        jRightPanelText3 = new javax.swing.JLabel();
        jCreateAccountButton = new javax.swing.JLabel();
        jRightPanelText4 = new javax.swing.JLabel();
        jCloseButton = new javax.swing.JLabel();
        jMinimizeButton = new javax.swing.JLabel();
        jSignInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        jMainPanel.setPreferredSize(new java.awt.Dimension(600, 450));

        jLeftPanel.setBackground(new java.awt.Color(153, 153, 255));
        jLeftPanel.setMinimumSize(new java.awt.Dimension(300, 450));
        jLeftPanel.setPreferredSize(new java.awt.Dimension(300, 450));

        jLeftPanelText1.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jLeftPanelText1.setForeground(new java.awt.Color(255, 255, 255));
        jLeftPanelText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLeftPanelText1.setText("No Signup Required");

        jLeftPanelText2.setFont(new java.awt.Font("SF UI Display", 0, 16)); // NOI18N
        jLeftPanelText2.setForeground(new java.awt.Color(255, 255, 255));
        jLeftPanelText2.setText("Simply Continue as Guest and");

        jLeftPanelText3.setFont(new java.awt.Font("SF UI Display", 0, 16)); // NOI18N
        jLeftPanelText3.setForeground(new java.awt.Color(255, 255, 255));
        jLeftPanelText3.setText("Explore Weather Forecasts Today");

        jContinueAsGuestButton.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jContinueAsGuestButton.setText("Continue as guest");
        jContinueAsGuestButton.setBorder(null);
        jContinueAsGuestButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jContinueAsGuestButton.setFocusPainted(false);
        jContinueAsGuestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jContinueAsGuestButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLeftPanelLayout = new javax.swing.GroupLayout(jLeftPanel);
        jLeftPanel.setLayout(jLeftPanelLayout);
        jLeftPanelLayout.setHorizontalGroup(
            jLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLeftPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLeftPanelLayout.createSequentialGroup()
                        .addComponent(jLeftPanelText2)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLeftPanelLayout.createSequentialGroup()
                        .addComponent(jLeftPanelText1)
                        .addGap(63, 63, 63))))
            .addGroup(jLeftPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLeftPanelText3)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLeftPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jContinueAsGuestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jLeftPanelLayout.setVerticalGroup(
            jLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLeftPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLeftPanelText1)
                .addGap(30, 30, 30)
                .addComponent(jLeftPanelText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLeftPanelText3)
                .addGap(18, 18, 18)
                .addComponent(jContinueAsGuestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        jRightPanel.setPreferredSize(new java.awt.Dimension(300, 450));

        jRightPanelText1.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        jRightPanelText1.setText("Hello Again!");
        jRightPanelText1.setToolTipText("");
        jRightPanelText1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jRightPanelText2.setFont(new java.awt.Font("SF UI Display", 0, 15)); // NOI18N
        jRightPanelText2.setText("Sign in to explore personalized weather");

        jEmailText.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jEmailText.setText("E-mail");

        jEmailTextField.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jEmailTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jPasswordText.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jPasswordText.setText("Password");

        jPasswordField.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jForgotPasswordButton.setFont(new java.awt.Font("SF UI Display", 0, 15)); // NOI18N
        jForgotPasswordButton.setForeground(new java.awt.Color(0, 102, 204));
        jForgotPasswordButton.setText("<html><u><font color=\"blue\">Forgot password?</font></u></html> ");
        jForgotPasswordButton.setToolTipText("");
        jForgotPasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jForgotPasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jForgotPasswordButtonMouseClicked(evt);
            }
        });

        jRightPanelText3.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        jRightPanelText3.setText("New here?");

        jCreateAccountButton.setFont(new java.awt.Font("SF UI Display", 0, 16)); // NOI18N
        jCreateAccountButton.setForeground(new java.awt.Color(0, 102, 204));
        jCreateAccountButton.setText("<html><u><font color=\"blue\"><html><u><font color=\"blue\">Create account</font></u></html> ");
        jCreateAccountButton.setToolTipText("");
        jCreateAccountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCreateAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCreateAccountButtonMouseClicked(evt);
            }
        });

        jRightPanelText4.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        jRightPanelText4.setText("or");

        jCloseButton.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jCloseButton.setText("X");
        jCloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseButtonMouseClicked(evt);
            }
        });

        jMinimizeButton.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jMinimizeButton.setText("-");
        jMinimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizeButtonMouseClicked(evt);
            }
        });

        jSignInButton.setBackground(new java.awt.Color(153, 153, 255));
        jSignInButton.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jSignInButton.setForeground(new java.awt.Color(255, 255, 255));
        jSignInButton.setText("Sign in");
        jSignInButton.setBorder(null);
        jSignInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSignInButton.setFocusPainted(false);
        jSignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSignInButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jRightPanelLayout = new javax.swing.GroupLayout(jRightPanel);
        jRightPanel.setLayout(jRightPanelLayout);
        jRightPanelLayout.setHorizontalGroup(
            jRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRightPanelLayout.createSequentialGroup()
                        .addComponent(jRightPanelText1)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRightPanelLayout.createSequentialGroup()
                        .addComponent(jMinimizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCloseButton)
                        .addGap(25, 25, 25))))
            .addGroup(jRightPanelLayout.createSequentialGroup()
                .addGroup(jRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jRightPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jForgotPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordText)
                            .addComponent(jEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRightPanelText2)
                            .addComponent(jEmailText)))
                    .addGroup(jRightPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jSignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jRightPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jRightPanelText4))
                    .addGroup(jRightPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jRightPanelText3))
                    .addGroup(jRightPanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jCreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jRightPanelLayout.setVerticalGroup(
            jRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jRightPanelLayout.createSequentialGroup()
                        .addGroup(jRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCloseButton))
                        .addGap(29, 29, 29))
                    .addComponent(jRightPanelText1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRightPanelText2)
                .addGap(18, 18, 18)
                .addComponent(jEmailText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jForgotPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRightPanelText4)
                .addGap(8, 8, 8)
                .addComponent(jRightPanelText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                .addComponent(jLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jForgotPasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jForgotPasswordButtonMouseClicked
        JOptionPane.showMessageDialog(null, "No worries! If you've forgotten your password, we'll help you reset it. Follow the steps to regain access to your account.");
    }//GEN-LAST:event_jForgotPasswordButtonMouseClicked

    private void jCreateAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreateAccountButtonMouseClicked
        final JFrame Login = this;
        Login.dispose();

        CreateAccount objCreateAccount = new CreateAccount();
        objCreateAccount.setVisible(true);
    }//GEN-LAST:event_jCreateAccountButtonMouseClicked

    private void jCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseButtonMouseClicked
        int confirmed = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to exit?", "Confirm Exit",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jCloseButtonMouseClicked

    private void jMinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizeButtonMouseClicked
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonMouseClicked

    private void jSignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSignInButtonMouseClicked
        final JFrame Login = this;
        Login.dispose();
        
        String email = null;
        String password = null;
        
        if (jEmailTextField.getText().isBlank() || jPasswordField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Hey there! It seems you missed entering your login details. Please fill in both your email and password to proceed.","Error",JOptionPane.ERROR_MESSAGE);
        
            Login objLogin = new Login();
            objLogin.setVisible(true);
        }
        else {
            email = jEmailTextField.getText();
            password = jPasswordField.getText();
            
            new LoginControl().login(email, password);
        }
    }//GEN-LAST:event_jSignInButtonMouseClicked

    private void jContinueAsGuestButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContinueAsGuestButtonMouseClicked
        final JFrame Login = this;
        Login.dispose();
        
        GuestDashboard objNewJFrame = new GuestDashboard();
        objNewJFrame.setVisible(true);
    }//GEN-LAST:event_jContinueAsGuestButtonMouseClicked
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCloseButton;
    private javax.swing.JButton jContinueAsGuestButton;
    private javax.swing.JLabel jCreateAccountButton;
    private javax.swing.JLabel jEmailText;
    private javax.swing.JTextField jEmailTextField;
    private javax.swing.JLabel jForgotPasswordButton;
    private javax.swing.JPanel jLeftPanel;
    private javax.swing.JLabel jLeftPanelText1;
    private javax.swing.JLabel jLeftPanelText2;
    private javax.swing.JLabel jLeftPanelText3;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JLabel jMinimizeButton;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jPasswordText;
    private javax.swing.JPanel jRightPanel;
    private javax.swing.JLabel jRightPanelText1;
    private javax.swing.JLabel jRightPanelText2;
    private javax.swing.JLabel jRightPanelText3;
    private javax.swing.JLabel jRightPanelText4;
    private javax.swing.JButton jSignInButton;
    // End of variables declaration//GEN-END:variables
}