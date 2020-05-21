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
public class LengthAtLeast implements Criterion {
    private final int atLeast;
    
    public LengthAtLeast(int x) {
        this.atLeast = x;
    }
    
    @Override
    public boolean complies(String line) {
        return line.length() >= atLeast;
    }
    
}
