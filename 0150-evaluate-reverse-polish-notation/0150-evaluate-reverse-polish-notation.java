class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0 ; i<tokens.length; i++){
            String str = tokens[i];
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int a = s.pop();
                int b = s.pop();
                if(str.equals("+"))
                    s.push(b+a);
                else if(str.equals("-"))
                    s.push(b-a);
                else if(str.equals("*"))
                    s.push(b*a);
                else
                    s.push(b/a);
            }
            else{
                s.push(Integer.parseInt(str));
            }
        }
        return s.peek();
    }
}