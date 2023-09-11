package com.company.BinarySearch;

public class CountNegInSortedMatrix {
    public static void main(String[] args) {        
      //  int[][] grid=new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
      int[][]grid=new int[][]{{3,2},{-3,-3},{-3,-3},{-3,-3}};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int k=grid[0].length-1;
        int end=grid[0].length-1;
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            int j=0;
            end=k;
            while(j<k)
            {
                int mid=j+(k-j)/2;
                if(grid[i][mid]<0)
                {
                    k=mid;
                }
                else
                {
                    j=mid+1;
                }
            }
            
            // if(k<0 || k>=end)
            //     continue;
            if(j<=end && grid[i][j]<0)
            {
                //end-1+k is col and grid-i-1 is row
                ans+= end+1-k+(grid.length-i-1)*(end+1-k);
                k=k-1;

            }
               
          
        }
        return ans;
    }
}
