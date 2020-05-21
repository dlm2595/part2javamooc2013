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

public class PhoneSearch {
    private Map<String, Person> phoneBook;
    public Scanner reader;
    
    public PhoneSearch() {
        this.phoneBook = new HashMap();
        this.reader = new Scanner(System.in);
    }
    
    public void run() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        
        while(true) {
            System.out.print("command: ");
            String command = reader.nextLine();
            
            if (command.equals("x")) break;
            
            if (command.equals("1")) this.addNumber();
            
            if (command.equals("2")) this.searchNumber();
            
            if (command.equals("3")) this.searchByNumber();
            
            if (command.equals("4")) this.addAddress();
            
            if (command.equals("5")) this.getInfo();
            
            if (command.equals("6")) this.clearInfo();
        }
    }
    
    public void addNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number  = reader.nextLine();
        
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).addNumber(number);
        } else {
            phoneBook.put(name, new Person(name));
            phoneBook.get(name).addNumber(number);
        }
    }
    
    public void searchNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        
        if (!phoneBook.containsKey(name)) System.out.println("  not found");
        else {
            Set<String> numbers = phoneBook.get(name).getNumbers();
            for (String i:numbers) System.out.println(i);
        }
    }
    
    public void searchByNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();
        int found = 0;
        for (Person i:phoneBook.values()) {
            if (i.getNumbers().contains(number)) {
                System.out.println(" " + i.getName());
                found = 1;
                break;
            }
        }
        if (found == 0) System.out.println(" not found");
    }
    
    public void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        
        if (phoneBook.containsKey(name)) phoneBook.get(name).addAddres(street, city);
        
        else {
            phoneBook.put(name, new Person(name));
            phoneBook.get(name).addAddres(street, city);
        }
    }
    
    public void getInfo() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        if (!phoneBook.containsKey(name)) System.out.println("  person not found");
        
        else {
            Person person = phoneBook.get(name);
            
            if (person.getAddress().isEmpty()) System.out.println("  address unknown");
            else {
                System.out.println("  address: " + person.getAddress());
            }
            
            if (person.getNumbers().isEmpty()) System.out.println("  phone number not found");
            else {
                System.out.println("  phone numbers:");
                for (String i:person.getNumbers()) System.out.println(i);
            }
        }
    }
    
    public void clearInfo() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        phoneBook.remove(name);
    }
}
