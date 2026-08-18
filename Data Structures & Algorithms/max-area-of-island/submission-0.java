class Solution {
    int rows ;
    int cols;
    int area = 0;
    int max = 0;
    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    area=0;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return max;
    }
    public void dfs(int row,int col, int[][] grid, boolean[][] visited){
         if(row<0||row>=rows||col<0||col>=cols||grid[row][col]==0||visited[row][col]){
            return;
         }
         visited[row][col] = true;
         area +=1;
         max = Math.max(area,max);
        
        int[][] adjList = {
          {row+1,col},{row-1,col},{row,col+1},{row,col-1}
        };
        for(int[] neigh : adjList){
            dfs(neigh[0],neigh[1],grid,visited);
        }
    }
}
