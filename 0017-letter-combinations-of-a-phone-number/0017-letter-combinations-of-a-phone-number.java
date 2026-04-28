class Solution {
    List<String> res = new ArrayList<>();
    String[] phone ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public void combination(String digits, int i, StringBuilder cur){
        if(cur.length()==digits.length()){
            res.add(cur.toString());
            return;
        }
        String letters = phone[digits.charAt(i)-'0'];
        for(char c: letters.toCharArray()){
            cur.append(c);
            combination(digits, i+1, cur);
            cur.deleteCharAt(cur.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        combination(digits,0,new StringBuilder());
        return res;  
    }
}