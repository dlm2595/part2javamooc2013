/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.Random;
/**
 *
 * @author Denzel
 */
public class Cow implements Alive, Milkable{
    private String name;
    private double capacity;
    private double amount;
    private final Random random = new Random();
    
    private static final String[] NAMES = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + random.nextDouble()*25;
    }
    
    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length-1)]);
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {
        return this.capacity;
    }
    
    public double getAmount() {
        return this.amount;
    }

    @Override
    public void liveHour() {
        amount+= 0.7+random.nextDouble()*1.3;
        if (amount>capacity) amount = capacity;
    }

    @Override
    public double milk() {
        double milked = this.amount;
        this.amount=0;
        return milked;
    }
    
    @Override
    public String toString() {
        return this.name + " " + Math.ceil(amount) + "/" + Math.ceil(this.capacity);
    }
}
