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

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    
    public Hand() {
        hand = new ArrayList();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        for (Card i: hand) {
            System.out.println(i);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    @Override
    public int compareTo(Hand hand) {
        int thisTotal = 0;
        int hand2Total = 0;
        
        for (Card i : this.hand) thisTotal += i.getValue();
        for (Card i : hand.hand) hand2Total += i.getValue();
        
        return thisTotal - hand2Total;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
