package com.cindytech.iautoservice.utils;

import javax.swing.*;
import java.util.Enumeration;

public class GroupButtonUtils {

    public JButton getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
            	System.out.println("3");
            	System.out.println(button);
            	//button.get
                return (JButton) button;
               
            }
            System.out.println("4");
        }

        return null;
    }
}