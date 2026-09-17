class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
        int[][] diff=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    Queue<int[]> queue=new LinkedList<>();
                    queue.add(new int[]{i,j});
                    while(!queue.isEmpty()){
                        int[] cell=queue.poll();
                        int row=cell[0];
                        int col=cell[1];
                        for(int k=0;k<4;k++){
                            int adj_row=row+diff[k][0];
                            int adj_col=col+diff[k][1];
                            if(adj_row<grid.length&&adj_col<grid[0].length&&adj_row>=0&&adj_col>=0&&grid[adj_row][adj_col]=='1'){
                                queue.add(new int[]{adj_row,adj_col});
                                grid[adj_row][adj_col]='0';
                            }
                        }
                    }
                    cnt+=1;
                }
            }
        }
        return cnt;
    }
}
