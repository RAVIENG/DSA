import java.util.*;
public class MajorityElement {
    public static void main(String args[]) {
        int arr[] = {1, 3, 4, 5, 6, 7, 2, 3, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // if (map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     map.put(arr[i], 1);
            // }

            map.put(arr[i] , map.getOrDefault(arr[i], 0)+1);
        }

        for (int k : map.keySet()) {
            if (map.get(k) > arr.length / 3) {
                System.out.println(k);
            }
        }
    }
}
