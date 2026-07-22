class Solution {
    public int compress(char[] chars) {

        String code = "";
        int run = 0;
        char ptr = chars[0];

        for (char ch : chars) {

            if (ch == ptr) {
                run++;
            } else {
                code += ptr + (run > 1 ? "" + run : "");
                ptr = ch;
                run = 1;
            }
        }

        // Add the last group
        code += ptr + (run > 1 ? "" + run : "");

        // Copy back to chars
        for (int i = 0; i < code.length(); i++) {
            chars[i] = code.charAt(i);
        }

        return code.length();
    }
}