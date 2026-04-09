import java.util.*;
public class CheapestFlight {
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

    public static void createGraph(ArrayList<Edge> graph[], int flight[][] ){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<flight.length; i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int weight = flight[i][2]; 

            Edge e = new Edge(src, dest, weight);
            graph[src].add(e);
        }
    }

    static class  Info {
        int ver;
        int stop;
        int cost;

        Info(int ver, int stop, int cost){
            this.ver =  ver;
            this.stop = stop;
            this.cost = cost;
        }
    }

    public static int cheapestFlight(int n, int flight[][], int src, int dest, int k){
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph,flight);

        int dist[] = new int[graph.length];
        dist[src] = 0;
        for(int i=0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr.stop > k){
                continue;
            }

            for(int i=0; i<graph[curr.ver].size(); i++){
                Edge e = graph[curr.ver].get(i);
                int v = e.dest;
                int wt = e.weight;
                
                if(curr.cost + wt < dist[v] && curr.stop<=k){
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, curr.stop+1 , dist[v])); //dest,stop,weight
                }
            }
        }
        
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int flight[][] = {{0,1,100}, {1,2,100}, {2,0,100}, {2,3,100}, {1,3,600}, {2,3,200}};
        int src = 0, dest = 3, k = 1; int n =4;
        int ans = cheapestFlight(n, flight, src, dest, k);
        System.out.println(ans);
    
    }
}
