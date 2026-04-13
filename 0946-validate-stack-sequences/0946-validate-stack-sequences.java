class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> in = new LinkedList<>();
        Queue<Integer> out = new LinkedList<>();
        for(int x: pushed){
            in.add(x);
        }
        for(int x: popped){
            out.add(x);
        }
        while(!in.isEmpty()){
            st.push(in.poll());
            while(!st.isEmpty() && !out.isEmpty() && (st.peek().equals(out.peek()))){
                st.pop();
                out.poll();
            }
        }
        return st.isEmpty();
    }
}