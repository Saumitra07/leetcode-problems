package com.company.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class rotttonOranges {
    public static void main(String[] args) {
        
       int[][] grid = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
       System.out.println(orangesRotting(grid));

    }
    public static int orangesRotting(int[][] grid) {
        int o=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==2)
                    {
                        q.add(new int[]{i,j});
                    }
                    else if(grid[i][j]==1)
                    {
                        //keep count of unrotton oranges
                        o++;
                    }
            }
        }
        int ro=0;
        int t=0;
        int[] rs=new int[]{0,-1,0,1};
        int[] cs=new int[]{-1,0,1,0};
        while(!q.isEmpty())
        {
            int s=q.size();
            boolean flag=false;
            for(int p=1;p<=s;p++)
            {
                int[] n=q.poll();
                int r=n[0];
                int c=n[1];
               
                for(int i=0;i<4;i++)
                {
                    int nr=r+rs[i];
                    int nc=c+cs[i];
                    if(nr<0 || nc<0 || nr==grid.length || nc==grid[0].length || 
                    grid[nr][nc]==0 || grid[nr][nc]==2)
                        continue;
                    flag=true;
                    ro++;
                    grid[nr][nc]=2;
                    q.add(new int[]{nr,nc});
                }

            }
            if(flag)
                t++;
        }

        //System.out.println(o+"...."+ro);
        
        //if unrotton count is equal to newly rotten oranges- all oranges are rotton now. 

        if(o==ro)
            return t;
        else
            return -1;
    }
}
