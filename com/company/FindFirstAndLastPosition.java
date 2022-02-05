package com.company;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int []a={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(a,8)));
    }
    public static int search(int []nums,int target,boolean isFirst)
    {
        int ans=-1;
        int i = 0;
        int j = nums.length - 1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                if(isFirst)
                {
                    j=mid-1;
                }
                else
                {
                    i=mid+1;
                }
            }
            else if(target>nums[mid])
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }

        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {

        int[] res = new int[2];
        res[0]=search(nums,target,true);
        res[1]=search(nums,target,false);
       return  res;
    }
}
