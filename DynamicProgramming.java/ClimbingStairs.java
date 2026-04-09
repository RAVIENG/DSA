import java.util.Arrays;
public class ClimbingStairs {
    public static int climbingRec(int n){
        if(n==0){
            return 1;
        }

        if(n<0){
            return 0;
        }
        return climbingRec(n-1)+ climbingRec(n-2);
    }

    public static int climbingMemoization(int n, int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }

       ways[n] = climbingRec(n-1)+ climbingRec(n-2);
        return ways[n];
    }

    public static void climbingTabulation(int n, int dp[]){
        dp[0] = 1;

        for(int i=1; i<dp.length; i++){
            if(i == 1){
                dp[i] = dp[i-1]; // dp[1] == 1;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }

        }
        System.out.println(dp[n]);
    }
    public static void main(String[] args) {
       int n= 4;
       int ways[] = new int[n+1];
       Arrays.fill(ways, -1);
       System.out.println(climbingMemoization(n, ways));

       climbingTabulation(n, ways);
    }
}
