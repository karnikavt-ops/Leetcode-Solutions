class Solution {
    public int romanToInt(String s) {
        int map[] = new int[256];
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;
        int sum=0;
        for(int i=0;i<s.length();i++){
            int n = map[s.charAt(i)];
            if (i + 1 < s.length() && n < map[s.charAt(i+1)]){
                sum-=n;
            }
            else
                sum+=n;
        }
        return sum;
    }
}