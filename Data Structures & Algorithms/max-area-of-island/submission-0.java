class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int[][] diff=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    Queue<int[]> queue=new LinkedList<>();
                    queue.add(new int[]{i,j});
                    int area=1;
                    grid[i][j]=0;
                    while(!queue.isEmpty()){
                        int[] cell=queue.poll();
                        int row=cell[0];
                        int col=cell[1];
                        for(int k=0;k<4;k++){
                            int adj_row=diff[k][0]+row;
                            int adj_col=diff[k][1]+col;
                            if(adj_row>=0&&adj_col>=0&&adj_row<grid.length&&adj_col<grid[0].length&&grid[adj_row][adj_col]==1){
                                area+=1;
                                grid[adj_row][adj_col]=0;
                                queue.add(new int[]{adj_row,adj_col});
                               
                            }
                        }
                    }
                    max=Math.max(area,max);
                }
            }
        }
         System.out.println("inside");
        return max;
    }
}
