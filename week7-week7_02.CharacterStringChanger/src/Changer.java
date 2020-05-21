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

public class Changer {
    private ArrayList<Change> list;
    
    public Changer() {
        list = new ArrayList();
    }
    
    public void addChange(Change change) {
        list.add(change);
    }
    
    public String change(String characterString) {
        String toReturn = characterString;
        
        for (Change i : list) {
            toReturn = i.change(toReturn);
        }
        return toReturn;
    }
}
