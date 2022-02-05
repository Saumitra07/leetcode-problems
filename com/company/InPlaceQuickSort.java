package com.company;

import java.util.Arrays;

public class InPlaceQuickSort {
    public static void main(String[] args) {

        int[] arr = {5, 7, 8, 9, 10, 10};
        quick_sort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));



    }

    public static void quick_sort(int[] arr, int left, int right)
    {
        if(left>=right)
        {
            return;
        }
        int pivot=arr[left];
        int i=left;
        int j=right;
        while(true)
        {
            while(arr[i]<pivot)
                i++;

            while(arr[j]>=pivot)
                j--;

            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else
                break;

        }

        quick_sort(arr,left,i-1);
        quick_sort(arr,j+1,right);


    }


}
