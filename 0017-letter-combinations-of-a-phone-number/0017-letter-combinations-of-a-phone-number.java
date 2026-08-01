class Solution {
    String [] phones = {"", "","abc" ,"def" ,"ghi" ,"jkl" ,"mno" ,"pqrs" ,"tuv" ,"wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        bt(res, digits, 0, new StringBuffer());
        return res;
    }
    public void bt(List<String>res, String digits, int i, StringBuffer s){
        if(s.length()==digits.length()){
            res.add(s.toString());
            return;
        }
        String letters = phones[digits.charAt(i)-'0'];
        for(char c : letters.toCharArray()){
            s.append(c);
            bt(res, digits, i+1, s);
            s.deleteCharAt(s.length()-1);
        }
    }
}