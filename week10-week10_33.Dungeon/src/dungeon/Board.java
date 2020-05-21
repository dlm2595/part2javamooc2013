/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Denzel
 */
public class Board {
    private final int x;
    private final int y;
    
    public Board(int length, int width) {
        this.x = length;
        this.y = width;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
