class Solution {
    static int find_gcd(int a , int b ){
        if(b==0){
            return a;
        }
        return find_gcd(b,a%b);
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        int n = nums.length;
        int m = numsDivide.length;
        Arrays.sort(nums);
        int gcd = numsDivide[0];
        for(int i=1;i<m;i++){
            gcd = find_gcd(gcd,numsDivide[i]);
        }
        for(int i=0;i<n;i++){
            if(gcd%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
}