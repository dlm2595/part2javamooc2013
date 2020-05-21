/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;
import java.util.ArrayList;
/**
 *
 * @author Denzel
 */
public abstract class Moveable {
    private Coordinates place;
    
    public Moveable(int x, int y, Board board) {
        this.place = new Coordinates(x, y, board);
    }
    
    public void moveW() {   
        place.move(0, -1);   
    }
    
    public void moveD() {        
        place.move(1, 0);        
    }
    
    public void moveS() {      
        place.move(0, 1);    
    }
    
    public void moveA() {
            place.move(-1, 0);
    }
    
    public void moveChar(char direction) {
        if (direction == 'w') this.moveW();
        if (direction == 'd') this.moveD();
        if (direction == 's') this.moveS();
        if (direction == 'a') this.moveA();
    }
    
    
    public abstract void move(String command, ArrayList<Moveable> pawns);
    
    public Coordinates getPlace() {
        return place;
    }
}
