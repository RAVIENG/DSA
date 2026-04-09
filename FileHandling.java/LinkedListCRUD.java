import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        // ----- Create (Add elements) -----
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        System.out.println("Initial List: " + list);

        // ----- Read (Display elements) -----
        System.out.println("\nReading elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // ----- Update (Modify an element) -----
        System.out.println("\nUpdating element at index 1...");
        list.set(1, "Mango");  // Replace "Banana" with "Mango"
        System.out.println("List after update: " + list);

        // ----- Delete (Remove elements) -----
        System.out.println("\nDeleting element at index 2...");
        list.remove(2);  // Removes "Orange"
        System.out.println("List after deletion: " + list);

        // ----- Additional CRUD examples -----
        list.addFirst("Pineapple");  // Add at beginning
        list.addLast("Strawberry");  // Add at end
        System.out.println("\nList after adding first and last: " + list);

        list.remove("Mango");  // Remove by value
        System.out.println("List after removing Mango: " + list);
    }
}
