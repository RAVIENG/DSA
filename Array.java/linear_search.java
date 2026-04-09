public class linear_search{
    public static int search(int arr[],int key){
      for(int i=0;i<arr.length;i++){
       if(key==arr[i]){
        return 1;
       }
       
    }
    return -1;
  }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12};
        int key=10;
        if(search(arr,key)==1){
          System.out.println("element found");
        }
        else{
          System.out.println("not found");  
        }
    }
}
