class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> ip = new LinkedList<>();
        Queue<Integer> op = new LinkedList<>();

        for (int val : pushed) {
            ip.add(val);
        }
        for (int val : popped) {
            op.add(val);
        }

        while (!ip.isEmpty()) {
            st.push(ip.poll());

            while (!st.isEmpty() && !op.isEmpty() && st.peek().equals(op.peek())) {
                st.pop();
                op.poll();
            }
        }

        return st.isEmpty();
    }
}