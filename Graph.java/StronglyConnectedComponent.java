import java.util.*;
public class StronglyConnectedComponent {
    public static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topological(ArrayList<Edge> graph[], boolean vis[], Stack<Integer> s,int curr){
        vis[curr] = true;
        
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topological(graph, vis, s, e.dest);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> transPose[], int curr, boolean vis[]){
        vis[curr] = true;

        System.out.println(curr + " ");
        for(int i=0; i<transPose[curr].size(); i++){
            Edge e = transPose[curr].get(i);
            if(!vis[e.dest]){
                dfs(transPose, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge> graph[]){
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[5];
        for(int i=0; i<5; i++){
            if(!vis[i]){
                topological(graph, vis, s, i);
            }
        }

        //transpose
        ArrayList<Edge> transPose[] = new ArrayList[5];
        for(int i=0; i<graph.length; i++){
            vis[i] = false;
            transPose[i] = new ArrayList<>();
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                transPose[e.dest].add(new Edge(e.dest , e.src));
            }
        }

        while (!s.isEmpty()) {
            int curr = s.pop();
            if(!vis[curr]){
                dfs(transPose, curr, vis);
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        kosaraju(graph);
    }
}
