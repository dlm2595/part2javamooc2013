/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Denzel
 */
public class ProductContainer extends Container{
    private String product;
    
    public ProductContainer(String product, double capacity) {
        super(capacity);
        this.product = product;
    }
    
    public String getName(){
        return this.product;
    }
    
    public void setName(String name) {
        this.product = name;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + super.toString();
    }
}
