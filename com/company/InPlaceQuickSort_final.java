package com.company;

import java.util.Arrays;
import java.util.Random;

public class InPlaceQuickSort_final {

    public static void main(String[] args) {

       // int[] arr = {5, 7, 8, 9, 10, 10};
        //quick_sort1(arr,0,arr.length-1);

        int[] arr1=new int[50000];

        Random r=new Random();
        for(int i=0;i<50000;i++)
        {
            arr1[i]=r.nextInt(50);
        }
        quick_sort1(arr1,0,arr1.length-1);

        System.out.println(Arrays.toString(arr1));


    }


    public static void quick_sort1(int[] arr, int a,int b)
    {
            if(a>=b)
            {
                return;
            }
            int l=partition(arr,a,b);
            quick_sort1(arr,a,l-1);
            quick_sort1(arr,l+1,b);


    }

    public static int partition(int []arr,int a,int b)
    {
        Random rand=new Random();
        int random=rand.nextInt(b+1);

        int temp=arr[random];
        arr[random]=arr[b];
        arr[b]=temp;
        int pivot=arr[b];
        int l=a;
        int r=b-1;
        while(l<=r)
        {
            while(l<=r && arr[l]<=pivot)
            {
                l++;
            }
            while(r>=l && arr[r]>=pivot)
            {
                r--;
            }
            if (l<r)
            {
                 temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;

            }

        }

        temp=arr[l];
        arr[l]=arr[b];
        arr[b]=temp;




        return l;
    }


}
