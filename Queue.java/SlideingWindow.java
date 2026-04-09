import java.util.*;
public class SlideingWindow {
    public static void slideingWindow(int arr[], int k){
        int n = arr.length;
        int list[] = new int[n-k+1];

        int idx = 0;
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0; i<=n-1; i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

            while (!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1){
                list[idx++] = arr[dq.peekFirst()];
            }
        }
        for(int el : list){
            System.out.print(el + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 7, 1, 6};
        slideingWindow(arr, 3);
    }
}
