
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        System.out.println("");
        printWithSmileys("Beerbottle");
        System.out.println("");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String input) {
        if (input.length()%2 == 0) {
            for (int i = 0; i < 3; i++) {
                for (int j= 0; j < input.length()/2 + 3; j++) {
                    if (i != 1) {
                        System.out.print(":)");
                    } else {
                        if (j == 1) {
                            System.out.print(" " + input + " ");
                        } else if (j == 0 || j == input.length()/2 + 2){
                            System.out.print(":)");
                        }
                    }
                }
                System.out.print("\n");
            }
            
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j= 0; j < input.length()/2 + 4; j++) {
                    if (i != 1) {
                        System.out.print(":)");
                    } else {
                        if (j == 1) {
                            System.out.print(" " + input + "  ");
                        } else if (j == 0 || j == input.length()/2 + 2){
                            System.out.print(":)");
                        }
                    }
                }
                System.out.print("\n");
            }
        }
    }

}
