package View;

import javax.swing.JOptionPane;

public class LoadingScreen extends javax.swing.JFrame {

    public LoadingScreen() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMainPanel = new javax.swing.JPanel();
        jApplicationName1 = new javax.swing.JLabel();
        jApplicationName2 = new javax.swing.JLabel();
        jLoadingBar = new javax.swing.JProgressBar();
        jLoadingText = new javax.swing.JLabel();
        jLoadingPercentage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 250));
        setMinimumSize(new java.awt.Dimension(500, 250));
        setUndecorated(true);

        jMainPanel.setBackground(new java.awt.Color(153, 153, 255));
        jMainPanel.setForeground(new java.awt.Color(153, 153, 255));
        jMainPanel.setMaximumSize(new java.awt.Dimension(500, 250));
        jMainPanel.setMinimumSize(new java.awt.Dimension(500, 250));

        jApplicationName1.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jApplicationName1.setForeground(new java.awt.Color(255, 255, 255));
        jApplicationName1.setText("FORECAST");

        jApplicationName2.setFont(new java.awt.Font("SF UI Display", 0, 36)); // NOI18N
        jApplicationName2.setForeground(new java.awt.Color(255, 255, 255));
        jApplicationName2.setText("FRIEND");
        jApplicationName2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLoadingBar.setBackground(new java.awt.Color(153, 153, 255));
        jLoadingBar.setForeground(new java.awt.Color(255, 255, 255));
        jLoadingBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 1, 1, 1));
        jLoadingBar.setMaximumSize(new java.awt.Dimension(32767, 8));
        jLoadingBar.setPreferredSize(new java.awt.Dimension(146, 5));

        jLoadingText.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jLoadingText.setForeground(new java.awt.Color(255, 255, 255));
        jLoadingText.setText("Starting....");

        jLoadingPercentage.setFont(new java.awt.Font("SF Pro Text", 0, 15)); // NOI18N
        jLoadingPercentage.setForeground(new java.awt.Color(255, 255, 255));
        jLoadingPercentage.setText("0 %");

        jLabel2.setFont(new java.awt.Font("SF UI Display", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stay informed about the weather conditions around the world");

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jApplicationName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jApplicationName2))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLoadingText)
                        .addGap(394, 394, 394)
                        .addComponent(jLoadingPercentage))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLoadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(75, 75, 75)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jApplicationName1)
                    .addComponent(jApplicationName2))
                .addGap(71, 71, 71)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLoadingText))
                    .addComponent(jLoadingPercentage))
                .addGap(2, 2, 2)
                .addComponent(jLoadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        LoadingScreen objLoadingScreen = new LoadingScreen();
        objLoadingScreen.setVisible(true);
        
        try {
            for (int i = 1; i <= 100; i++) {
                Thread.sleep(100);
            
                if (i == 5) {
                    objLoadingScreen.jLoadingText.setText("Warming up our servers to deliver your weather snapshot...");
                    objLoadingScreen.jLoadingBar.setValue(i);
                    objLoadingScreen.jLoadingPercentage.setText(i + "%");
                }
                if (i == 20) {
                    objLoadingScreen.jLoadingText.setText("Chasing clouds and tracking temperatures...");
                    objLoadingScreen.jLoadingBar.setValue(i);
                    objLoadingScreen.jLoadingPercentage.setText(i + "%");
                }
                if (i == 35) {
                    objLoadingScreen.jLoadingText.setText("Loading sunshine, raindrops, and everything in between...");
                    objLoadingScreen.jLoadingBar.setValue(i);
                    objLoadingScreen.jLoadingPercentage.setText(i + "%");
                }
                if (i == 48) {
                    objLoadingScreen.jLoadingText.setText("Fetching wind whispers and humidity secrets...");
                    objLoadingScreen.jLoadingBar.setValue(i);
                    objLoadingScreen.jLoadingPercentage.setText(i + "%");
                }
                if (i == 65) {
                    objLoadingScreen.jLoadingText.setText("Calculating rain probabilities and cloud formations...");
                    objLoadingScreen.jLoadingBar.setValue(i);
                    objLoadingScreen.jLoadingPercentage.setText(i + "%");
                }
                if (i == 92) {
                    objLoadingScreen.jLoadingText.setText("Predicting the unpredictable with science and technology...");
                    objLoadingScreen.jLoadingBar.setValue(i);
                    objLoadingScreen.jLoadingPercentage.setText(i + "%");
                }
                if (i == 98) {
                    objLoadingScreen.jLoadingText.setText("Weather or not, here comes your update!");
                    objLoadingScreen.jLoadingBar.setValue(i);
                    objLoadingScreen.jLoadingPercentage.setText(i + "%");
                }
                if (i == 100) {
                    objLoadingScreen.jLoadingText.setText("Alright! Now bringing You tomorrow's skies today...");
                    objLoadingScreen.jLoadingBar.setValue(i);
                    objLoadingScreen.jLoadingPercentage.setText(i + "%");
                } 
            }
        } 
        catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        LoadingScreen.getFrames()[0].dispose();
        Login objLogin = new Login();
        objLogin.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jApplicationName1;
    private javax.swing.JLabel jApplicationName2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jLoadingBar;
    private javax.swing.JLabel jLoadingPercentage;
    private javax.swing.JLabel jLoadingText;
    private javax.swing.JPanel jMainPanel;
    // End of variables declaration//GEN-END:variables
}