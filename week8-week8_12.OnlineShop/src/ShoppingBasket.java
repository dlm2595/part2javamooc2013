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

public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
        this.basket = new HashMap();
    }
    
    public void add(String product, int price) {
        if (basket.containsKey(product)) {
            basket.get(product).increaseAmount();
        } else {
            Purchase toAdd = new Purchase(product, 1, price);
            basket.put(product, toAdd);
        }
    }
    
    public int price() {
        int totalPrice = 0;
        for (Purchase i:basket.values()) {
            totalPrice += i.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (String i : basket.keySet()) {
            System.out.println(basket.get(i));
        }
    }
    
}
