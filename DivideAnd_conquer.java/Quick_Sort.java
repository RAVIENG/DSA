public class Quick_Sort {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si , int ei){
        if(si >= ei){   
            return;
        }
        int pivotIndex = Pivot(arr, si, ei);  
        quickSort(arr, si, pivotIndex - 1);  
        quickSort(arr, pivotIndex + 1, ei); 
         
    }

    public static int Pivot(int arr[], int si, int ei){
        int pivot = arr[si];
        int i = si + 1;
        int j = ei; 
        
        while(i <= j){
            while(i <= ei && arr[i] <= pivot){
                i++;
            }
            while(j >= si && arr[j] > pivot){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

      
        int temp = arr[si];
        arr[si] = arr[j];
        arr[j] = temp;

        return j; 
    }

    public static void main(String args[]){
        int arr[] = {7, 9, 4, 5};
        int si = 0;
        int ei = arr.length-1;

        quickSort(arr, si, ei);

        printArray(arr);
    }
}
