/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Denzel
 */
import java.util.*;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> measures;
    
    public AverageSensor() {
        sensors = new ArrayList();
        measures = new ArrayList();
    }
    
    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }
    
    public List<Integer> readings() {
        return measures;
    }

    @Override
    public boolean isOn() {
        int howManyOn = 0;
        for (Sensor i : sensors) {
            if (i.isOn()) howManyOn++;
        }
        if (howManyOn == sensors.size()) return true;
        return false;
    }

    @Override
    public void on() {
        for (Sensor i : sensors) {
            i.on();
        }
    }

    @Override
    public void off() {
        for (Sensor i : sensors ) {
            i.off();
        }
    }

    @Override
    public int measure() {
        if (!this.isOn() || this.sensors.size() ==0) {
            throw new IllegalStateException("The sensor is off");
        }
        
        int measurement = 0;
        for (Sensor i: sensors) {
            measurement += i.measure();
        }
        
        int average = measurement/sensors.size();
        measures.add(average);
        return average;
    }
}
