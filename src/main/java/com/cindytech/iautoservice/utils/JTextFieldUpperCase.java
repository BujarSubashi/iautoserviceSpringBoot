package com.cindytech.iautoservice.utils;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class JTextFieldUpperCase extends JTextField {
    
	private static final long serialVersionUID = 1L;

	public JTextFieldUpperCase(int columns) {
        super(columns);
        // Crea un DocumentFilter per convertire il testo in maiuscolo
        DocumentFilter filter = new DocumentFilter() {
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                fb.insertString(offset, text.toUpperCase(), attr);
            }

            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                fb.replace(offset, length, text.toUpperCase(), attrs);
            }
        };
        // Aggiungi il DocumentFilter al modello di testo del JTextField
        AbstractDocument document = (AbstractDocument) getDocument();
        document.setDocumentFilter(filter);
    }
}
