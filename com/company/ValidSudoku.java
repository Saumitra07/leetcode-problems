package com.company;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rowSet=new HashSet<>();

        HashSet<Character> colSet=new HashSet<>();
        //  HashSet<> boxes[][] = new HashSet<>()[board.length][board[0].length];
        // HashMap<List<Integer>,HashSet<Character>> map=new HashMap<>();

//        HashSet seen=new HashSet<>();

        HashSet<Character>[] grids=new HashSet[board.length];
        for(int i=0;i<board.length;i++)
        {
            grids[i]=new HashSet<Character>();
        }
        for(int i=0;i<board.length;i++)
        {

            rowSet=new HashSet<>();
            colSet=new HashSet<>();
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!rowSet.add(board[i][j]))
                        return false;
//                     if(!map.containsKey(Arrays.asList(i/3,j/3)))
//                     {
//                         HashSet<Character> set=new HashSet<>();
//                         set.add(board[i][j]);
//                         map.put(Arrays.asList(i/3,j/3),set);
//                     }
//                     else
//                     {
//                         HashSet<Character> s=map.get(Arrays.asList(i/3,j/3));
//                         if(s.contains(board[i][j]))
//                             return false;
//                         s.add(board[i][j]);
//                         map.put(Arrays.asList(i/3,j/3),s);

//                     }

                    // if(!seen.add(board[i][j]+"box"+(i/3)*3+(j/3)))
                    //     return false;
                    if(!grids[(i/3)*3+ j/3].add(board[i][j]))
                        return false;


                }

                if(board[j][i]!='.')
                {
                    if (!colSet.add(board[j][i])) {
                        return false;
                    }

                }
            }


        }
        return true;
    }

}
