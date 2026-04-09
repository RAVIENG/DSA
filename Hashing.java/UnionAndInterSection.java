import java.util.*;
public class UnionAndInterSection {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int arr1[] = {1,2,3,6,2,4,5};
        int arr2[] = {2,4,5};

        for(int i=0; i<arr1.length ; i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println(set.size());
        set.clear();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        int count =0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr1[i])){
                count++;
                set.remove(arr1[i]);
            }
        }

        System.out.println(count);
    }
}
