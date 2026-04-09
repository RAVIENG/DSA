public class counting_sort {
    public static void counting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int coun[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
              coun[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<coun.length;i++){
            while(coun[i]>0){
                arr[j]=i;
                j++;
                coun[i]--;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

        
    }
    public static void main(String args[]){
        int arr[] = {3,2,6,4,2,6,1,8,4,1};
        counting(arr);
    }
}
