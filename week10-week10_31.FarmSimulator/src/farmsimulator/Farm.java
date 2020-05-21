/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.*;
/**
 *
 * @author Denzel
 */
public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows;
    
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList();
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public void addCow(Cow cow) {
        cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }
    
    public void manageCows() {
        barn.takeCareOf(cows);
    }
    
    @Override
    public void liveHour() {
        for (Cow cow:cows) {
            cow.liveHour();
        }
    }
    
    @Override
    public String toString() {
        if (cows.isEmpty()) {
            return "Farm owner: " + this.owner + "\nBarn bulk tank: " + this.barn
                    + "\nNo cows.\n";
        }
        String cowstring = "Animals:\n";
        for (Cow cow:cows) cowstring += cow.toString()+"\n";
        return "Farm owner: " + this.owner + "\nBarn bulk tank: " + this.barn
                    + "\n" + cowstring;
    }
}
