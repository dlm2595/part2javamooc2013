
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        Thing brick;
        Suitcase suitcase;
        
        for (int i = 1; i <= 100; i++) {
            brick = new Thing("Brick", i);
            suitcase = new Suitcase(1000);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }

}
