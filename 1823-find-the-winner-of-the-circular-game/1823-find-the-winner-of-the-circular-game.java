class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> people = new ArrayList<>();
        for(int i=1; i<=n; i++){
            people.add(i);
        }
        return kill(people,k,0);
    }

    public int kill(List<Integer> people, int k , int index){
        if(people.size()==1)
            return people.get(0);
        index = (index+k-1)%people.size();
        people.remove(index);
        return kill(people,k,index);
    }
}