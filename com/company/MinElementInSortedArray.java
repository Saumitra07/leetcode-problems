package com.company;

public class MinElementInSortedArray {
    public static int findMin(int[] nums) {

        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[i]<nums[j])
            {
                return nums[i];
            }
            else
            {
                if(nums[mid]<nums[j] && nums[mid]>nums[mid-1])
                {
                    return nums[mid-1];
                }
                else
                {
                    i=mid+1;

                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int []a={5,1,2,3,4};
        System.out.println(findMin(a));
    }
}
