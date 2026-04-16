class Solution {
    public boolean isPalindrome(String s) {
        String S=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String str = new StringBuilder(S).reverse().toString();
        return str.equals(S);
    }
}