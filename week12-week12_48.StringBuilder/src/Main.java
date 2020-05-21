
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder toReturn = new StringBuilder();
        toReturn.append("{\n ");
        int counter = 0;
        for (int i = 0; i < t.length; i++) {
            if (counter == 4 && i==(t.length-1)) {
                toReturn.append("\n ");
                toReturn.append(t[i]);
                toReturn.append("\n");
                counter = 1;
            } else if (counter==4) {
                toReturn.append("\n ");
                toReturn.append(t[i]);
                toReturn.append(", ");
                counter = 1;
            } else if(i == t.length-1) {
                toReturn.append(t[i]);
                toReturn.append("\n");
            } else {
                toReturn.append(t[i]);
                toReturn.append(", ");
                counter++;
            }
        }
        toReturn.append("}");
        return toReturn.toString();
    }
}
