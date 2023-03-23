package com.company;

import java.util.Arrays;

public class kokoEatingBananas {
    public static void main(String[] args) {
        int[] piles=new int[]{30,11,23,4,20};
        int h=6;
        long i=1;
        long j=1000000000;
        long  speed=j;
       
        while(i<=j)
        {
            long mid=i+(j-i)/2;
            long val=calSpeed(mid,piles);
                if(val<=h && mid<=speed)
                {
                         speed=mid;
                           j=mid-1;
                }
           
            else
            {
              
                i=mid+1;
               
            }

        }
       System.out.println("final ans is"+speed);
    }
    public static long calSpeed(long num,int[] piles)
    {
         
        long speed=0;
            for(int i=0;i<piles.length;i++)
            {
                if(piles[i]%num==0)
                    speed+=(piles[i]/num);
                else
                      speed+=((piles[i]/num)+1);
            }
            return speed;
    }
}
