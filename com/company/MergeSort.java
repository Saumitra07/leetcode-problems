package com.company;

import java.util.Arrays;

public class MergeSort {

   public static void main(String[] args) {
      int []arr={7,2,1,4,6,13,12,0};

      mergesort(arr,0,arr.length-1);

      System.out.println(Arrays.toString(arr));

   }

   public static void mergesort(int[] arr,int l,int r)
   {

         if(l<r)
         {
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
         }


   }

   public static void merge(int []arr,int l,int m,int r)
   {

      int[] temp=new int[r-l+1];
      int i,j,k;
      i=l;
      j=m+1;
      k=0;
      while(i<=m && j<=r)
      {
            if(arr[i]<=arr[j])
            {
               temp[k]=arr[i];
               i++;
            }
            else
            {
               temp[k]=arr[j];
               j++;
            }
         k++;
      }
      while(i<=m)
      {
         temp[k]=arr[i];
         k++;
         i++;
      }
      while(j<=r)
      {
         temp[k]=arr[j];
         k++;
         j++;
      }

      for(int x=l;x<=r;x++)
      {
         arr[x]=temp[x-l];
      }

   }

}
