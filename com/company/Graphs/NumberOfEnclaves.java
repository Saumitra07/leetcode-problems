package com.company.Graphs;

public class NumberOfEnclaves {
    public static void main(String[] args) {
        int[][] grid={{1,0,0},{0,0,1}};
        System.out.println(numEnclaves(grid)); 
    }
    public static int numEnclaves(int[][] grid) {
        int ans=0;
       for(int i=0;i<grid.length;i++)
       {
           for(int j=0;j<grid[0].length;j++)
           {
               if(i!=0 && j!=0 && i!=grid.length-1 && j!=grid[0].length-1)
               if(grid[i][j]==1)

               {
                   
                   int count=dfs(i,j,grid);
                   System.out.println(i+"..."+j+"...."+count);
                 if(count!=-1)
                  ans+=count;
               }
           }
       }

       return ans;
       
   }

   public static int dfs(int r,int c,int[][] grid)
   {
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0)
           return 0;

       if(r==0 || c==0 || r==grid.length-1 || c==grid[0].length-1)
       {
           return -1;
       }   
           

       grid[r][c]=0;

     
       int left=dfs(r,c-1,grid);
      
       int up=dfs(r-1,c,grid);
     
        int right=dfs(r,c+1,grid);
      
        int down=dfs(r+1,c,grid);

       if(left==-1 || right==-1 || up==-1 || down==-1)
           return -1;
       else    
       return
           1+ left+right+up+down;
   //    return 1+ + dfs(r-1,c,grid)+dfs(r,c+1,grid)+dfs(r+1,c,grid);

   }
}

