package com.cindytech.iautoservice.utils;

import javax.swing.*;
import java.awt.*;

public class ColorToggleButton extends JToggleButton {

	private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {
			Color bg, text;
			if(isSelected()) {
				bg = new Color(0, 0, 128);
				text = Color.WHITE;
				
			} else {
				bg = new Color(237, 228, 185);
				text = Color.BLACK;
			}
			
			setBackground(bg);
			setForeground(text);
			super.paintComponent(g);
		}
	}
