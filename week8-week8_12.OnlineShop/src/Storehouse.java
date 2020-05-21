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

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Storehouse() {
        prices = new HashMap();
        stock = new HashMap();
    }
    
    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        if (prices.containsKey(product)) return prices.get(product);
        return -99;
    }
    
    public int stock(String product) {
        if (stock.containsKey(product)) return stock.get(product);
        return 0;
    }
    
    public boolean take(String product) {
        if (stock.containsKey(product) && stock.get(product) > 0) {
            stock.put(product, stock.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return prices.keySet();
    }
}
