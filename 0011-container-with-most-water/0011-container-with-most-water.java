class Solution {
    public int maxArea(int[] height) {
        int ans =-1;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int w = right-left;
            int h = Math.min(height[right],height[left]);
            ans = Math.max(ans, w*h);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return ans;
    }
}