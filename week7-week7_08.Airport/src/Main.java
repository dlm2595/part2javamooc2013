import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        AirportData program = new AirportData(reader);
        
        program.startAirportPanel();
        program.startFlightService();
    }
}
