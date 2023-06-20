package com.cindytech.iautoservice.main;

//import com.cindytech.iautoservice.utils.SingleInstanceChecker;
//import com.cindytech.iautoservice.utils.Sound;
//
//import javax.swing.*;
//import java.awt.*;
//import java.io.IOException;
//import java.util.Locale;
//import java.util.Random;
//import java.util.ResourceBundle;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//
//		final Logger LOGGER = Logger.getLogger(Main.class.getName());
//
//		ResourceBundle config = ResourceBundle.getBundle("config");
//		LOGGER.info("language.config "+config.getString("language.config"));
//		ResourceBundle lang = ResourceBundle.getBundle("lang/language", new Locale(config.getString("language.config")));
//
//		Sound sound = new Sound();
//		SplashScreen screen = new SplashScreen();
////		MainController controller = new MainController();
//
//		if (!SingleInstanceChecker.isRunning()) {
//			try {
//				sound.playSound(config.getString("loading.sound"));
//				screen.setVisible(true);
//				Random rand = new Random();
//				int n = rand.nextInt(10);
//				n += 10;
//				for (int row = 0; row <=100; row++) {
//
//					Thread.sleep(n);
//
//					screen.loadingNumber.setText(Integer.toString(row)+"%");
//					screen.loadingProgress.setValue(row);
//					if (row == 10) {
//						screen.lComment.setText(lang.getString("1.loading.message"));
//					}
//					if (row == 30) {
//						screen.lComment.setText(lang.getString("2.loading.message"));
//					}
//					if (row == 50) {
//						screen.lComment.setText(lang.getString("3.loading.message"));
//					}
//					if (row == 70) {
//						screen.lComment.setText(lang.getString("4.loading.message"));
//					}
//					if (row == 90) {
//						screen.lComment.setText(lang.getString("5.loading.message"));
//					}
//					if (row == 100) {
//
//						//screen.setVisible(false);
//						screen.dispose();
//
//						try {
//							for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//								if ("Nimbus".equals(info.getName())) {
//									javax.swing.UIManager.setLookAndFeel(info.getClassName());
//									break;
//								}
//							}
//						} catch (ClassNotFoundException ex) {
////							Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//						} catch (InstantiationException ex) {
////							Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//						} catch (IllegalAccessException ex) {
////							Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//						} catch (javax.swing.UnsupportedLookAndFeelException ex) {
////							Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//						}
//
//						/* Create and display the form */
//						java.awt.EventQueue.invokeLater(new Runnable() {
//							public void run() {
//								//new Login().setVisible(true);
//								sound.stopSound();
////								controller.checkFirstLogin();
//							}
//						});
//					}
//				}
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		else {
//			sound.playSound(sound.getSystemError());
//			JLabel lMessage = new JLabel();
//			lMessage.setFont(new Font("Calibri", Font.BOLD, 15));
//			lMessage.setBackground(Color.BLACK);
//			lMessage.setForeground(Color.RED);
//			lMessage.setText("<html><b>	&nbsp;&nbsp;&nbsp; Programi eshte i hapur!</b></html>");
//			lMessage.setVerticalAlignment(0);
//			lMessage.setHorizontalAlignment(0);
//			JOptionPane.showMessageDialog(null, lMessage, "GABIM!", JOptionPane.ERROR_MESSAGE);
//
//			LOGGER.log(Level.SEVERE,"iAUTOSERVICE IS RUNNING ALREADY");
//			System.exit(0);
//		}
//	}
//
//}