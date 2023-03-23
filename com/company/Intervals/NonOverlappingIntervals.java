package com.company.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static void main(String[] args) {

        int[][] intervals=new int[][]{{1,2},{2,3},{3,4},{1,3}};

        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b)
            {
              if(a[0]>b[0])
                 return 1;
             else if(a[0]<b[0])
                 return -1;
             return 0;
            }
        });
 
         int ans=0;
 
     
         int p=intervals[0][1];

         for(int i=1;i<intervals.length;i++)
        {
          //   System.out.println(pq.peek());
            if(intervals[i][0]<p)
            {
                    if(intervals[i][1]<p)
                    {
                            p=intervals[i][1];
                    }
                ans++;
                
            }
            else 
            {
                    p=intervals[i][1];
            }
           
        }
     System.out.println(ans);

    }
}

