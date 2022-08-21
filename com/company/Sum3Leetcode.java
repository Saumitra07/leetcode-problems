package com.company;

import java.sql.Array;
import java.util.*;

public class Sum3Leetcode {
    public static List<List<Integer>> threeSum(int[] nums) {


        HashSet<List<Integer>> res= new HashSet<>();
        int rem=0;
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++)
        {

            if(i>0 && nums[i]==nums[i-1])
                continue;

            int x=i+1;
            int y=n-1;


          //  System.out.println(numList.toArray());
            while(x<y)
            {
                if(nums[x]+nums[y]+nums[i]==0)
                {
//                    List<Integer> pair1=new ArrayList<Integer>();
//                    pair1.add(nums[x]);
//                    pair1.add(nums[y]);
//                    pairs.add(pair1);

                        res.add(Arrays.asList(nums[i],nums[x],nums[y]));

                 x++;
                 while(nums[x-1]==nums[x] && x<y)
                 {
                     x++;
                 }
                }
                else if(nums[x]+nums[y]>rem)
                {
                    y--;
                }
                else
                {
                    x++;
                }



            }

        }


        return new ArrayList<>(res);
    }

    public static void main(String[] args) {

        int []nums= {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));




    }
}
