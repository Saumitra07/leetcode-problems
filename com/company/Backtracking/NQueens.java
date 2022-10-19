package com.company.Backtracking;

import java.util.*;

public class NQueens {
  static List<List<String>> ans=new ArrayList<>();
    public static void main(String[] args) {
        int n=4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];
        findNQueen(0, board, leftRow, lowerDiagonal, upperDiagonal);
        System.out.println(ans.toString());
        HashMap<Integer,Integer> map=new HashMap<>();
      //  System.out.println(map.get(1));
    }

    public static void findNQueen(int c,char[][] board,int[] leftRow,int[] lowerDiagonal, int[] upperDiagonal)

    {
        if(c==board.length)
        {
            List< String > res = new LinkedList< String >();
            for (int i = 0; i < board.length; i++) {
                String s = new String(board[i]);
                res.add(s);
            }
            ans.add(res);
            return;
        }

        for(int r=0;r<board.length;r++)
        {
            // commented appproach is more optimized
//            if(leftRow[r]==0 && lowerDiagonal[r+c]==0 && upperDiagonal[board.length-1+c-r]==0)
//
//            {
//                board[r][c]='Q';
//                leftRow[r] = 1;
//                lowerDiagonal[r + c] = 1;
//                upperDiagonal[board.length - 1 + c - r] = 1;
//                findNQueen(c+1,board, leftRow, lowerDiagonal, upperDiagonal);
//                board[r][c]='.';
//                leftRow[r] = 0;
//                lowerDiagonal[r + c] = 0;
//                upperDiagonal[board.length - 1 + c - r] = 0;
//
//            }
            if(isSafe(r,c,board))
            {
                board[r][c]='Q';
                findNQueen(c+1,board,leftRow,lowerDiagonal,upperDiagonal);
                board[r][c]='.';
            }
        }

    }

    public static boolean isSafe(int r,int c,char[][] board)
    {
        int i=r;
        int j=c;
        while(c>=0)
        {
            if(board[r][c]=='Q')
            {
                return  false;

            }
            c--;
        }
        c=j;

        // upper diagonal
        while(r>=0 && c>=0)
        {
            if(board[r][c]=='Q')
            {
                return  false;

            }
            r--;
            c--;
        }
        r=i;
        c=j;

        // lower diagonal
        while(r<board.length && c>=0)
        {
            if(board[r][c]=='Q')
            {
                return  false;

            }
            r++;
            c--;
        }
        return true;
    }

}
