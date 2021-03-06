
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.border.Border;
import java.io.*;
import java.util.*;



public class pattern extends javax.swing.JFrame {
    JToggleButton [][]b= new JToggleButton[3][3];
    Border NORMAL_BORDER = BorderFactory.createLineBorder(Color.RED, 3);
    public pattern()  {
        initComponents();
        generateButton.setBorder(BorderFactory.createLineBorder(new java.awt.Color(102,0,102), 3));
        generateRandomButton.setBorder(BorderFactory.createLineBorder(new java.awt.Color(102,0,102), 3));
        // making buttons in panel for pattern recognisation. 
        int x=30,y=5;
        for(int n=0;n<3;n++)
        {
            for(int m=0;m<3;m++)
            {
                b[n][m] = new RoundButton("");
                b[n][m].setBounds(x,y,40,40);
                b[n][m].setMargin(new Insets(0, 0, 0, 0));
                b[n][m].setBackground(Color.BLACK);
                b[n][m].setForeground(Color.RED);
                b[n][m].setBorder(NORMAL_BORDER);
                b[n][m].setFont(new Font("Arial", Font.BOLD, 10));
                
                patternPanel.add(b[n][m]);
                x+=70;
            }
            x=30;
            y+=80;
        }
    }
    public void resetCall()
    {
        for(int n=0;n<3;n++)
        {
            for(int m=0;m<3;m++)
            {
                b[n][m].setBackground(Color.BLACK);
                b[n][m].setText(" ");
                b[n][m].setBorder(NORMAL_BORDER);
                b[n][m].setSelected(false);
            }
        }
    }
    public void mainCall(int length)
    {
        int pattern[]= new int[9];
        int a ;
        patternCall obj = new patternCall();
        pattern = obj.nextNum(length);
        int num = 1;
        for(int numbers:pattern)
        {
            
            switch (numbers)
            {
                case 1:
                {
                    b[0][0].setText(Integer.toString(num));
                    b[0][0].doClick();
                    b[0][0].setBackground(Color.WHITE);
                    b[0][0].setBorder(NORMAL_BORDER);
                }
                break;
                case 2:
                {
                    b[0][1].setText(Integer.toString(num));
                    b[0][1].doClick();
                    b[0][1].setBackground(Color.WHITE);
                    b[0][1].setBorder(NORMAL_BORDER);
                }
                break;
                case 3:
                {
                    b[0][2].setText(Integer.toString(num));
                    b[0][2].doClick();
                    b[0][2].setBackground(Color.WHITE);
                    b[0][2].setBorder(NORMAL_BORDER);
                }
                break;
                case 4:
                {
                    b[1][0].setText(Integer.toString(num));
                    b[1][0].doClick();
                    b[1][0].setBackground(Color.WHITE);
                    b[1][0].setBorder(NORMAL_BORDER);
                }
                break;
                case 5:
                {
                    b[1][1].setText(Integer.toString(num));
                    b[1][1].doClick();
                    b[1][1].setBackground(Color.WHITE);
                    b[1][1].setBorder(NORMAL_BORDER);
                }
                break;
                case 6:
                {
                    b[1][2].setText(Integer.toString(num));
                    b[1][2].doClick();
                    b[1][2].setBackground(Color.WHITE);
                    b[1][2].setBorder(NORMAL_BORDER);
                }
                break;
                case 7:
                {
                    b[2][0].setText(Integer.toString(num));
                    b[2][0].doClick();
                    b[2][0].setBackground(Color.WHITE);
                    b[2][0].setBorder(NORMAL_BORDER);
                }
                break;
                case 8:
                {
                    b[2][1].setText(Integer.toString(num));
                    b[2][1].doClick();
                    b[2][1].setBackground(Color.WHITE);
                    b[2][1].setBorder(NORMAL_BORDER);
                }
                break;
                case 9:
                {
                    b[2][2].setText(Integer.toString(num));
                    b[2][2].doClick();
                    b[2][2].setBackground(Color.WHITE);
                    b[2][2].setBorder(NORMAL_BORDER);
                }
            }
            num++;
        }
            patternPanel.revalidate();
            patternPanel.repaint();
//        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lengthPanel = new javax.swing.JPanel();
        lengthLabel = new javax.swing.JLabel();
        lengthSlider = new javax.swing.JSlider();
        generateButton = new javax.swing.JButton();
        generateRandomButton = new javax.swing.JButton();
        patternPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 102));

        background.setBackground(new java.awt.Color(102, 0, 102));

        lengthPanel.setBackground(new java.awt.Color(204, 204, 255));

        lengthLabel.setFont(new java.awt.Font("Estrangelo Edessa", 3, 18)); // NOI18N
        lengthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lengthLabel.setLabelFor(lengthPanel);
        lengthLabel.setText("Choose the length of pattern");
        lengthLabel.setToolTipText("");
        lengthLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lengthSlider.setBackground(new java.awt.Color(204, 204, 255));
        lengthSlider.setMajorTickSpacing(1);
        lengthSlider.setMaximum(9);
        lengthSlider.setMinimum(1);
        lengthSlider.setPaintLabels(true);
        lengthSlider.setPaintTicks(true);
        lengthSlider.setSnapToTicks(true);
        lengthSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lengthSliderStateChanged(evt);
            }
        });

        generateButton.setBackground(new java.awt.Color(204, 204, 255));
        generateButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        generateButton.setText("Generate Pattern");
        generateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        generateRandomButton.setBackground(new java.awt.Color(204, 204, 255));
        generateRandomButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        generateRandomButton.setText("Generate Random Pattern");
        generateRandomButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        generateRandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateRandomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lengthPanelLayout = new javax.swing.GroupLayout(lengthPanel);
        lengthPanel.setLayout(lengthPanelLayout);
        lengthPanelLayout.setHorizontalGroup(
            lengthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lengthSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(generateRandomButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lengthPanelLayout.setVerticalGroup(
            lengthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lengthPanelLayout.createSequentialGroup()
                .addComponent(lengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lengthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generateRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout patternPanelLayout = new javax.swing.GroupLayout(patternPanel);
        patternPanel.setLayout(patternPanelLayout);
        patternPanelLayout.setHorizontalGroup(
            patternPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        patternPanelLayout.setVerticalGroup(
            patternPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lengthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patternPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lengthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patternPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lengthSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lengthSliderStateChanged
        
    }//GEN-LAST:event_lengthSliderStateChanged

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        resetCall();
        
        mainCall(lengthSlider.getValue());
//        System.out.println(lengthSlider.getValue());
    }//GEN-LAST:event_generateButtonActionPerformed

    private void generateRandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateRandomButtonActionPerformed
        resetCall();
        Random ran = new Random();
        int randomLength = ran.nextInt(9)+1;
        mainCall(randomLength);
    }//GEN-LAST:event_generateRandomButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pattern().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel background;
    public javax.swing.JButton generateButton;
    public javax.swing.JButton generateRandomButton;
    public javax.swing.JLabel lengthLabel;
    public javax.swing.JPanel lengthPanel;
    public javax.swing.JSlider lengthSlider;
    public javax.swing.JPanel patternPanel;
    // End of variables declaration//GEN-END:variables
}
