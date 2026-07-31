class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int p : popped){
            q.offer(p);
        }
        int i=0;
        while(i<pushed.length){
            s.push(pushed[i]);
            while(!s.isEmpty() && s.peek().equals(q.peek())){
                    s.pop();
                    q.poll();
            }
            i++;
        }
        return s.isEmpty();
    }
}