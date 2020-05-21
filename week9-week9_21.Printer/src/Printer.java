/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
import java.util.Scanner;
import java.io.File;

public class Printer {
    private String filename;
    private Scanner reader;
    
    public Printer(String filename) throws Exception {
        this.filename = filename;
        
    }
    
    public void printLinesWhichContain(String word) throws Exception {
        
        File file = new File(filename);
        reader = new Scanner(file);
        
        while (reader.hasNext()) {
            String sentence = reader.nextLine();
            
            if (sentence.contains(word)) {
                System.out.println(sentence);
            }
        }
        
    }
}
