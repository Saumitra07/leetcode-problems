package com.company;

public class Search_rotatedSortedArray {
    public static int getPivot(int []arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(mid<j && arr[mid]>arr[mid+1])
                return mid;
            if(mid>i && arr[mid]<arr[mid-1])
                return mid-1;

            if(arr[i]<arr[mid])
                i=mid+1;
            else
                j=mid-1;
        }

        return -1;
    }
    public static int binary_search(int []nums,int i,int j,int target)
    {
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]==target)
            {
                return mid;

            }
            else if(nums[mid]<target)
            {
                i=mid+1;
            }
            else {
                j=mid-1;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {

        int pivot=getPivot(nums);
        if(nums[pivot]==target)
            return pivot;

        if(pivot==-1)
            return binary_search(nums,0,nums.length-1,target);
        else if(target>=nums[0])
            return binary_search(nums,0,pivot-1,target);
        else
           return binary_search(nums,pivot+1,nums.length-1,target);


        //below approch is without using a pivot
//        int i=0;
//        int j=nums.length-1;
//        int mid;
//
//        while(i<=j)
//        {
//            mid=i+(j-i)/2;
//
//            if(nums[mid]==target)
//            {
//                return mid;
//            }
//            if(nums[i]<=nums[mid])
//            {
//                if(target>nums[mid] || target<nums[i])
//                {
//                    i=mid+1;
//                }
//                else
//                {
//                    j=mid-1;
//                }
//            }
//            else
//            {
//                if(target>nums[j] || target<nums[mid])
//                {
//                    j=mid-1;
//                }
//                else
//                {
//                    i=mid+1;
//                }
//            }
//
//        }
//
//        return -1;






    }
    public static void main(String[] args) {
            int []a={4,5,6,7,8,0,1,2};
            System.out.println(search(a,9));
    }

}
