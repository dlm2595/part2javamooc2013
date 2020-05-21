/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author Denzel
 */
import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;
    private Scanner reader;
    
    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() {
        
        try {
            reader = new Scanner(file);
        } catch(Exception e) {
            System.out.println("error");
        }
        
        
        int lines = 0;
        
        while (reader.hasNextLine()) {
            lines++;
            
            reader.nextLine();
                    
        }
        
        return lines;
    }
    
    public int characters() {
        try {
            reader = new Scanner(file);
        } catch(Exception e) {
            System.out.println("error");
        }
        
        int chars = 0;
        
        while (reader.hasNextLine()) {
            String word = reader.nextLine();
            
            chars += word.length();
            chars++;
        }
        
        return chars;
    }
}
