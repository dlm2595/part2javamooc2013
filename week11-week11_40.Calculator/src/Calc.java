/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
public class Calc {
    private int num;
    
    public Calc() {
        this.num = 0;
    }
    
    public void plus(int toAdd) {
        this.num+=toAdd;
    }
    
    public void minus(int toSubtract) {
        this.num-=toSubtract;
    }
    
    public void reset() {
        this.num=0;
    }
    
    public int getNum() {
        return this.num;
    }
}
