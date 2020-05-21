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
public class ContainerHistory {
    private ArrayList<Double> history;
    
    public ContainerHistory() {
        history = new ArrayList();
    }
    
    public void add(double situation) {
        history.add(situation);
    }
    
    public void reset() {
        history.clear();
    }
    
    public double maxValue() {
        if (history.isEmpty()) return 0.0;
        
        return Collections.max(history);
    }
    
    public double minValue() {
        if (history.isEmpty()) return 0.0;
        
        return Collections.min(history);
    }
    
    public double average() {
        if (history.isEmpty()) return 0.0;
        
        double sum = 0.0;
        
        for (double i : history) sum+=i;
        
        return sum/history.size();
    }
    
    public double greatestFluctuation() {
        if (history.size()<=1) return 0.0;
        
        double maxfluc = 0.0;
        
        for (int i=1; i<history.size(); i++) {
            System.out.println(maxfluc);
            if (Math.abs(history.get(i)-history.get(i-1)) > maxfluc) {
                
                maxfluc = Math.abs(history.get(i)-history.get(i-1));
            } 
        }
        
        return maxfluc;
    }
    
    public double variance() {
        if (history.size() <=1) return 0.0;
        
        double sum = 0.0;
        
        for (double i:history) {
            sum+=Math.pow((i-this.average()), 2);
        }
        
        return sum/(history.size()-1);
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
}
