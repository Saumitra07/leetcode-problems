package com.company;

import java.util.Arrays;

public class PointsInsideCircle {

    public static int[] countPoints(int[][] points, int[][] queries) {
        int []count=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int x=queries[i][0];
            int y=queries[i][1];
            int r=queries[i][2];
            for(int j=0;j<points.length;j++)
            {
                int x1=points[j][0];
                int y1=points[j][1];
                if(Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2))<=r)
                {
                    count[i]+=1;
                }
            }
        }

        return count;

    }


    public static void main(String[] args) {
        int [][]points={{1,3},{3,3},{5,3},{2,2}};
        int  [][]queries = {{2,3,1},{4,3,1},{1,1,2}};
        System.out.println(Arrays.toString(countPoints(points,queries)));
    }
}
