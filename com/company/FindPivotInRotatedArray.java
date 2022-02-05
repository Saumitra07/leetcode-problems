package com.company;


//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class FindPivotInRotatedArray {

    public static void main(String[] args) {
        int[] a = {7, 9, 11, 12, 15};
        System.out.println(getPivot(a)+1);

    }
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
}
