import java.util.*;
public class PrimAlgo {
    static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair{
        int ver;
        int cost;
        Pair(int ver, int cost){
            this.ver = ver;
            this.cost = cost;
        }
    }

    public static void prim(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);

        pq.add(new Pair(0, 0));
        int finalCost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.ver]){
                vis[curr.ver] = true;
                finalCost += curr.cost;

                for(int i=0; i<graph[curr.ver].size(); i++){
                    Edge e = graph[curr.ver].get(i);
                    pq.add(new Pair(e.dest , e.weight));
                }
            }
        }

        System.out.println("finalCost : "+ finalCost);
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
        createGraph(graph);
        prim(graph);
    }
}
