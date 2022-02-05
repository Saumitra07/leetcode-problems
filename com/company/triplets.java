package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class triplets {
    public static void main(String[] args) {
        int []arr1={1,1};
        int []arr2={1,1,1};
        System.out.println(numTriplets(arr1,arr2));
    }
    public static int numTriplets(int[] nums1, int[] nums2) {



        HashMap<Integer,Integer> squares=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(squares.containsKey(nums1[i]*nums1[i]))
            {
                int val=squares.get(nums1[i]*nums1[i]);
                val++;
                squares.put(nums1[i]*nums1[i],val);

            }

            else
            {
                squares.put(nums1[i]*nums1[i],1);
            }
        }
        HashMap<Integer,Integer> squares2=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(squares2.containsKey(nums2[i]*nums2[i]))
            {
                int val=squares2.get(nums2[i]*nums2[i]);
                val++;
                squares2.put(nums2[i]*nums2[i],val);

            }

            else
            {
                squares2.put(nums2[i]*nums2[i],1);
            }
        }
        int triplets=0;
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=i+1;j<nums2.length;j++)
            {

                    triplets+=squares.getOrDefault(nums2[i]*nums2[j],0);
            }
        }
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=i+1;j<nums1.length;j++)
            {


                    triplets+=squares.getOrDefault(nums1[i]*nums1[j],0);
                    int val=squares2.get(nums1[i]*nums1[j]);

            }
        }

        return triplets;



    }

//    public int numTriplets(int[] nums1, int[] nums2) {
//        return calculate(nums1,nums2) + calculate(nums2,nums1);
//
//
//    }
//    public static int calculate(int[] num1,int[] num2)
//    {
//        HashMap<Long, Integer> map = new HashMap<>();
//        long n = num1.length,  m = num2.length, ans = 0;
//        for(int i=0; i<n; i++) map.put((long)num1[i]*num1[i],map.getOrDefault((long)num1[i]*num1[i],0)+1);
//        for(int j=0; j<m; j++)  for(int k=j+1; k<m; k++)   ans += (long)map.getOrDefault((long)num2[j]*num2[k],0);
//        return (int)ans;
//    }
}
