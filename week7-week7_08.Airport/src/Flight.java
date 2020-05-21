/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
public class Flight {
    private String origin;
    private String destination;
    private Plane plane;
    
    public Flight (Plane plane, String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
        this.plane = plane;
    }
    
    public String getOrigin() {
        return origin;
    }
    
    public String getDestination() {
        return destination;
    }
    
    @Override
    public String toString() {
        return plane + " ("+ origin + "-" + destination + ")";
    }
    
}
