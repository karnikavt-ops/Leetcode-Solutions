class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        pointer(nums, 0, n-1);
        pointer(nums, k, n-1);
        pointer(nums, 0, k-1);
    }
    public void pointer(int [] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}