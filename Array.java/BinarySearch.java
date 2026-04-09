public class BinarySearch{
  public static int binary(int arr[],int key){
     int start=0;
     int end=arr.length-1;
     while(start<=end){
      int mid = (end+start)/2;
      if(arr[mid]==key){
        return mid;
      }
      else if(arr[mid]<key){
        start= mid+1;
      }
      else{
        end = mid-1;
      }
     }
     return -1;
  }
  public static void main(){
   int arr[]={2,4,6,8,10,12,14};
   int key = 14;
   int found = binary(arr,key);
   System.out.println(found);//it return it index value not the value
  }
}