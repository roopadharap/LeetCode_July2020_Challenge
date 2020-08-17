class Solution {
    public int climbStairs(int n) {
        int [] dp = new int [n+1];
        Arrays.fill(dp, -1);
        return countStairs(n, dp);
    }
    
    private int countStairs(int n, int [] dp)
    {
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;
        else if(dp[n] > -1)
            return dp[n];
        else
        {
            dp[n] = countStairs(n-1, dp) + countStairs(n-2, dp);
            return dp[n];
        }
    }
}