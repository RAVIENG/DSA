import java.util.LinkedList;

public class LinkedListMethodsDemo {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 1. Add elements
        list.add("A");                 // add at end
        list.add("B");                 
        list.add(1, "C");              // add at index 1
        list.addFirst("Start");        // add at beginning
        list.addLast("End");           // add at end
        System.out.println("After adding: " + list);
        // Output: [Start, A, C, B, End]

        // 2. Get elements
        System.out.println("Element at index 2: " + list.get(2)); // C

        // 3. Remove elements
        list.remove();                  // remove first
        list.remove(1);                 // remove element at index 1
        list.remove("End");             // remove by value
        System.out.println("After removing: " + list);
        // Output: [A, B]

        // 4. Update element
        list.set(1, "Z");               // replace element at index 1
        System.out.println("After set: " + list);
        // Output: [A, Z]

        // 5. Check if empty
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        // 6. Clear list
        list.clear();
        System.out.println("After clear: " + list);
        // Output: []
    }
}
