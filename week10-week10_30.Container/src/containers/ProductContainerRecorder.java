/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Denzel
 */
public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory history;
    
    public ProductContainerRecorder(String product, double capacity, double initialVolume) {
        super(product, capacity);
        
        this.history = new ContainerHistory();
        this.history.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }
    
    public String history() {
        return history.toString();
    }
    
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        history.add(this.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        history.add(this.getVolume() - amount);
        return super.takeFromTheContainer(amount);
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.history.maxValue());
        System.out.println("Smallest product amount: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
        System.out.println("Greatest change: " + this.history.greatestFluctuation());
        System.out.println("Variance: " + this.history.variance());
    }
}
