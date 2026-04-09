public class largest_in_array {
    public static void largest_array(int arr[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
               
            }
        }
        System.out.println(largest);//return largest
        
    }
    public static void main(String args[]){
    int arr[]= {2,4,5,6,7,8,9};
   largest_array(arr);
    }
}
