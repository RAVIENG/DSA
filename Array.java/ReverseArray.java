public class ReverseArray{
    public static void reverse(int arr[]){
      int temp;
      int start = 0;
      int last =arr.length-1;

    while(start<last){
      temp= arr[start];
      arr[start]=arr[last];
      arr[last] = temp;
      start++;
      last--;
       
    }   
  }
    public static void main(String args[]){
      int arr[]={2,4,6,8,10,12,14,16,18};
      reverse(arr);

      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
    }
}