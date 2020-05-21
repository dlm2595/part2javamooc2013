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

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> cases;
    private int totalWeight;
    
    public Container(int max) {
        this.maxWeight = max;
        cases = new ArrayList();
        totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight + suitcase.totalWeight() <= maxWeight) {
            cases.add(suitcase);
            totalWeight += suitcase.totalWeight();
        }
    }
    
    public void printThings() {
        for (Suitcase i : cases) i.printThings();
    }
    
    @Override
    public String toString() {
        return cases.size() + " suitcases (" + totalWeight + " kg)";
    }
}
