public class Binary_search {
    public static int binSearch(int arr[],int key,int s,int e){
        int mid = (s+e)/2;
        if(s>e){
            return -1;
        }

        if(arr[mid]==key){
            return mid;
        }

        if(arr[mid]>key){
            return binSearch(arr,key,s,mid-1);
        }

        return binSearch(arr, key, mid+1, e);
    }
    public static void main(String args[]){
        int arr[] = {2,4,5,6,7,8,9,};
        int key  = 4;
        int s=0;
        int e=arr.length-1;
       System.out.println( binSearch(arr,key,s,e));
    }
}
