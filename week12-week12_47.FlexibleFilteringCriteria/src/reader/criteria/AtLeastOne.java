/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Denzel
 */
public class AtLeastOne implements Criterion {
    private final Criterion[] crits;
    
    public AtLeastOne(Criterion... c) {
        this.crits = c;
    }
    
    @Override
    public boolean complies(String line) {
        for (int i = 0; i < this.crits.length; i++){
            if(this.crits[i].complies(line)) return true;
        }
        return false;
    }
    
}
