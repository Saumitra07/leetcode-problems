package com.company;

public class MinimumOpsToMakeArrayEqual {
    public static  int minOperations(int n) {
//        if(n==1)
//        {
//            return 1;
//        }
//
//        int []arr=new int[n];
//        arr[0]=1;
//        int sum=1;
//        for(int i=1;i<n;i++)
//        {
//            arr[i]=arr[i-1]+2;
//            sum+=arr[i];
//        }
//        int target=sum/n;
//        int count=0;
//        int flag=0;
//
//        while(flag!=1)
//        {
//            int x=n-1;
//            int y=0;
//            while(x>y)
//            {
//                if(arr[x]!=target && arr[y]!=target)
//                {
//                    arr[x]--;
//                    arr[y]++;
//                    count++;
//                }
//
//                x--;
//                y++;
//
//            }
//
//
//            for(int i=0;i<n;i++)
//            {
//                if(arr[i]==target)
//                {
//                    flag=1;
//                }
//                else
//                {
//                    flag=0;
//                }
//            }
//
//
//        }
//        return count;

        int i = 0, j = n - 1, ans = 0;
        while(i < j) {
            ans += ((2 * j) - (2 * i)) / 2;
            i++;
            j--;
        }

        return ans;


    }
    public static void main(String[] args) {
            System.out.println(minOperations(5));
    }
}
