class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] len = new int[n];
        int[] cnt = new int[n];
        Arrays.fill(len,1);
        Arrays.fill(cnt,1);
        int maxLen = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(len[j]+1 > len[i]){
                        len[i] = len[j]+1;
                        cnt[i] = cnt[j];
                    }
                    else if(len[j]+1 == len[i]){
                        cnt[i] = cnt[i]+cnt[j];
                    }
                }
            }
            maxLen = Math.max(len[i], maxLen);
        }
        int res = 0;
        for(int i=0; i<n;i++){
            if(maxLen == len[i])
                res+=cnt[i];
        }
        return res;
    }
}