import java.util.*;
public class Array_list {
    public static ArrayList<Integer> findallindex(int arr[],int key,int i){
        ArrayList<Integer> list = new ArrayList<>();

        if(i==arr.length){
            return list;
        }

        if(key==arr[i]){
            list.add(i);   
        }
      
        ArrayList<Integer> ansFromBelow = findallindex(arr, key, i + 1);
   
        list.addAll(ansFromBelow);

        return list;
    

}


    
    public static void main(String args[]){
       int arr[] = {2,5,6,78,9,4,5,4};
       int key = 4;
       int i = 0;
    ArrayList<Integer> result = findallindex(arr, key, i);
    System.out.println(result);
    }
}
