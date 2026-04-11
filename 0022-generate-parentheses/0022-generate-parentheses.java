class Solution {
    void backTrack(List<String>res,String s,int op,int cl,int n){
        if(op<n)
            backTrack(res,s+"(",op+1,cl,n);
        if(cl<op)
            backTrack(res,s+")",op,cl+1,n);
        if(s.length()==n*2){
            res.add(s);
            return;
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrack(res,"",0,0,n);
        return res;
    }
}