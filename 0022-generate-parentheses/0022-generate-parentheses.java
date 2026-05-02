class Solution {
    void backTrack(List<String>res, String s, int opn, int clo, int n){
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(opn<n)
            backTrack(res, s+"(", opn+1, clo, n);
        if(clo<opn)
            backTrack(res, s+")", opn, clo+1, n);
        
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrack(res, "", 0 , 0, n);
        return res;
    }
}