/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
public class Plane {
    private String id;
    private int capacity;
    
    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getId() {
        return this.id;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    @Override
    public String toString() {
        return id + " (" + capacity + " ppl)";
    }
    
}
