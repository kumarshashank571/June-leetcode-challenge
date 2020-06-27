class Solution {
    public int numSquares(int n) {
     int[] dp = new int[n+1];
        for(int i = 0;i<n+1;i++){
            int minval = i;  // for all 1s
            int y = 1;int sq = 1;
            while(sq<=i){
                minval = Math.min(minval,dp[i-sq]+1);
                y++;
                sq = y*y;
            }
            dp[i] = minval;
        }
        return dp[n];
    }
}
