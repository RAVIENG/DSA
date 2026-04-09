import java.util.*;
public class DijkstraAlgo {
    public static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int src ,int dest,int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    public static class Pair{
        int n; //node
        int path;//dist

        Pair(int n , int path){
            this.n = n;
            this.path = path;
        }
    }

    public static void dijkastra(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.path-b.path);

        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;

                for(int i=0; i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;

                    if((dist[u]+wt)<dist[v]){
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        createGraph(graph);
        int src = 0;

        dijkastra(graph, src);
    }
}
