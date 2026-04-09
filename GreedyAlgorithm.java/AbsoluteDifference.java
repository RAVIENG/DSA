import java.util.*;
public class AbsoluteDifference {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={3,2,1};

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff=0;
        for(int i=0;i<a.length;i++){
            minDiff+=Math.abs(a[i]-b[i]);
        }
        System.out.println("minimum Difference :"+minDiff);
    }
}
