package com.company;

import javax.sound.midi.SysexMessage;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MatrixBFS {
    static int dRow[] = {-1,0,1,0};
    static int dCol[] = { 0,1,0,-1 };
    static class Pair1{
        int first;
        int sec;
        Pair1(int first, int sec)
        {
            this.first=first;
            this.sec=sec;
        }
    }
    public static void main(String[] args) {
        int grid[][] = { { 1, 2, 3,4 },
                { 5,6,7,8},
                {9,10,11,12 },{13,14,15,16} };

        Boolean[][] visited=new Boolean[4][4];

        for(int i = 0; i < visited.length; i++)
        {
            for(int j = 0; j < visited[i].length; j++)
            {
                visited[i][j] = false;
            }
        }
         bfs(grid,0,0,visited);
        //iterativeBFS(0,0,visited,grid);
    }

//    public static void iterativeBFS(int row,int col,Boolean[][] visited,int[][] grid)
//    {
//        if(row<0 || col<0 || row>=4 || col>=4 || visited[row][col])
//            return;
//
//        System.out.println(grid[row][col]+"");
//        visited[row][col]=true;
//        iterativeBFS(row-1,col,visited,grid);
//        iterativeBFS(row,col+1,visited,grid);
//        iterativeBFS(row+1,col,visited,grid);
//        iterativeBFS(row,col-1,visited,grid);
//    }

    public static boolean isValid(int row,int col,Boolean[][] visited)
    {
        if(row<0 || col < 0 || row >=4 || col >=4)
            return false;
        if(visited[row][col]==true)
            return false;
        return true;
    }
    public static void bfs(int[][] grid, int row,int col, Boolean[][] visited) {

        Queue<Pair1> q = new LinkedList<>();
        q.add(new Pair1(row,col));
        visited[row][col]=true;
        while (!q.isEmpty()) {

            Pair1 p = q.peek();
            row = p.first;
            col = p.sec;


            System.out.print(grid[row][col]+" ");
            q.remove();
            for (int i = 0; i < 4; i++) {
                int adjx = row + dRow[i];
                int adjy = col + dCol[i];
                if(isValid(adjx, adjy, visited))
                {
                    q.add(new Pair1(adjx, adjy));
                    visited[adjx][adjy]=true;
                }


            }


        }

    }}
