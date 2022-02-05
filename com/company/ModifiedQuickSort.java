package com.company;

import java.util.Arrays;
import java.util.Random;

public class ModifiedQuickSort {
    public static void main(String[] args) {

        int[] arr1={7,8,1,2,6};

   /*     Random r=new Random();
        for(int i=0;i<50000;i++)
        {
            arr1[i]=r.nextInt(50);
        }*/
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

    public static int getMedian(int[]arr,int a,int b,int c) {

        if (arr[a] >  arr[b])
        {
            if (arr[b] > arr[c])
            {

            }
            else if (arr[a] > arr[c])
                return c;
            else
                return a;
        }
        else
        {
            // Decided a is not greater than b.
            if (arr[a] >  arr[c])
                return a;
            else if (arr[b] >  arr[c])
                return c;
            else
                return b;
        }

        return 0;


    }

    public static int partition(int []arr,int a,int b)
    {

        Random rand=new Random();
        int mid=(a+b/2);
       // int random=rand.nextInt(b+1);
        int random=getMedian(arr,a,mid,b);



        int temp=arr[random];
        arr[random]=arr[mid];
        arr[mid]=temp;

        int pivot=arr[mid];
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
