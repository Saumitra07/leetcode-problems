package com.company;

import java.util.HashMap;

public class LongestSubArraySumEqualsToK {
    public static void main(String[] args) {
        int []a={1,1,1,-1,-1,1,-2,3};
        System.out.println(lenOfLongSubarr(a,8,2));

    }

    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function

        int sum=0;
        int result=0;
        int size=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<N;i++)
        {
            sum += A[i];
            if (map.containsKey(sum - K)) {
                if (size < (i - map.get(sum - K)))
                    size = i - map.get(sum - K);
            }
         if (!map.containsKey(sum)) {
                map.put(sum, i);
       }
        }

        return size;
    }

}

