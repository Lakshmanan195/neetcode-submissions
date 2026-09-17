class Solution {
    static int[][] diff=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(i,j,grid));
                }
            }
        }
         System.out.println("inside");
        return max;
    }
    private int dfs(int row,int col,int[][] grid){
        if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]==0) return 0;
        grid[row][col]=0;
        int res=1;
        for(int i=0;i<4;i++){
            res+=dfs(row+diff[i][0],col+diff[i][1],grid);
        }
        return res;
    }
}
