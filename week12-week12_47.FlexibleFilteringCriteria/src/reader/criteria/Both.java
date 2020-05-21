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
public class Both implements Criterion {
    private final Criterion criterion1;
    private final Criterion criterion2;
    
    public Both(Criterion crit1, Criterion crit2) {
        this.criterion1 = crit1;
        this.criterion2 = crit2;
    }
    
    @Override
    public boolean complies(String line) {
        return this.criterion1.complies(line) && this.criterion2.complies(line);
    }
    
}
