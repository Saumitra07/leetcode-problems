package com.company.Backtracking;
import java.util.*;
public class CombinationSumII {
   static HashSet<List<Integer>> set =new HashSet<>();
    public static void main(String[] args) {
        int []arr=new int[]{10,1,2,7,6,1,5};

         find(arr,8);
         System.out.print(set);
    }
    public static void find(int[] candidates, int target) {
       Arrays.sort(candidates);
        findComb(candidates,target,0,new ArrayList<>());
     //   return list;
    }
    public static void findComb(int[] candidates,int target,int index,List<Integer> list)
    {
        if(index==candidates.length)
        {
             if(target==0)
            {
                set.add(new ArrayList<>(list));
                 return;
            }
            return;
        }
             if(candidates[index]<=target)
             {
                   list.add(candidates[index]);
                    findComb(candidates,target-candidates[index],index+1,list);
                    list.remove(list.size()-1);
             }

             while(index+1<= candidates.length-1 && candidates[index]==candidates[index+1])
             {
                 index++;
             }
       
            findComb(candidates,target,index+1,list);
        
    }
}
