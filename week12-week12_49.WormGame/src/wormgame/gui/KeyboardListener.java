/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;
import java.awt.event.KeyEvent;
import wormgame.domain.Worm;
import java.awt.event.KeyListener;
import wormgame.Direction;
/**
 *
 * @author Denzel
 */
public class KeyboardListener implements KeyListener{
    private final Worm worm;
    
    public KeyboardListener(Worm worm) {
        this.worm = worm;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: worm.setDirection(Direction.UP);
                break;
            case KeyEvent.VK_DOWN: worm.setDirection(Direction.DOWN);
                break;
            case KeyEvent.VK_LEFT: worm.setDirection(Direction.LEFT);
                break;
            case KeyEvent.VK_RIGHT: worm.setDirection(Direction.RIGHT);
                break;
            default: break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
