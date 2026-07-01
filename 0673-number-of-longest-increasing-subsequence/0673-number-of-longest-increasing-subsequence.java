class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int dp[]=new int[n];
        int cnt[]=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(cnt,1);
        int maxL=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        cnt[i]=cnt[j];
                    }
                    else if(dp[j]+1==dp[i]){
                        cnt[i]=cnt[i]+cnt[j];
                    }
                }
            }
            maxL=Math.max(maxL,dp[i]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(maxL==dp[i]){
                res+=cnt[i];
            }
        }
        return res;
    }
}