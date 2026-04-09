import java.util.*;// O(1)
public class DisjointSetUnion {
    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i=0; i<par.length; i++){
            par[i] = i;
        }
    }

    public static int find(int x){//log(n)
        if(x == par[x]){
            return x;
        }

        return find(par[x]);
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

    public static int pathCompression(int x){//O(1)
        if(x == par[x]){
            return x;
        }

        return par[x] = pathCompression(par[x]);
    }
    public static void main(String args[]){
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        union(1, 5);
    }
}
