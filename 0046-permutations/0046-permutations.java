class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        bt(res,nums, new ArrayList<>());
        return res;
    }
    void bt(List<List<Integer>> res, int [] nums, List<Integer> l){
        if(l.size() == nums.length){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int n: nums){
            if(l.contains(n)) 
                continue;
            l.add(n);
            bt(res, nums, l);
            l.remove(l.size()-1);
        }
    }
}