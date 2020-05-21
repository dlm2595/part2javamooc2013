/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Denzel
 */
public class ActionEventListener implements ActionListener {
    private JTextField area1;
    private JLabel area2;
    
    public ActionEventListener(JTextField a1, JLabel a2) {
        this.area1 = a1;
        this.area2 = a2;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.area2.setText(this.area1.getText());
        this.area1.setText("");
    }
    
}
