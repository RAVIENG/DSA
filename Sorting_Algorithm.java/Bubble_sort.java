//how many passes required=(n-1)
//how many compresion required= (n-1)
public class Bubble_sort {
   public static void Bubble_Sort(int arr[]){
     for(int i =0 ; i<arr.length-1;i++){
     int swap=0;
      for(int j = 0 ;j<arr.length-1-i;j++){
        if(arr[j]> arr[j+1]){
          int temp=arr[j];
          arr[j] = arr[j+1];   
          arr[j+1]=temp; 
          swap++;    
        }
      }
      if(swap==0){
        break;
      }
    }
     }
        public static void printarr(int arr[]){
          for(int i= 0;i<arr.length;i++){
            System.out.println(arr[i]);
          }
   }
      public static void main(String[] args) {
         int arr[] = {3,6,8,4,5,9};
         Bubble_Sort(arr);
         printarr(arr);
      }
}
