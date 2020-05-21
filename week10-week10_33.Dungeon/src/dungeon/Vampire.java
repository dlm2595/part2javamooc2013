/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Denzel
 */


public class Vampire extends Moveable {
    private final Random random;
    
    public Vampire(int x, int y, Board board) {
        super(x,y,board);
        this.random = new Random();
    }
    
    @Override
    public void move(String command, ArrayList<Moveable> pawns) {
        char[] options = {'w', 'd', 's','a'};
        for (int i = 0; i < command.length(); i++){
            
            int index = random.nextInt(options.length);
            try {
                this.moveChar(options[index]);
                if (this.getPlace().equals(pawns.get(0).getPlace())) pawns.remove(this);
            } catch (Exception e) {
                i--;
            }
        }
    }
    
    @Override
    public String toString() {
        return "v";
    }
}
