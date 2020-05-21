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

public class Dictionary {
    private HashMap<String, String> dict;
    
    public Dictionary() {
        dict = new HashMap();
    }
    
    public String translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation) {
        dict.put(word, translation);
    }
    
    public int amountOfWords() {
        return dict.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> toReturn = new ArrayList();
        for(String i :dict.keySet()) {
            toReturn.add(i + " = " + dict.get(i));
        }
        return toReturn;
    }
}
