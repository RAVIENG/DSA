public class GridWay {
    public static int countWays(int i,int j,int n,int m){
        if(i==n-1&&j==m-1){
            return 1;
        }
        else if(i==n||j==m){
            return 0;
        }

        int right = countWays(i, j+1, n, m);
        int down = countWays(i+1, j, n, m);
        return right+down;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(countWays(0,0,n,m));// time complexity O(2^n+m)
    }
}
