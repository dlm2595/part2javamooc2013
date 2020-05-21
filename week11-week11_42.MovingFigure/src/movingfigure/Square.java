/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Denzel
 */
public class Square extends Figure {
    
    private final int sides;
    
    public Square(int x, int y, int sides) {
        super(x, y);
        this.sides = sides;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(), sides, sides);
    }
    
}
