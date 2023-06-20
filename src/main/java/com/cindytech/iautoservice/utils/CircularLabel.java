package com.cindytech.iautoservice.utils;


import javax.swing.*;
import java.awt.*;

public class CircularLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	public CircularLabel(String text) {
        super(text);
        setPreferredSize(new Dimension(50, 50)); // imposta la dimensione del JLabel
        setOpaque(false); // rende il JLabel trasparente
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Disegna un'ellisse con il colore di sfondo del JLabel
        g.setColor(getBackground());
        g.fillOval(0, 0, getWidth() - 1, getHeight() - 1);
        // Chiama il metodo paintComponent della superclasse per disegnare il testo
        super.paintComponent(g);
    }
}
