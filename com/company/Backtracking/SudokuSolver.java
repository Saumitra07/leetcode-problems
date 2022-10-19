package com.company.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {

        char[][] board={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        solve(board);
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean solve(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]=='.')
                {

                    for(char c=1;c<=9;c++)
                    {
                        char c1=Integer.toString(c).charAt(0);
                        if(check(board,i,j,c1))
                        {
                            board[i][j]=c1;
                            if(solve(board))
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j]='.';


                            }

                        }


                    }
                    return false;
                }

            }


        }
        return true;
    }

    public static boolean check(char[][] board,int r,int c,char p)
    {


        for(int i=0;i<9;i++)
        {
            if(board[i][c]==p)
                return false;
        }

        for(int i=0;i<9;i++)
        {
            if(board[r][i]==p)
                return false;
        }

        for(int i=0;i<9;i++)
        {
            if(board[(r/3)*3+i/3][3*(c/3)+i%3]==p)
                return false;
        }
        return true;
    }

}
