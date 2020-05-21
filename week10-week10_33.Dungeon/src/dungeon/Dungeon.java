/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Denzel
 */
public class Dungeon {
    private final Board board;
    private final int vampires;
    private int moves;
    private final boolean vampiresMove;
    private final Scanner reader;
    private ArrayList<Moveable> pawns;
    private final Random random;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.board = new Board(length, height);
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove; 
        this.reader = new Scanner(System.in);
        this.pawns = new ArrayList();
        this.random = new Random();
    }
    
    public void run() {
        Player player = new Player(board);
        pawns.add(player);
        
        for (int i = 0; i < vampires; i++) {
            boolean legalVamp = true;
            
            int x = random.nextInt(board.getX()-1);
            int y = 1+random.nextInt(board.getY()-1);
            
            Vampire v = new Vampire(x, y, board);
            
            for (Moveable m:pawns) {
                if (v.getPlace().equals(m.getPlace())) legalVamp = false;
            }
            
            if (legalVamp) pawns.add(v);
            else i--;
        }
        
        for (int i = moves; i > 0; i--) {
            
            System.out.println(i);
            System.out.println("");
            for (Moveable m:pawns) System.out.println(m + " " + m.getPlace());
            System.out.println("");
            for(int y = 0; y < board.getY(); y++) {
                for (int x = 0; x < board.getX(); x++) {
                    Coordinates currentLoop = new Coordinates(x, y, board);
                    boolean printed = false;
                    for (Moveable j:pawns) {
                        if (currentLoop.equals(j.getPlace())) {
                            System.out.print(j);
                            printed = true;
                        }
                    }
                    if (!printed) System.out.print(".");
                }
                System.out.print("\n");
            } 
            
            String command = reader.nextLine();
            if (command.equals("quit")) break;
            if (command.equals("exit")) break;
            if (command.equals("exit()")) break;
            
            try {
                player.move(command, pawns);
           
                if (i==0) {
                    System.out.println("YOU LOSE!");
                    break;
                }
                
                if (vampiresMove) {
                    int size = pawns.size();
                    for (int p = 1; p < pawns.size(); p++) {
                        Moveable vamp = pawns.get(p);
                        vamp.move(command, pawns);
                        if (size > pawns.size()) p--;
                    }
                }
                
                if (pawns.size() == 1) {
                    System.out.println("YOU WIN!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Illegal move combination. We'll deduct a turn because the automated test is an asshole.");
                
            }
        }
    }
}
