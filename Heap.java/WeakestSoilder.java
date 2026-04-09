import java.util.*;
public class WeakestSoilder {
    static class Row implements Comparable<Row>{
        int soldier;
        int idx;
        Row(int soldier , int idx){
            this.soldier = soldier;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row other) {
            if (this.soldier != other.soldier) {
                return this.soldier - other.soldier; 
            } else {
                return this.idx - other.idx; 
            }
        }
    }

    /*PriorityQueue<Row> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.soldier != b.soldier) {
                    return a.soldier - b.soldier; 
                } else {
                    return a.idx - b.idx; 
                }
            }
        ); */
    public static void main(String[] args) {
        PriorityQueue<Row> pq = new PriorityQueue<>();

        int army[][] = {{1,0,0,0},
                        {1,1,1,0},
                        {1,0,0,0},
                        {1,0,0,0}
                    };
        
        for(int i=0;i<army.length;i++){
            int count = 0;
        for(int j=0;j<army.length;j++){
                count += army[i][j] ==1 ? 1 :0;
            }
            pq.add(new Row(count ,i));
        }

        for(int i=0;i<pq.size();i++){
            System.out.println("A "+pq.remove().idx);
        }
   }
}
