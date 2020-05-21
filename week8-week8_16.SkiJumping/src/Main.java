
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Tournament tournament = new Tournament();
        
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        tournament.addJumpers();
        tournament.beginTournament();
        tournament.showResults();
    }
}
