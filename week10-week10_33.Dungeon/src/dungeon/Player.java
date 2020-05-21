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
public class Player extends Moveable {
    
    public Player(Board board) {
        super(0,0, board);
    }
    
    @Override
    public void move(String command, ArrayList<Moveable> pawns) {
        for (int i = 0; i < command.length(); i++) {
            this.moveChar(command.charAt(i));
            
            for (int j = 1; j < pawns.size(); j++) {
                
                Moveable vamp = pawns.get(j);
                if (this.getPlace().equals(vamp.getPlace())){
                    
                    pawns.remove(vamp);
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return "@";
    }
}
