import java.util.*;

public class MergeSortLinkedList {

    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        // Base case
        if (list.size() <= 1) {
            return list;
        }   
        int mid = list.size() / 2;
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();

        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }
        for (int i = mid; i < list.size(); i++) {
            right.add(list.get(i));
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    
    public static LinkedList<Integer> merge(LinkedList<Integer> left,LinkedList<Integer> right) {
        LinkedList<Integer> result = new LinkedList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.peek() <= right.peek()) {
                result.add(left.poll());
            } else {
                result.add(right.poll());
            }
        }

        result.addAll(left);
        result.addAll(right);

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(6);

        System.out.println("Before sorting: " + list);

        list = mergeSort(list);

        System.out.println("After sorting: " + list);
    }
}
