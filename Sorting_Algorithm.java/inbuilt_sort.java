import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {
    public static void main(String args[]) {
        int arr[] = {5, 3, 2, 6, 1};
        Integer Arr[] = {6,23,21,55,51};
        Arrays.sort(arr); 
        System.out.println("Sorted array: " + Arrays.toString(arr));  
       Arrays.sort(Arr,Collections.reverseOrder());
       System.out.println(Arrays.toString(Arr));
    }

}

