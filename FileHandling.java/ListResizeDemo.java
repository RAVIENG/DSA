import java.util.ArrayList;
import java.util.Vector;

public class ListResizeDemo {
    public static void main(String[] args) {

        // ----- ArrayList Example -----
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("ArrayList initial capacity: 10 (default)");

        for (int i = 1; i <= 15; i++) { // add more than 10 elements
            al.add(i);
            System.out.println("Added " + i + ", size: " + al.size());
        }
        System.out.println("ArrayList final size: " + al.size());

        System.out.println("\n--- Vector Example ---");

        // ----- Vector Example -----
        Vector<Integer> v = new Vector<>();
        System.out.println("Vector initial capacity: 10 (default)");

        for (int i = 1; i <= 25; i++) { // add more than 10 elements
            v.add(i);
            System.out.println("Added " + i + ", size: " + v.size());
        }
        System.out.println("Vector final size: " + v.size());
    }
}

