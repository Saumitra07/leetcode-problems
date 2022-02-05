package com.company;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        for(int i=1;i<=k;i++)
        {
            nums=callReverse(nums);
        }
        return nums;
    }
    public static int[] callReverse(int []nums)
    {
        reverse(nums,0,nums.length-1);
        nums=reverse(nums,1,nums.length-1);
       return nums;
    }
    public static int[] reverse(int []nums,int i,int j)
    {

        while(i<=j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

        return nums;
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(a,3)));
    }
}
