/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Denzel
 */
public class MindfulDictionary {
    private HashMap<String, String> dict1;
    private HashMap<String, String> dict2;
    private String file;
    
    public MindfulDictionary() {
        this.dict1 = new HashMap();
        this.dict2 = new HashMap();
    }
    
    public MindfulDictionary(String file) {
        this();
        
        this.file = file;
    }
    
    public void add(String word, String translation) {
        if (!dict1.containsKey(word) && !dict2.containsKey(word)) {
            dict1.put(word, translation);
            dict2.put(translation, word);
        }
    }
    
    public String translate(String word) {
        if (dict1.containsKey(word)) return dict1.get(word);
        if (dict2.containsKey(word)) return dict2.get(word);
        return null;
    }
    
    public void remove(String word) {
        if (dict1.containsKey(word)) {
            String translation = dict1.get(word);
            dict1.remove(word);
            dict2.remove(translation);
        } else if (dict2.containsKey(word)) {
            String translation = dict2.get(word);
            dict2.remove(word);
            dict1.remove(translation);
        }
    }
    
    public boolean load() {
        try {
            Scanner reader = new Scanner(new File(file));
            while (reader.hasNextLine()) {
                String entry = reader.nextLine();

                String[] parts = entry.split(":");

                this.add(parts[0], parts[1]);
            }
            return true;
            
        } catch (FileNotFoundException e) {
            return false;
        }
    }
    
    public boolean save() {
        try {
            FileWriter writer = new FileWriter(file);
            for (String i:dict1.keySet()) {
                String entry = i + ":" + dict1.get(i)+"\n";
                writer.write(entry);
            }
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }      
    }
}
