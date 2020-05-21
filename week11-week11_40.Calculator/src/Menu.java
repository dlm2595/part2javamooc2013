
import java.awt.GridLayout;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
public final class Menu extends JPanel{
    
    private final Calc calc;
    private final JTextField up;
    private final JTextField down ;
    
    public Menu(Calc calc, JTextField up, JTextField down) {
        super(new GridLayout(1,3));
        this.calc = calc;
        this.up = up;
        this.down = down;
        this.makePanel();
    }
    
    public void makePanel() {
        
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton z = new JButton("Z");
        z.setEnabled(false);
        
        CalcListener spyPlus = new CalcListener(calc, up, down, "plus", z);
        CalcListener spyMinus = new CalcListener(calc, up, down, "minus", z);
        CalcListener spyReset = new CalcListener(calc, up, down, "reset", z);
        
        plus.addActionListener(spyPlus);
        minus.addActionListener(spyMinus);
        z.addActionListener(spyReset);
        
        add(plus);
        add(minus);
        add(z);
    }

    
}
