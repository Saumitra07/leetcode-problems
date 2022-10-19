package com.company.Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        List<List<Integer>> list=new ArrayList<>();
        find(nums,list,new ArrayList<>(),0);
        System.out.println(list);

        list=new ArrayList<>();
        int[] dupNums=new int[]{1,2,2};
        findSubSet2(dupNums,list,new ArrayList<>(),0);
        System.out.println(list);




    }

    public static void find(int[] nums,List<List<Integer>> list,List<Integer> curList,int index)
    {
        if(index==nums.length)
        {

            list.add(new ArrayList<>(curList));
            return;
        }

        curList.add(nums[index]);
        find(nums,list,curList,index+1);
        curList.remove(curList.size()-1);
        find(nums,list,curList,index+1);
    }
    public static void findSubSet2(int[] nums, List<List<Integer>> list, List<Integer> curList, int index)
    {
        if(index==nums.length)
        {

            list.add(new ArrayList<>(curList));
            return;
        }

        curList.add(nums[index]);
        findSubSet2(nums,list,curList,index+1);
        curList.remove(curList.size()-1);
        while(index+1<nums.length && nums[index]==nums[index+1])
        {
            index++;

        }
        findSubSet2(nums,list,curList,index+1);
    }
}
