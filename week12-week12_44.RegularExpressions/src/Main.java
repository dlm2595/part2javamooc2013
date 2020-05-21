import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            String input = reader.nextLine();
            
            if (isAWeekDay(input)) System.out.println("weekday");
            else if (allVowels(input)) System.out.println("vowels");
            else if (clockTime(input)) System.out.println("time");
            else if (input.equals("quit")) break;
            else System.out.println("none");
        }
    }
    
    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u|y|ä|ë|ï|ö|ü)*");
    }
    
    public static boolean clockTime(String string) {
        return string.matches("([0-1][0-9]):([0-5][0-9]):([0-5][0-9])") ||
                string.matches("(2[0-3]):([0-5][0-9]):([0-5][0-9])");
    }
}
