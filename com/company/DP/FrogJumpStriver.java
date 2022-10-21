package com.company.DP;

import java.util.Arrays;

public class FrogJumpStriver {

    public static void main(String[] args) {
        
        int[] arr=new int[]{7,4,4,2,6,6,3,4};
        int n=8;

        int[] dp=new int[n+1];
        Arrays.fill(dp,0,dp.length,-1);

        //tabulization

        dp[0]=0;
        for(int i=1;i<n;i++)
        {
           int fs= dp[i-1] + Math.abs(arr[i]-arr[i-1]);
            int dj=Integer.MAX_VALUE;
            if(i>1)
            {
                 dj=dp[i-2]+ Math.abs(arr[i]-arr[i-2]);
            }
          
            dp[i]=Math.min(fs,dj);
        }


        System.out.println(dp[n-1]);

        
        //Memoization
       // System.out.println(countMinEnergy(arr, n-1, dp));

    }

    public static int countMinEnergy(int[] arr,int n,int[] dp)
    {

        if(n==0)
        return 0;

    if(dp[n]==-1)
    {
        int jump1=countMinEnergy(arr, n-1, dp) + Math.abs(arr[n]-arr[n-1]);
        if(n>1)
        {
            int jump2=countMinEnergy(arr, n-2, dp) + Math.abs(arr[n]-arr[n-2]);
            dp[n]=Math.min(jump1, jump2);
            return dp[n];

        }
        dp[n]=jump1;  
    }
      
        return dp[n];
     
    }
    
}
