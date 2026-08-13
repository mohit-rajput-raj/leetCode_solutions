class Solution {
    int move(int[][] obstacleGrid , int h, int k , int[][] dp){
        if( h==obstacleGrid.length || k==obstacleGrid[0].length || obstacleGrid[h][k]==1)return 0;
        if(h==obstacleGrid.length-1 && k==obstacleGrid[0].length-1){
            return 1;
        }
        if(dp[h][k]!=0)return dp[h][k];
        int l =move(obstacleGrid , h+1,k , dp);
        int r = move(obstacleGrid , h,k+1 , dp);
        dp[h][k]=l+r;
        return l+r;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        return move(obstacleGrid , 0,0 , dp);
    }
}