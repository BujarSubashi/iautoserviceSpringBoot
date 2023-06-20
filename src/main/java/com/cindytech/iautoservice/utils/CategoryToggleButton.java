package com.cindytech.iautoservice.utils;

import javax.swing.*;
import java.awt.*;

public class CategoryToggleButton extends JToggleButton {

	private static final long serialVersionUID = 1L;
	ColorLayout colorLayout = new ColorLayout();
	
	
		public void paintComponent(Graphics g) {
			Color bg, text;
			if(isSelected()) {
				bg = colorLayout.getGold();
				text = Color.WHITE;
		
			} else {
				bg = new Color(153, 0, 0);
				text = new Color(255, 255, 255);
			}
			
			setBackground(bg);
			setForeground(text);
			super.paintComponent(g);
		}
	}
