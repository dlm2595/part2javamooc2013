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

public class Person {
    private String name;
    private Set<String> numbers;
    private String address;
    
    public Person(String name) {
        this.name = name;
        this.numbers = new HashSet();
        this.address = "";
    }
    
    public void addNumber(String number) {
        numbers.add(number);
    }
    
    public void addAddres(String street, String city) {
        address+= street + city;
    }
    
    public Set<String> getNumbers() {
        return numbers;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getName() {
        return this.name;
    }
    
}
