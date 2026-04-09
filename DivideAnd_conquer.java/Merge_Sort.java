public class Merge_Sort{
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = (si + ei) / 2;

        mergeSort(arr, si, mid);      // left part
        mergeSort(arr, mid + 1, ei);  // right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;       // idx for left sorted part
        int j = mid + 1;  // idx for right sorted part
        int k = 0;        // idx for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        //right part
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 8, 4, 5, 0};
        int si = 0;
        int ei = arr.length - 1;

        mergeSort(arr, si, ei);
        printArray(arr);
    }
}
