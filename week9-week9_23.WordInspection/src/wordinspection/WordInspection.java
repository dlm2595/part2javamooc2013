/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

/**
 *
 * @author Denzel
 */
import java.io.File;
import java.util.*;

public class WordInspection {
    private File file;
    private Scanner reader;
    
    public WordInspection(File file) {
        this.file = file;
    }
    
    public int wordCount() {
        int words = 0;
        
        try {
            reader = new Scanner(file);
        } catch(Exception e) {
            System.out.println("Error reading file");
        }
        
        while (reader.hasNext()) {
            words++;
            reader.next();
        }
        reader.close();
        return words;
    }
    
    public List<String> wordsContainingZ() throws Exception {
        reader = new Scanner(file, "UTF-8");
        ArrayList<String> zWords = new ArrayList();
        
        while (reader.hasNext()) {
            String word = reader.next();
            
            if (word.contains("z")||word.contains("Z")) zWords.add(word);
        }
        reader.close();
        return zWords;
    }
    
    public List<String> wordsEndingInL() throws Exception {
        reader = new Scanner(file, "UTF-8");
        ArrayList<String> lWords = new ArrayList();
        
        while (reader.hasNext()) {
            String word = reader.next();
            
            if (word.charAt(word.length()-1) == 'l') lWords.add(word);
        }
        reader.close();
        return lWords;
    }
    
    public List<String> palindromes() throws Exception {
        reader = new Scanner(file, "UTF-8");
        ArrayList<String> words = new ArrayList();
                
        while (reader.hasNext()) {
            String word = reader.next();
            
            String reversedString = "";

            for(int i = word.length() - 1; i >= 0; i--) reversedString += word.charAt(i);
            
            if (word.equals(reversedString)) words.add(word);
        }
        reader.close();
        return words;
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception {
        reader = new Scanner(file, "UTF-8");
        ArrayList<String> words = new ArrayList();
        
        while (reader.hasNext()) {
            String word = reader.next();
            
            if (word.contains("a") &&
                word.contains("e") &&
                word.contains("i") &&
                word.contains("o") &&
                word.contains("u") &&
                word.contains("y") &&
                word.contains("ä") &&
                word.contains("ö"))
                words.add(word);
        }
        reader.close();
        return words;
    }
}
