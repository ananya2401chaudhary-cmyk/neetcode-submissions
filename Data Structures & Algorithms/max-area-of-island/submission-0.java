class Solution {
    
    
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                area=Math.max(dfs(grid, i, j),area);
                }
            }
        }
        return area;
    }

    public int dfs(int[][] grid, int i, int j){
        int count=0;
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length|| grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        
        count+=dfs(grid, i+1, j);
        count+=dfs(grid, i-1, j);
        count+=dfs(grid, i, j+1);
        count+=dfs(grid, i, j-1);
        count++;
        return count;
    }
}
