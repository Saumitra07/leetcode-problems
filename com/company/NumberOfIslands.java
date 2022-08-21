package com.company;

public class NumberOfIslands {
    public static void main(String[] args) {
            char[][] grid={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
            System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {

        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if( grid[i][j]=='1')
                {
                    ans++;
                    dfs(grid,i,j);

                }
            }
        }
        return ans;

    }

    public static void dfs(char[][] grid,int row,int col)
    {

        if(grid[row][col]=='0')
            return;
        grid[row][col]='0';
        if(row>=1)
            dfs(grid,row-1,col);
        if(col<grid[0].length-1)
            dfs(grid,row,col+1);
        if(row<grid.length-1)
            dfs(grid,row+1,col);
        if(col>=1)
            dfs(grid,row,col-1);


    }
}
