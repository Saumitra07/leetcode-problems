package com.company;

import java.util.Stack;
// this solution is iterative.
public class MatrixDFS {

    static int dRow[] = { 0, 1, 0, -1 };
    static int dCol[] = { -1, 0, 1, 0 };
    static class Pair{
        int first;
        int sec;
        Pair(int first, int sec)
        {
            this.first=first;
            this.sec=sec;
        }
    }

    public static boolean isValid(int row,int col,Boolean[][] visited)
    {
        if(row<0 || col < 0 || row >=3 || col >=3)
            return false;
        if(visited[row][col]==true)
            return false;
        return true;
    }
    public static void dfs(int[][] grid, int row,int col, Boolean[][] visited)
    {

        Stack<Pair> st=new Stack<>();
        st.push(new Pair(row,col));

        while(!st.isEmpty())
        {

            Pair p=st.pop();
            row=p.first;
            col=p.sec;
            if(!isValid(row,col,visited))
                continue;
            visited[row][col]=true;

            System.out.print(grid[row][col]);

            for(int i=0;i<4;i++)
            {
                int adjx=row+ dRow[i];
                int adjy= col+ dCol[i];
                st.push(new Pair(adjx,adjy));

            }



        }


    }
    public static void main(String[] args) {
        int grid[][] = { { -1, 2, 3 },
                { 0, 9, 8 },
                { 1, 0, 1 } };

        Boolean[][] visited=new Boolean[3][3];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                visited[i][j] = false;
            }
        }
        dfs(grid,0,0,visited);
    }
}
