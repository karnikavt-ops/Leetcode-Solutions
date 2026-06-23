class Solution {
    public void rot(int i, int j, int[][]grid, int day, int[][]time){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || day>=time[i][j] || grid[i][j] ==0)
            return ;

        time[i][j] = day;
        rot(i+1, j, grid, day+1, time);
        rot(i-1, j, grid, day+1, time);
        rot(i, j+1, grid, day+1, time);
        rot(i, j-1, grid, day+1, time);
    }

    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] time = new int[r][c];
        for(int i=0 ; i<r ; i++){
            Arrays.fill(time[i], Integer.MAX_VALUE);
        }
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                if(grid[i][j] == 2)
                    rot(i,j,grid,0,time);
            }
        }
        int min = 0;
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                if(grid[i][j] == 1){
                    if(time[i][j] == Integer.MAX_VALUE)
                        return -1;
                    min = Math.max(min, time[i][j]);
                }
            }
        }
        return min;
    }
}