import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create ArrayList with duplicates
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        System.out.println("Original List: " + list);

        // Remove duplicates
        ArrayList<String> uniqueList = new ArrayList<>();
        for (String item : list) {
            if (!uniqueList.contains(item)) {  // check if already added
                uniqueList.add(item);
            }
        }

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
