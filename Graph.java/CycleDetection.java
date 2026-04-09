import java.util.ArrayList;

public class CycleDetection {
    public static class Edge {
        int src;
        int dest;
        Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
        
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        int v =7;
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
    }

    public static boolean cycleDetect(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if( cycleDetectUtil(graph, vis , i , -1)){
                    return true;
                } 
            }
        }

        return false;
    }


    public static boolean cycleDetectUtil(ArrayList<Edge> graph[] , boolean vis[] , int curr , int parent){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest] && cycleDetectUtil(graph , vis , e.dest ,curr )){
                return true;
            }

            else if(vis[e.dest] && e.dest!= parent ){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[7];
        createGraph(graph);
        System.out.println(cycleDetect(graph));
    }
}
