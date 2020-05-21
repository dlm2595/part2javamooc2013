/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
public class Change {
    private char from;
    private char to;
    
    
    public Change(char from, char to) {
        this.from = from;
        this.to = to;
    }
    
    public String change(String characterString) {
        String toReturn  = "";
        for (int i = 0; i < characterString.length(); i++){
            if (characterString.charAt(i) == from) {
                toReturn+=to;
            } else {
                toReturn += characterString.charAt(i);
            }
        } 
        return toReturn;
    }
    
}
