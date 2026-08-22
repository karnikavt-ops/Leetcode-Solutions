import java.util.*;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        // Store all jewels
        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        // Check every stone
        for (char ch : stones.toCharArray()) {
            if (set.contains(ch)) {
                count++;
            }
        }
        return count;
    }
}