import java.util.*;

public class HashOperation {
    public static void main(String args[]){

        // 🔹 HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); 

        System.out.println("HashSet: " + hashSet);

        // operations
        hashSet.remove(20);
        System.out.println("After remove(20): " + hashSet);

        System.out.println("Contains 10? " + hashSet.contains(10));
        System.out.println("Size: " + hashSet.size());
        System.out.println("Is Empty? " + hashSet.isEmpty());

        System.out.println();

        // 🔹 LinkedHashSet
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(30);
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(10);

        System.out.println("LinkedHashSet: " + linkedSet);

        // operations
        linkedSet.remove(20);
        System.out.println("After remove(20): " + linkedSet);

        System.out.println("Contains 10? " + linkedSet.contains(10));
        System.out.println("Size: " + linkedSet.size());
        System.out.println("Is Empty? " + linkedSet.isEmpty());

        System.out.println();

        // 🔹 TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);

        System.out.println("TreeSet: " + treeSet);

        // operations
        treeSet.remove(20);
        System.out.println("After remove(20): " + treeSet);

        System.out.println("Contains 10? " + treeSet.contains(10));
        System.out.println("Size: " + treeSet.size());
        System.out.println("Is Empty? " + treeSet.isEmpty());
    }
}