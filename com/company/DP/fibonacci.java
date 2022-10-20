package com.company.DP;

public class fibonacci {
    public static void main(String[] args) {
        int n=4;

        int []dp=new int[n+1];
        
           
        //memoization  time O(N)  space(O(N)+ O(N))
      // return findDp(n,dp);
        
        //tabulation time O(N)  space(O(N))
        
        dp[0]=0;
        if(n==0)
            System.out.println(0);
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-2]+dp[i-1];
        }
        
      //  return dp[n];
        
        //Space optimization O(N)

        int a=0;
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
    public int findDp(int n,int[] dp)
    {
        if(n<=1)
            return n;
        
        dp[n]=findDp(n-1,dp)+findDp(n-2,dp);
        
        return dp[n];
    }
}
