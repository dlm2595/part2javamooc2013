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

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        this.owners = new HashMap();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (owners.get(plate) != null) {
            owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate i : owners.keySet()) {
            System.out.println(i);
        } 
    }
    
    public void printOwners() {
        Collection<String> ownerList = owners.values();
        ArrayList<String> printed = new ArrayList();
        
        for (String i : ownerList) {
            if (!printed.contains(i)) {
                System.out.println(i);
                printed.add(i);
            }
        } 
    }
    
}
