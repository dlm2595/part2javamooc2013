/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
import java.util.*;

public class Suitcase {
    private ArrayList<Thing> stuff;
    private int weightLimit;;
    
    public Suitcase(int limit) {
        this.weightLimit = limit;
        stuff = new ArrayList();
    }
    
    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= weightLimit) {
            stuff.add(thing);
        }
        
    }
    
    public void printThings() {
        for (Thing i:stuff) System.out.println(i);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Thing i : stuff) totalWeight += i.getWeight();
        return totalWeight;
    }
    
    public Thing heaviestThing() {
        if (stuff.isEmpty()) return null;
        Thing toReturn = stuff.get(0);
        for (Thing i : stuff) {
            if (i.getWeight() > toReturn.getWeight()) toReturn = i;
        } 
        return toReturn;
    }
    
    @Override
    public String toString() {
        if (totalWeight() == 0 ) return "empty (0 kg)";
        if (stuff.size() == 1) return "1 thing (" + totalWeight() + "kg)";
        return stuff.size() + " things (" + totalWeight() + " kg)";
    }
    
}
