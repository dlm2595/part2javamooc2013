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

public class Tournament {
    ArrayList<Jumper> participants;
    Scanner reader;
    
    public Tournament() {
        participants = new ArrayList();
        reader = new Scanner(System.in);
    }
    
    public void addJumpers() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String nameToAdd = reader.nextLine();
            if (nameToAdd.isEmpty()) {
                System.out.println("");
                break;
            }
            participants.add(new Jumper(nameToAdd));
        }
    }
    
    public void beginTournament() {
        System.out.println("The tournament begins!");
        System.out.println("");
        int round = 1;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            System.out.println("");
            if (command.equals("quit")) break;
            
            System.out.println("Round " + round);
            System.out.println("");
            
            Collections.sort(participants);
            
            System.out.println("Jumping order:");
            
            for (int i = 0; i < participants.size(); i++) {
                int turn = i + 1;
                System.out.println("  " + turn + ". " + participants.get(i));
            }
            System.out.println("");
            
            System.out.println("Results of round "+ round);
            
            for (Jumper i : participants) i.jump();
            System.out.println("");
            
            round++;
        }  
        System.out.println("Thanks!");
        System.out.println("");
    }
    
    public void showResults() {
        Collections.sort(participants);
        Collections.reverse(participants);
        
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        for (int i = 0; i < participants.size(); i++) {
            int position = i +1;
            System.out.println(position + "           " + participants.get(i));
            System.out.print("            ");
            participants.get(i).printJumps();
        }
    }
}
