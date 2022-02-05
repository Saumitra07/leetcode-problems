package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {

    }
    public static  int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            if(ans.isEmpty() || ans.get(ans.size()-1)[1]<intervals[i][0])
            {
                ans.add(intervals[i]);
            }
            else
            {
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);

    }
}

