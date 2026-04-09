class Solution {
    public int find(int n, int k){
        if(n==1){
            return 0;
        }
        return(find(n-1,k)+k) %n;
    }
    public int findTheWinner(int n, int k) {
            int result = find(n,k);
            return result+1;
    }
}