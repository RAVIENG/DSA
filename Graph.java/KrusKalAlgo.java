import java.util.*;
public class KrusKalAlgo {

    public static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i=0; i<par.length; i++){
            par[i] = i;
        }
    }

    public static int find(int x){//O(1)
        if(x == par[x]){
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int A, int B){
        int parA = find(A);
        int parB = find(B);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
                par[parA] = parB;
        }else{
            par[parB] = parA; 
        }
    }

    public static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    public static int kruskal(ArrayList<Edge> edges, int v){
        Collections.sort(edges ,(a,b)->a.weight-b.weight);

        int mstCost = 0;
        int count = 0;

        for(int i=0; count<v-1; i++){
            Edge e = edges.get(i);

            int parA = find(e.src);
            int parB = find(e.dest);

            if(parA != parB){
                union(e.src, e.dest);
                mstCost += e.weight;
                count++;
            }
        }
        return mstCost;
    }
    public static void main(String args[]){
        int v = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        init();
        createGraph(edges);
        System.out.println(kruskal(edges, v));
    }
}
