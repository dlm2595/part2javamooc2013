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
public class Coordinates {
    private int x;
    private int y;
    private Board board;
    
    public Coordinates(int x, int y, Board board) {
        if(x<0 || y<0) throw new IllegalArgumentException();
        this.x = x;
        this.y = y;
        this.board = board;
    }
    
    public void move(int dx, int dy) {
        if (this.x + dx < 0 || this.x + dx >= board.getX() ||
                this.y + dy < 0 || this.y + dy >= board.getY()) {
            throw new IllegalArgumentException();
        }
        this.x+=dx;
        this.y+=dy;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public Board getBoard() {
        return this.board;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) return false;
        
        Coordinates compared = (Coordinates) other;
        
        if (this.x == compared.x && this.y == compared.y) return true;
        else return false;
    }
    
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
    
    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}
