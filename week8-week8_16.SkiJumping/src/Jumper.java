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

public class Jumper implements Comparable<Jumper> {
    private String name;
    private int points;
    private ArrayList<Integer> jumps;
    private Random random;
    
    public Jumper(String name) {
        this.name = name;
        this.points = 0;
        this.jumps = new ArrayList();
        this.random = new Random();
    }
    
    @Override
    public int compareTo(Jumper jumper2) {
        return this.points - jumper2.points;
    }
    
    @Override
    public String toString() {
        return name + " (" + points + " points)";
    }
    
    public void printJumps() {
        System.out.print("jump lengths: ");
        for (int i : this.jumps) {
            System.out.print(i + " m, ");
        }
        System.out.print("\b\b\n");
    }
    
    public void jump() {
        int jumpLength = random.nextInt(61) + 60;
        int[] judged = new int[5];
        for (int i =0; i<5; i++) {
            judged[i] = random.nextInt(11) + 10;
        }
        
        System.out.println("  " + name);
        System.out.println("    length: " + jumpLength);
        System.out.println("    judge votes: " + Arrays.toString(judged));
        
        Arrays.sort(judged);
        points += judged[1] + judged[2] + judged[3] + jumpLength;
        jumps.add(jumpLength);
    }
    
}
