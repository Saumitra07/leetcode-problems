package com.company;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        boolean flag=false;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(dfs(board,i,j,word,0))
                {
                    System.out.println("found");
                    flag=true;
                }

            }
        }
        if(!flag)
            System.out.println("not found");
    }

    private static boolean dfs (char[][] board, int row, int col, String word,int index){
        if (index >= word.length())
            return true;
        if (row < 0 || col < 0 || row > board.length - 1 || col > board[0].length - 1)
            return false;


        if (board[row][col] != word.charAt(index))
            return false;
        //board[row][col]^=256;

        boolean res = dfs(board, row - 1, col, word, index + 1) || dfs(board, row, col + 1, word, index + 1) || dfs(board, row + 1, col, word, index + 1) || dfs(board, row, col - 1, word, index + 1);


        return res;
    }

}