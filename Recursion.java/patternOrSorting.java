import java.util.Arrays;

public class patternOrSorting {
    public static void printStar(int r,int c){
        if(r==0){
            return;
        }

        if(c<r){
            System.out.print("*");
            printStar(r, c+1);
        }
        else{
            System.out.println();
            printStar(r-1, 0);
                      
        }

        
    }

    public static void bubble_sort(int arr[],int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp;
                temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1]= temp;              
            } 
            bubble_sort(arr, r, c+1);           
        }
        else{
            bubble_sort(arr, r-1, 0);
        }
    }

     public static void main(String args[]){
        printStar(4, 0);
        int arr[] = { 2,8,6,7,5,2};
        int r = arr.length-1;
        int c= 0;
        
        bubble_sort(arr, r, c);
        System.out.println(Arrays.toString(arr));

    }
}
