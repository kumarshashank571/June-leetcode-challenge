class Solution {
    public int change(int amount, int[] coins) {
     int[] dp = new int[amount+1]; // all cells 0 initialized
        dp[0]=1;  // if nothing to change then not to chose any coin is one way.
        for(int j=0;j<coins.length;j++){
            for(int i=1;i<dp.length;i++){// iterate i for all coins[j]
                if(i-coins[j]>=0){
                    dp[i] += dp[i-coins[j]]; // selecting the coins[j - 1] for amount i
                }
            }
        }
            return dp[amount];
    }
}
