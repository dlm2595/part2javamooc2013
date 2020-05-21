/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Denzel
 */
public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
    }
    
    public BulkTank() {
        this(2000.0);
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace() {
        return capacity-volume;
    }
    
    public void addToTank(double amount) {
        if (amount+volume > capacity) volume = capacity;
        else volume+=amount;
    }
    
    public double getFromTank(double amount) {
        volume-=amount;
        if (volume < 0) {
            amount+=volume;
            volume = 0;
        }
        return amount;
    }
    
    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
    
}
