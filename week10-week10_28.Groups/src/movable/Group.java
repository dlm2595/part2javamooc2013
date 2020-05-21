/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;
import java.util.*;
/**
 *
 * @author Denzel
 */
public class Group implements Movable{
    private List<Movable> group;
    
    public Group() {
        group = new ArrayList();
    }
    
    public void addToGroup(Movable toAdd) {
        group.add(toAdd);
    }

    @Override
    public void move(int dx, int dy) {
        if (!group.isEmpty()) {
            for (Movable i:group) {
                i.move(dx, dy);
            }
        }
    }
    
    @Override
    public String toString() {
        String toReturn = "";
        if (!group.isEmpty()) {
            for (Movable i:group) {
                toReturn += i + "\n";
            }
        }
        return toReturn;
    }
}
