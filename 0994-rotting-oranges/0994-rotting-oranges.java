class Solution {
    public void rot(int [][] grid , int [][] timegrid , int i , int j , int day){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 ||grid[i][j]==0 || timegrid[i][j]<=day)
            return;
        timegrid[i][j] = day; 
        rot(grid , timegrid, i+1 , j , day+1);
        rot(grid , timegrid, i-1 , j , day+1);
        rot(grid , timegrid, i , j+1 , day+1);
        rot(grid , timegrid, i , j-1 , day+1);
    }

    public int orangesRotting(int[][] grid) {
        int row = grid.length ;
        int col = grid[0].length ;

        int [][] timegrid = new int [row][col] ;
        for(int i=0; i<row ;i++){
            Arrays.fill(timegrid[i], Integer.MAX_VALUE) ;
        }
        for(int i=0; i<row ;i++){
            for(int j=0 ; j<col ; j++){
                if(grid[i][j] ==2){
                    rot(grid, timegrid, i ,j ,0);
                }
            }
        }

        int min = 0;
        for(int i=0; i<row ;i++){
            for(int j=0 ; j<col ; j++){
                if(grid[i][j]==1){
                    if(timegrid[i][j]==Integer.MAX_VALUE)
                        return -1;
                    min = Math.max(min, timegrid[i][j]);
                }
            }
        }

        return min;

    }
}