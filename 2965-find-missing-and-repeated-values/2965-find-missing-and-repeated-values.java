class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeat = 0;
        int miss = 0;
        int n = grid.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(s.contains(grid[i][j]))
                    repeat = grid[i][j];
                else
                    s.add(grid[i][j]);
            }
        }
        for(int i=1;i<=n*n;i++){
            if(!s.contains(i)){
                miss = i;
                break;
            }
        }
        return new int[]{repeat,miss};
    }
}