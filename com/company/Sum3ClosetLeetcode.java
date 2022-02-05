package com.company;

import java.util.Arrays;

public class Sum3ClosetLeetcode {

    public static int threeSumClosest(int[] nums,int target) {


        int near_sum=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        int rem=0;
        for(int i=0;i<nums.length-2;i++)
        {
            rem=target-nums[i];
            int x=i+1;
            int y=nums.length-1;

            while(x<y)
            {
                if(Math.abs(target-(nums[i]+nums[x]+nums[y]))<=Math.abs(target-near_sum))
                {
                    near_sum=nums[i]+nums[x]+nums[y];
                }
                if(nums[x]+nums[y]==rem)
                {
                    x++;
                    y--;
                }
                else if(nums[x]+nums[y]>rem)
                {
                    y--;
                }
                else
                {
                    x++;
                }
            }
        }



        return near_sum;
    }

    public static void main(String[] args) {
        int []nums= {-1,2,1,-4};
        System.out.println(threeSumClosest(nums,1));

    }

}
