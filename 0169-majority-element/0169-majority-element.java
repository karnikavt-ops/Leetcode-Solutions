class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = -1;
        int count =0;

        for(int i :nums){
            if(count==0){
                candidate = i;
                count++;
            }
            else if(i==candidate){
                count++;
            }
            else{
               count--; 
            }
        }
        count = 0;
        for(int i: nums){
            if(i==candidate)
                count++;
        }
        if(count > (n/2))
            return candidate;
        else
            return -1;
    }
}