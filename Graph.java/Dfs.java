import java.util.ArrayList;
public class Dfs {
     public static class Edge {
        int src;
        int dest;
        Edge(int src ,int dest){
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

    public static void dfs(ArrayList<Edge>graph[] , int curr , boolean vist[]){
        System.out.println(curr + " ");
        vist[curr] = true;

        for(int i=0 ;i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vist[e.dest]){
                dfs(graph, e.dest, vist);
            }
        }
    }
    public static void main(String[] args) {
        
        ArrayList<Edge> graph[] = new ArrayList[7];
        boolean vist[] = new boolean[7];
        createGraph(graph);
        dfs(graph, 0, vist);
    }
}
// graph = [
//   [ (0→1), (0→2) ],          // graph[0]
//   [ (1→0), (1→3) ],          // graph[1]
//   [ (2→0), (2→4) ],          // graph[2]
//   [ (3→1), (3→4), (3→5) ],   // graph[3]
//   [ (4→2), (4→3), (4→5) ],   // graph[4]
//   [ (5→3), (5→4), (5→6) ],   // graph[5]
//   [ (6→5) ],                 // graph[6]
//   [ (7→8) ],                 // graph[7]
//   [ (8→7) ]                  // graph[8]
// ];
