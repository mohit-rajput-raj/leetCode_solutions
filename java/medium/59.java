class Solution {
    private static int a=1;
    void goUp(int[][] grid, int h , int k){
        boolean move = false;
        while(grid[h-1][k]==0){
            move = true;
            h = h-1;
            grid[h][k] = a++;
        }
        if(!move)return;
        goRight(grid, h,k);
        return;

    }
    void goDown(int[][] grid, int h , int k){
        boolean move = false;
        while(h+1!=grid.length && grid[h+1][k]==0){
            h = h+1;
            move = true;
            grid[h][k] = a++;
        }
        if(!move)return;
        // if(k-1<0 )return;
        goLeft(grid, h,k);
        return;

    }
    void goRight(int[][] grid, int h , int k){
        boolean move = false;
        while(k+1!=grid[0].length && grid[h][k+1]==0){
            move = true;
            k=k+1;
            grid[h][k] = a++;
        }
        if(!move)return;
        goDown(grid, h,k);
        return;

    }
    void goLeft(int[][] grid, int h , int k){
        boolean move = false;
        while( !(k-1<0) && grid[h][k-1]==0 ){
            move = true;
            k=k-1;
            grid[h][k] = a++;
        }
        if(!move)return;
        // if(grid[h-1][k]!=0)return;
        goUp(grid, h,k);
        return;
    }
    
    
    public int[][] generateMatrix(int n) {
        int[][] grid = new int[n][n];
        a = 1;
        grid[0][0] =a;
        a++;
        goRight(grid , 0,0);
        return grid;

    }
}