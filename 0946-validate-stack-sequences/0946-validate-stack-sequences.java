class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Queue<Integer> pop = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int i : popped){
            pop.add(i);
        }
        int j=0;
        while(j<pushed.length){
	        st.push(pushed[j]);
	        while(!st.isEmpty()  &&  pop.peek().equals(st.peek())){
		        st.pop();
		        pop.poll();
	        } 
            j++;
        }
return pop.isEmpty();
    }
}