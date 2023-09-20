package View;

import Controller.UserCityControl;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GetCity extends javax.swing.JFrame {
    public String email;

    // Default constructor
    public GetCity() {
        initComponents();
    }

    // Setter method to set the email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter method to access the email
    public String getEmail() {
        return email;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jHomeAddressTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jWorkAddressTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jNextButton = new javax.swing.JButton();
        jCloseButton1 = new javax.swing.JLabel();
        jMinimizeButton = new javax.swing.JLabel();
        jCancelButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jMainPanel.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home city");

        jHomeAddressTextField.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jHomeAddressTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Work city");

        jWorkAddressTextField.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jWorkAddressTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add your city");

        jLabel4.setFont(new java.awt.Font("SF UI  Text G", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Based on the home and work cities Forecast Friend will show weather");

        jNextButton.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jNextButton.setText("Next");
        jNextButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jNextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNextButton.setFocusPainted(false);
        jNextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNextButtonMouseClicked(evt);
            }
        });

        jCloseButton1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jCloseButton1.setForeground(new java.awt.Color(255, 255, 255));
        jCloseButton1.setText("X");
        jCloseButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseButton1MouseClicked(evt);
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

        jCancelButton.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jCancelButton.setText("Cancel");
        jCancelButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jCancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCancelButton.setFocusPainted(false);
        jCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCancelButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jHomeAddressTextField)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jWorkAddressTextField)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                        .addComponent(jMinimizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCloseButton1)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                        .addComponent(jCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCloseButton1)
                            .addComponent(jMinimizeButton)))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jHomeAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jWorkAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jCloseButton.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jCloseButton.setForeground(new java.awt.Color(255, 255, 255));
        jCloseButton.setText("X");
        jCloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(294, 294, 294)
                    .addComponent(jCloseButton)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(188, 188, 188)
                    .addComponent(jCloseButton)
                    .addContainerGap(190, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jNextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNextButtonMouseClicked
        String homeCity;
        String workCity;

        if (jHomeAddressTextField.getText().isBlank() || jWorkAddressTextField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Oops! Looks like you're in a hurry to view weather, but a few important details are missing. Please fill out all the required fields to proceed.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else {
            homeCity = jHomeAddressTextField.getText();
            workCity = jWorkAddressTextField.getText();
            
            final JFrame GetAddress = this;
            GetAddress.dispose();

            new UserCityControl().addAddress(homeCity, workCity, email);
        }
    }//GEN-LAST:event_jNextButtonMouseClicked

    private void jCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseButtonMouseClicked
        int confirmed = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to exit?", "Confirm Exit",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jCloseButtonMouseClicked

    private void jCloseButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseButton1MouseClicked
        int confirmed = JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?", "Confirm Exit",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jCloseButton1MouseClicked

    private void jMinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizeButtonMouseClicked
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonMouseClicked

    private void jCancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelButtonMouseClicked
        final JFrame GetAddress = this;
        GetAddress.dispose();

        Login objLogin = new Login();
        objLogin.setVisible(true);
    }//GEN-LAST:event_jCancelButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetCity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancelButton;
    private javax.swing.JLabel jCloseButton;
    private javax.swing.JLabel jCloseButton1;
    private javax.swing.JTextField jHomeAddressTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JLabel jMinimizeButton;
    private javax.swing.JButton jNextButton;
    private javax.swing.JTextField jWorkAddressTextField;
    // End of variables declaration//GEN-END:variables
}
