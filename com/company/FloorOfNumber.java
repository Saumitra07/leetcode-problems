package com.company;

public class FloorOfNumber {
    public static void main(String[] args) {
        int []a={1,2,6,8,10,12,15};
        System.out.println(search(a,5));
    }
    public static int search(int []arr,int target)
    {
        int i=0;
        int j=arr.length-1;
        if(target<arr[i])
            return -1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(target==arr[mid])
            {
                return arr[mid];
            }
            else if(target>arr[mid])
            {
               i=mid+1;
            }
            else
            {
                j=mid-1;
            }


        }

        return arr[j];
    }
}
