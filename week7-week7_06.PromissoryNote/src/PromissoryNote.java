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

public class PromissoryNote {
    private HashMap<String, Double> loan;
    
    public PromissoryNote() {
        loan = new HashMap();
    }
    
    public void setLoan(String toWhom, double value){
        loan.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        if (loan.containsKey(whose)) return loan.get(whose);
        return 0;
    }
    
}
