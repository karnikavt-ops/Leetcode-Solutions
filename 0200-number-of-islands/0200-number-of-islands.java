class Solution {
    public void bt(char[][] grid, int i, int j, int count){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0')
            return;
        grid[i][j]='0';
        bt(grid, i+1, j,count);
        bt(grid, i-1, j,count);
        bt(grid, i, j+1,count);
        bt(grid, i, j-1,count);
    }

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]=='1'){
                    count++;
                    bt(grid, i, j, count);
        }
            }
        }
        return count;
    }
}