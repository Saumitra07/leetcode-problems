package com.company;

public class PeekIndexInArray {
    public static void main(String[] args) {

        int []a={1,2,3,4,5};
        System.out.println(peek(a));

    }

    public static int peek(int []arr)
    {

        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
         int mid=i+(j-i)/2;
            if(arr[mid]<arr[mid+1])
            {
                i=mid+1;
            }
            else
            {
                j=mid;
            }

        }

        return i;
    }

}
