package com.company.Graphs;

import java.util.Stack;

public class floodFill {
    public static void main(String[] args) {
        int [][]image={{1,1,1},{1,1,0},{1,0,1}};

        int[][]res=floodFill(image,1,1,2);

        for(int i=0;i< image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                System.out.print(res[i][j]);

            }
            System.out.println();
        }

    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[] drow={0,1,0,-1};
        int[] dcol={-1,0,1,0};
        Stack<int[]> st=new Stack<>();
        int []a={sr,sc};
        st.push(a);

        while(!st.isEmpty())
        {
            int[] elem=st.pop();
            int cur_row=elem[0];
            int cur_col=elem[1];
            if(!isValid(cur_row,cur_col,image,color))
                continue;

            image[cur_row][cur_col]=color;

            for(int i=0;i<4;i++)
            {
                int adjx=cur_row+drow[i];
                int adjy=cur_col+dcol[i];
                int[] newPair={adjx,adjy};
                st.push(newPair);
            }
        }

        return image;
    }

    public static boolean isValid(int row,int col,int[][] image, int color)
    {
        if(row<0 || col<0 || row>=image.length || col>=image[0].length)
            return false;
        if(image[row][col]==0 || image[row][col]==color)
            return false;
        return true;
    }
}
