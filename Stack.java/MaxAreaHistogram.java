import java.util.*;
public class MaxAreaHistogram {

    public static void maxArea(int arr[]){
        Stack<Integer> s = new Stack<>();

        // next smallest right
        int NextSmallestRight[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                NextSmallestRight[i] = arr.length;
            } else {
                NextSmallestRight[i] = s.peek();
            }

            s.push(i);
        }


        s.clear();
        // next smallest left 
        int nextSmallestLeft[] = new int[arr.length];

        for(int i =0; i <= arr.length - 1; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nextSmallestLeft[i] = -1;
            } else {
                nextSmallestLeft[i] =s.peek();
            }

            s.push(i);
        }
        //max area

        int maxArea=0;
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = NextSmallestRight[i] - nextSmallestLeft[i] - 1;
            int currentArea = height*width;
             maxArea = Math.max(currentArea,maxArea);
        }
        System.out.println(maxArea);
    }

    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};

        maxArea(arr);
    }
}
