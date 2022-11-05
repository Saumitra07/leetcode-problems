package com.company.Backtracking;

public class wordSearch {
    public static void main(String[] args) {
        char[][] board=new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(search(i,j,board,word,0))
                        return true;
                }
            }
        }
        
        return false;
    }
    
    
    public static boolean search(int r,int c,char[][] board,String word,int index)
    {
        if(index==word.length())
            return true;
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]=='.')
            return false;
        if(board[r][c]!=word.charAt(index))
            return false;
        
        board[r][c]='.';
        
         boolean res=search(r,c-1,board,word,index+1) || search(r-1,c,board,word,index+1) || search(r,c+1,board,word,index+1) || search(r+1,c,board,word,index+1);
        
         board[r][c]=word.charAt(index);
        return res;
        
    }
}
