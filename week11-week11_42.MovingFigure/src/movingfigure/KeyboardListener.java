/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Component;
/**
 *
 * @author Denzel
 */
public class KeyboardListener implements KeyListener {
    
    private Component comp;
    private Figure fig;
    
    public KeyboardListener(Component comp, Figure fig) {
        this.comp = comp;
        this.fig = fig;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                fig.move(-1, 0);
                break;
            case KeyEvent.VK_RIGHT:
                fig.move(1, 0);
                break;
            case KeyEvent.VK_DOWN:
                fig.move(0, 1);
                break;
            case KeyEvent.VK_UP:
                fig.move(0, -1);
                break;
            default:
                break;
        }
        
        comp.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
