/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.*;
/**
 *
 * @author Denzel
 */
public class OneThingBox extends Box {
    private ArrayList<Thing> thing;
    
    public OneThingBox() {
        this.thing = new ArrayList();
    }

    @Override
    public void add(Thing thing) {
        if (this.thing.isEmpty()) this.thing.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.thing.contains(thing);
    }
    
    
}
