import java.util.*;
public class ConnectedComponent {
    public static class Edge {
        int src;
        int dest;
        Edge(int src ,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        int v =9;
         for(int i=0; i<v ;i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

        graph[7].add(new Edge(7, 8));
        graph[8].add(new Edge(8, 7));
    }

    public static void bfs(ArrayList <Edge> graph[]){
        boolean vist[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vist[i]){
                bfsUtil(graph,vist,i);
            }
        }
    }    

    public static void bfsUtil(ArrayList<Edge> graph[], boolean vist[],int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {//O(v+e)
            int curr = q.remove();
            if(!vist[curr]){
                System.out.println(curr + " ");
                vist[curr] = true;
                for(int i=0 ;i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[9];
        createGraph(graph);
        bfs(graph);
    }
}
