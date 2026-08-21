class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int s : students){
            q.offer(s);
        }
        int i=0; 
        int UE = 0;
        while(!q.isEmpty() && UE<q.size()){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                UE=0;
            }
            else{
                q.offer(q.poll());
                UE++;
            }
        }
        return UE;
    }
}