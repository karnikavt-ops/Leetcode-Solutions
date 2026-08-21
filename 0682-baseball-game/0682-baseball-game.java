class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<operations.length;i++){
            if(operations[i].equals("+")){
                int a = st.pop();
                int b = st.peek();
                int c = a+b;
                st.push(a);
                st.push(c);
            }
            else if (operations[i].equals("C")){
                st.pop();
            }
            else if (operations[i].equals("D")){
                st.push(st.peek()*2);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum =0;
        while(!st.isEmpty()){
            sum=sum+st.pop();
        }
        return sum;
    }
}