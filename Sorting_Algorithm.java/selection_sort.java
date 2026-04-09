public class selection_sort {
    public static void Selection(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[min]){
                    min= j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]= temp;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String args[]){
        int arr[] = {6,4,8,9,0,2};
        Selection(arr);
    }
}
