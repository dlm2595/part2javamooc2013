/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.ArrayList;
/**
 *
 * @author Denzel
 */
public class BlackHoleBox extends Box {
    private ArrayList<Thing> hole;
    
    public BlackHoleBox() {
        hole = new ArrayList();
    }
    
    @Override
    public void add(Thing thing) {
        hole.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
}
