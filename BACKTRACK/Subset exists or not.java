class Solution {

    static Boolean isSubsetSum(int arr[], int target) {
        boolean dp[]=new boolean[target+1];
        dp[0]=true;
        for(int num:arr)
        {
        for(int j=target;j>=num;j--)
        {
            dp[j]=dp[j]||dp[j-num];
        }
        }
        return dp[target];
        
    }
}
