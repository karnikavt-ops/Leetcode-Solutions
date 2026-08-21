class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1; i<prices.length; i++){
            while(!st.isEmpty() && prices[i] <= prices[st.peek()]){
                int n = st.pop();
                prices[n] = prices[n] - prices[i];
            }
            st.push(i);
        }
        return prices;
    }
}