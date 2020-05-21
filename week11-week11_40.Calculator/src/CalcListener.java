/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Denzel
 */
public class CalcListener implements ActionListener{
    private JTextField fieldUp;
    private JTextField fieldDown;
    private Calc calc;
    private String action;
    private JButton z;
    
    public CalcListener(Calc calc, JTextField field1, JTextField field2, String action, JButton z) {
        this.fieldUp = field1;
        this.fieldDown = field2;
        this.calc = calc;
        this.action = action;
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (this.action.equals("plus")) calc.plus(Integer.parseInt(fieldDown.getText()));
            else if (this.action.equals("minus")) calc.minus(Integer.parseInt(fieldDown.getText()));
            else calc.reset();

            fieldUp.setText(Integer.toString(calc.getNum()));
            if (Integer.parseInt(fieldUp.getText()) == 0) {
                z.setEnabled(false);
            } else {
                z.setEnabled(true);
            }

            
        } catch (Exception e) {
            
        }
        fieldDown.setText("");
    }
    
}
