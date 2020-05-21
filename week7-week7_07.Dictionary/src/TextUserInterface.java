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

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dict = dictionary;
    }
    
    public void start() {
        System.out.println("Statements: ");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        while (true) {
            System.out.print("Statement: ");
            String statement = reader.nextLine();
            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")) {
                System.out.print("In Finnish: ");
                String finnish = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                this.dict.add(finnish, translation);
            } else if (statement.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + dict.translate(word));
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    
}
