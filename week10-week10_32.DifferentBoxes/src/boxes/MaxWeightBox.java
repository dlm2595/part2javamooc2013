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
public class MaxWeightBox extends Box {
    private final int maxWeight;
    private ArrayList<Thing> things;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things=new ArrayList();
    }

    @Override
    public void add(Thing thing) {
        int weight = 0;
        for (Thing i:things) weight+=i.getWeight();
        if (weight+thing.getWeight()<=this.maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
    
}
