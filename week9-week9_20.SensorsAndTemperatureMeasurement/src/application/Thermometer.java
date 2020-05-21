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

public class Thermometer implements Sensor {
    private int state;
    private Random random;
    
    public Thermometer() {
        this.state = 0;
        random = new Random();
    }
    
    @Override
    public boolean isOn() {
        if (state == 1) return true;
        return false;
    }
    
    @Override
    public void on() {
        this.state = 1;
    }
    
    @Override
    public void off() {
        this.state = 0;
    }
    
    @Override
    public int measure() {
        if (state ==1 ) return random.nextInt(60)-30;
        throw new IllegalArgumentException("faulty reading");
    }
}
