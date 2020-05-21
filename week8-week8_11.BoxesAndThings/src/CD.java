/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int year;
    
    private final double WEIGHT = 0.1;
    
    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
    
    public double weight() {
        return WEIGHT;
    }
    
    @Override
    public String toString() {
        return artist + ": " + title + " (" + year + ")";
    }
}
