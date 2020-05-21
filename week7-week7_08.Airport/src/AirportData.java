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

public class AirportData {
    private HashMap<String, Plane> planes;
    private ArrayList<Flight> flights;
    private Scanner reader;
    
    public AirportData(Scanner reader) {
        planes = new HashMap();
        this.reader = reader;
        flights = new ArrayList();
    }
    
    public void startAirportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println(" ");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight]");
            System.out.println("[x] Exit");
            
            String choice = reader.nextLine();
            
            if (choice.equals("1")) {
                
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine());
                addPlane(id, capacity);
                
            } else if (choice.equals("2")) {
                
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String from = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String to = reader.nextLine();
                addFlight(id, from, to);
                
            } else if (choice.equals("x")) {
                break;
            }
        }
    }
    
    public void startFlightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println(" ");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights]");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            
            String choice = reader.nextLine();
            
            if (choice.equals("1")) {
                
                printPlanes();
                
            } else if (choice.equals("2")) {
                
                printFlights();
                
            } else if (choice.equals("3")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                printInfo(id);
            } else if (choice.equals("x")) {
                break;
            }
        }
    }
    
    private void addPlane(String id, int capacity) {
        Plane toAdd = new Plane(id, capacity);
        planes.put(id, toAdd);
    }
    
    private void addFlight(String id, String from, String to){
        Plane plane = planes.get(id);
        Flight toAdd = new Flight(plane, from, to);
        flights.add(toAdd);
    }
    
    private void printPlanes() {
        for (String key : planes.keySet()) {
            System.out.println(planes.get(key));
        }
    }
    
    private void printFlights() {
        for (Flight i: flights) {
            System.out.println(i);
        }
    }
    
    private void printInfo(String id) {
        System.out.println(planes.get(id));
    }
}
