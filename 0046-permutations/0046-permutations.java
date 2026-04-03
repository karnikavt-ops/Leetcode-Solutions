class Solution {
    public void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums){
            if(temp.size() == nums.length){
                res.add(new ArrayList<>(temp));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])){
                    continue;
                }
                temp.add(nums[i]);
                backtrack(res,temp,nums);
                temp.remove(temp.size()-1);
            }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(result,temp,nums);
        return result;
    }
}