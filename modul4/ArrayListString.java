import java.util.ArrayList;
import java.util.Collections;
public class ArrayListString {
    public static void main(String args[]) {
        ArrayList<String> animals = new ArrayList<String>();
            animals.add("snake");
            animals.add("kangaroo");
            animals.add("wombat");
            animals.add("bird");
        System.out.println("\nSEBELUM DISORTING");
            for (int i = 0; i < animals.size(); i++) {
                System.out.println("animal " + i + " : " + animals.get(i));
                }
            Collections.sort(animals);
            System.out.println("\nSETELAH DISORTING");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.println("animal " + i + " : " + animals.get(i));
                }
    }
}