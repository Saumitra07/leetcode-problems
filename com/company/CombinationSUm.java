package com.company;

import java.util.ArrayList;
import java.util.List;

public class CombinationSUm {

    public static void main(String[] args) {

            int []arr=new int[]{2,3,6,7};

            System.out.println(combinationSum(arr,7));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        findComb(candidates,0,target,list,new ArrayList<>());
        return list;
    }

    public static void findComb(int[] candidates,int index,int target,List<List<Integer>> list,List<Integer> curList) {
        if (index == candidates.length)
        {
            if(target==0)
            {
                list.add(new ArrayList<>(curList));
                return;
            }

            return;
        }

        if(candidates[index]<=target)
        {
            curList.add(candidates[index]);
            findComb(candidates,index,target-candidates[index],list,curList);
            curList.remove(curList.size()-1);
        }
        findComb(candidates,index+1,target,list,curList);

    }

}
