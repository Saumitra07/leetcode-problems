package com.company.Backtracking;

import java.util.Arrays;

public class MColoring {
    public static void main(String[] args) {
        boolean[][] graph=new boolean[][]{{false, true, true, true},
                {true, false, true, false},
                {true, true, false, true},
                {true, false, true, false}};

        int m=3;
        int n=4;
        System.out.println(graphColoring(graph,m,n));
    }
    public static boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here

        int []colors=new int[n];


        return check(graph,colors,0,n,m);

    }
    public static boolean check(boolean[][] graph,int[] colors,int index,int n,int m)
    {

        if(index==n)
            return true;

        for(int i=1;i<=m ;i++)
        {
            if(isPossible(graph,colors,index,i,n))
            {
                colors[index]=i;
                if(check(graph,colors,index+1,n,m))
                    return true;
                colors[index]=0;
            }
        }

        return false;
    }

    public static boolean isPossible(boolean[][] graph,int[] colors,int index,int col,int n)
    {


        for(int i=0;i<n;i++)
        {
            if(i!=index && graph[i][index]==true && colors[i]==col ){
                // if(colors[i]==col)
                return false;
            }
        }

        return true;
    }
}
