public class Knapsack {
    public static int knapsackRec(int val[], int wt[], int W, int n){
        if(n == 0 || W == 0){
            return 0;
        }

        if(wt[n-1] <= W){
            int include = val[n-1] + knapsackRec(val, wt, W-wt[n-1], n-1);
            int exclude = knapsackRec(val, wt, W, n-1);

            int ans = Math.max(include, exclude);
            return ans;
        }else{
            return knapsackRec(val, wt, W, n-1);
        }
    }

    public static int knapsackMemo(int val[], int wt[], int W, int n, int dp[][]){
        if(W==0 || n==0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){
            int include = val[n-1] + knapsackMemo(val, wt, W-wt[n-1], n-1, dp);
            int exclude = knapsackMemo(val, wt, W, n-1, dp);

            dp[n][W] = Math.max(include, exclude);
            return dp[n][W];
        }else{
            dp[n][W] =knapsackMemo(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }

    public static int knapsackTabu(int wt[], int value[], int W, int n){
        int dp[][] = new int[n+1][W+1];

    for(int i = 0; i <= n; i++){
        dp[i][0] = 0;
    }
    for(int j = 0; j <= W; j++){
        dp[0][j] = 0;
    }

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= W; j++){

            if(wt[i-1] <= j){
                int include = value[i-1] + dp[i-1][j - wt[i-1]];
                int exclude = dp[i-1][j];

                dp[i][j] = Math.max(include, exclude);
            }
            else{
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    printDP(dp);
    return dp[n][W];
}

    public static void printDP(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int n=val.length;
       System.out.println(knapsackRec(val, wt, W, n)); 

       System.out.println(knapsackTabu( wt, val, W, n));
    }
}
