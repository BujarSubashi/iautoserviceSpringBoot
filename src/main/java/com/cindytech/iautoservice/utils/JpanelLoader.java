/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cindytech.iautoservice.utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author coolsasisndu
 */
public class JpanelLoader {

	private Timer timer;

	public  void jPanelLoader(JPanel Main,JPanel setPanel){
		Main.removeAll();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(Main);
		Main.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(setPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(setPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
				);
		System.gc();

	}


	public  void update(JPanel Main){

		// Crea il timer con un ritardo di 20 secondi (20000 millisecondi)
		int delay = 10000;
		timer = new Timer(delay, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Aggiunge il childPanel al parentPanel dopo 20 secondi di inattività
				Main.removeAll();

				Main.repaint();
			}
		});

		// Imposta il timer come non ripetitivo
		timer.setRepeats(false);

		// Avvia il timer quando si crea il pannello
		timer.start();
	}

	// Metodo per fermare il timer
	public void stopTimer() {
		timer.stop();
	}

}
