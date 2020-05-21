/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Denzel
 */
public class ClickListener implements ActionListener {
    
    private final Calculator calc;
    private final JLabel label;
    
    public ClickListener(Calculator calculator, JLabel label) {
        this.calc = calculator;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        label.setText(Integer.toString(calc.giveValue()));
    }
    
}
