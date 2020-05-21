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
public class Not implements Criterion {
    private final Criterion crit;
    
    public Not(Criterion crit) {
        this.crit = crit;
    }
    
    @Override
    public boolean complies(String line) {
        return !crit.complies(line);
    }
    
}
