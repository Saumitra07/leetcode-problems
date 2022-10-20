package com.company.DP;

public class ClimbingStairs {
    public static void main(String[] args) {
        
            int n=5;
            int[] dp=new int[n+1];

            //memoization
            System.out.println(countSteps(n,dp));



            //space optimization

                int a=1;
                int b=1;
                for(int i=2;i<=n;i++)
                {
                    int c=a+b;
                    a=b;
                    b=c;
                }   
            System.out.println(b);
    }


    //memoization
    public static int countSteps(int n,int[] dp)
    {
       
        if(n<=1)
        return 1;
    
        dp[n]=countSteps(n-1,dp)+countSteps(n-2,dp);
    
         return dp[n];
    }
}
