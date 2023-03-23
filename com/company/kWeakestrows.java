package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class kWeakestrows {
    public static void main(String[] args) {

        int k=3;
        int[][] mat=new int[][]{{1,1,1,1,1},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,1,1,1,1}};
            PriorityQueue<int[]> pq=new PriorityQueue<>((new Comparator<int[]>(){
                public int compare(int[] s1, int[] s2) {
                    if(s1[1]==s2[1])
                    {
                        if(s1[0]<s2[0])
                            return 1;
                        else return -1;
                    }
                    if (s1[1] < s2[1])
                        return 1;
                    else if (s1[1]> s2[1])
                        return -1;
                    return 0 ;
                }
            }));
    
            for(int i=0;i<mat.length;i++)
            {
                int s=0;
                int e=mat[0].length-1;
                while(s<=e)
                {
                    int mid=s+(e-s)/2;
                    if(mat[i][mid]==0)
                        e=mid-1;
                    else 
                        s=mid+1;
                }
    
                pq.add(new int[]{i,s});
                if(pq.size()>k)
                    pq.remove();
               
            }

            Iterator ir=pq.iterator();

            while(ir.hasNext())
            {
                System.out.println(ir.next());
            }
    
        
    
            int[] res=new int[k];
            for(int i=k-1;i>=0;i--)
            {
    
                res[i]=pq.remove()[0];
            }
    
                System.out.println(Arrays.toString(res));
        //return res;  
    }

}
