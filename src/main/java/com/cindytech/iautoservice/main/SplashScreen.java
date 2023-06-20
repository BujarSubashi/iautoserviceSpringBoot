  
package com.cindytech.iautoservice.main;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 *
 * @author ShurdhiDo
 */
public class SplashScreen extends javax.swing.JFrame {

	private static final long serialVersionUID = 6296460579852059661L;
	
	/**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
    	initComponents();
    	setResizable(false);
    	setIconImage(Toolkit.getDefaultToolkit().getImage(SplashScreen.class.getResource("/icon/splashscreen/loading.png")));
    	setLocationRelativeTo(null);
    }

	
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBorder(new LineBorder(new Color(0, 0, 128), 5));
        jPanel1.setBackground(Color.WHITE);
        loadingProgress = new javax.swing.JProgressBar();
        loadingProgress.setForeground(new Color(0, 0, 255));
        loadingProgress.setBackground(new Color(255, 255, 255));
        lComment = new javax.swing.JLabel();
        lComment.setBackground(Color.DARK_GRAY);
        lLogo = new javax.swing.JLabel();
        lLogo.setIcon(new ImageIcon(SplashScreen.class.getResource("/icon/login/repair-gif-4.gif")));
        lLogo.setForeground(Color.WHITE);
        lLogo.setBackground(Color.BLUE);
        lLogo.setFont(new Font("Script MT Bold", Font.BOLD, 34));
        loadingNumber = new javax.swing.JLabel();
        loadingNumber.setHorizontalAlignment(SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(Color.BLACK);
        setUndecorated(true);

        loadingProgress.setMaximumSize(new Dimension(500, 5));
        loadingProgress.setMinimumSize(new Dimension(500, 5));
        loadingProgress.setPreferredSize(new Dimension(500, 5));

        lComment.setFont(new Font("Times New Roman", 1, 12)); // NOI18N
        lComment.setForeground(Color.DARK_GRAY);
        lComment.setText("Loading ...");

        lLogo.setHorizontalAlignment(SwingConstants.CENTER);

        loadingNumber.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
        loadingNumber.setForeground(new Color(0, 0, 255));
        loadingNumber.setText("99");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(loadingProgress, GroupLayout.PREFERRED_SIZE, 440, Short.MAX_VALUE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(lComment, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(loadingNumber, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lLogo, GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lLogo, GroupLayout.PREFERRED_SIZE, 329, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lComment, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(loadingNumber, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
        			.addComponent(loadingProgress, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1.setLayout(jPanel1Layout);

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lLogo;
    javax.swing.JLabel lComment;
    javax.swing.JLabel loadingNumber;
    javax.swing.JProgressBar loadingProgress;
    // End of variables declaration                   
}