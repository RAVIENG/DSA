public class Linear_search {
     public static int linear(int arr[] , int key,int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

      return linear(arr,key,i+1);
        

        
    }
     public static void main(String args[]){
        int arr[] = {2,5,7,9,4,1};
        int key = 1;
        int i=0;
        System.out.println(linear(arr,key,i));

    }
}
