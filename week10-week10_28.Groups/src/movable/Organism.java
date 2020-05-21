/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Denzel
 */
public class Organism implements Movable {
    private int x;
    private int y;
    
    public Organism(int startX, int startY){
        this.x = startX;
        this.y = startY;
    }
    
    

    @Override
    public void move(int dx, int dy) {
        this.x+=dx;
        this.y+=dy;
    }
    
    @Override
    public String toString() {
        return "x: " + x + "; y: " + y; 
    }
    
}
