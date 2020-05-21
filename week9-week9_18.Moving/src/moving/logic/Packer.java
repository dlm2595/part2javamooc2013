/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import moving.domain.*;
import java.util.*;
/**
 *
 * @author Denzel
 */
public class Packer {
    private int boxesVolume;
    
    public Packer(int volume) {
        this.boxesVolume = volume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        ArrayList<Box> toReturn = new ArrayList();
        Box box = new Box(boxesVolume);
        for (Thing i :things) {
            if (!box.addThing(i)) {
                toReturn.add(box);
                box = new Box(boxesVolume);
                box.addThing(i);
            }
            
        }
        toReturn.add(box);
        return toReturn;
    }
}
