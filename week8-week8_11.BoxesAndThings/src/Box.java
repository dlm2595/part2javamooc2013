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

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> storage;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.storage = new ArrayList();
    }
    

    public double weight() {
        double weight = 0;
        for (ToBeStored i : storage) {
            weight += i.weight();
        }
        return weight;
    }
    
    public void add(ToBeStored object) {
        if (this.weight() + object.weight() <= maxWeight) {
            storage.add(object);
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + storage.size() + " things, total weight " + this.weight() + " kg";
    }
     
}
