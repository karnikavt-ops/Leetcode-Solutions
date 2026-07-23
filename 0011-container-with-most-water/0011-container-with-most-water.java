class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int water = -1;

        while(left < right){
            int min = Math.min(height[left],height[right]);
            water = Math.max(water , min*(right-left));
            if(min == height[left]){
                left++;
            }
            else{
                right--;
            }
        }

        return water;
    }
}