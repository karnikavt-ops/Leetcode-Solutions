class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        c_s(candidates, target, res, 0, 0, new ArrayList<>());
        return res;
    }

    public void c_s(int[]candidates,int target,List<List<Integer>>res,int index,int total,List<Integer>comb){
        if(total==target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total>target || index>=candidates.length){
            return;
        } 
        comb.add(candidates[index]);
        c_s(candidates, target, res, index, total + candidates[index], comb);
        comb.remove(comb.size()-1);
        c_s(candidates, target, res, index + 1, total, comb);
    }
}