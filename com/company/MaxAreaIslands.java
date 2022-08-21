package com.company;

public class MaxAreaIslands {
    private static int current_area=0;
    private static int area=0;
   // int area=0;
   // int current_area=0;
    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        for(int i=0;i<grid.length;i++)
        {

            for(int j=0;j<grid[i].length;j++)
            {
                current_area=0;
                if(grid[i][j]==1)
                {
                    dfs(grid,i,j,area,current_area);
                }
            }
        }
        System.out.println(area);
    }

    public static void dfs(int[][] grid, int row,int col,int area,int current_area)
    {

        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0)
            return;

        grid[row][col]=0;

        current_area++;
       // area=Math.max(current_area,area);


        dfs(grid,row-1,col,area,current_area);
        dfs(grid,row,col+1,area,current_area);
        dfs(grid,row+1,col,area,current_area);
        dfs(grid,row,col-1,area,current_area);
        area= Math.max(area,current_area);
    }
}
