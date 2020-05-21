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

public class Calculator {
    private Reader reader;
    private int statistics;
    
    public Calculator() {
        reader = new Reader();
        statistics = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private void sum() {
        statistics++;
        
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        
        System.out.print("value2");
        int value2 = reader.readInteger();
        
        int sum = value1+value2;
        System.out.println("Sum of the values: " + sum);
    }
    
    private void difference() {
        statistics++;
        
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        
        System.out.print("value2");
        int value2 = reader.readInteger();
        
        int diff = value1-value2;
        System.out.println("Difference of the values: " + diff);
    }
    
    private void product() {
        statistics++;
        
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        
        System.out.print("value2");
        int value2 = reader.readInteger();
        
        int product = value1*value2;
        System.out.println("Product of the values: " + product);
    }
    
    private void statistics() {
        System.out.println("Calculations done: " + statistics);
    }
}
