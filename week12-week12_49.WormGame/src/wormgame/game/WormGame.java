package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;
import wormgame.domain.Worm;
import wormgame.domain.Apple;

public class WormGame extends Timer implements ActionListener {

    private final int width;
    private final int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private final Random r;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        
        this.r = new Random();
        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        
        this.apple = new Apple(this.r.nextInt(width-1)+1, this.r.nextInt(height-1)+1);
        while (this.worm.runsInto(this.apple)) {
            this.apple = new Apple(this.r.nextInt(width-1)+1, this.r.nextInt(height-1)+1);
        }
    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    public Worm getWorm() {
        return this.worm;
    }
    
    public void setWorm(Worm worm) {
        this.worm = worm;
    }
    
    public Apple getApple() {
        return this.apple;
    }
    
    public void setApple(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        this.worm.move();

        while (this.worm.runsInto(this.apple)) {
            this.setApple(new Apple(this.r.nextInt(width-1)+1, this.r.nextInt(height-1)+1));
            this.worm.grow();
        }
        if (this.worm.runsIntoItself()) this.continues = false;
        if (this.worm.getHead().getX() <= 0 || this.worm.getHead().getY() <= 0) this.continues = false;
        if (this.worm.getHead().getX() >= this.width || this.worm.getHead().getY() >= this.height) this.continues = false;
        this.updatable.update();
        this.setDelay(1000/worm.getLength());
    }

}
