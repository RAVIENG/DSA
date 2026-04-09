import java.util.*;
public class NearByCars {
    static class  point {
        
        int x;
        int y;
        int dist;
        int i;
        point(int x, int y ,int i){
            this.x = x;
            this.y = y;
            this.dist = x*x+y*y;
            this.i = i;
        }


    }
    public static void main(String[] args) {
        int arr[][] = {{3,3}, {5,-2}, {-2,4}};

        PriorityQueue<point> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);

        for(int i=0;i<arr.length;i++){
            pq.add(new point(arr[i][0],arr[i][1],i));
        }

        for(int i=0;i<2;i++){
            System.out.println("c" + pq.remove().i);
        }
    }
}
