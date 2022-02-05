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
            rem=0-nums[i];

            int x=i+1;
            int y=n-1;

            List<List<Integer>> pairs=new ArrayList<List<Integer>>();


          //  System.out.println(numList.toArray());
            while(x<y)
            {
                if(nums[x]+nums[y]==rem)
                {
                    List<Integer> pair1=new ArrayList<Integer>();
                    pair1.add(nums[x]);
                    pair1.add(nums[y]);
                    pairs.add(pair1);

                        res.add(Arrays.asList(nums[i],nums[x],nums[y]));

                    x++;
                    y--;
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
