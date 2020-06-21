class Solution {
    public int calculateMinimumHP(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];
        dp[dp.length-1][dp[0].length-1] = Math.max(1-arr[dp.length-1][dp[0].length-1],1);
        for(int i = dp[0].length-2;i>=0;i--){
            dp[dp.length-1][i] = Math.max((dp[dp.length-1][i+1]-arr[dp.length-1][i]),1);
        }
        for(int i = dp.length-2;i>=0;i--){
            dp[i][dp[0].length-1] = Math.max((dp[i+1][dp[0].length-1]-arr[i][dp[0].length-1]),1);
        }
         for(int i = dp.length-2;i>=0;i--){
             for(int j = dp[0].length-2;j>=0;j--){
                 dp[i][j] = Math.max(Math.min(dp[i+1][j],dp[i][j+1])-arr[i][j],1);
             }
         }
     return dp[0][0];   
    }
}
