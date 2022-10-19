package com.company.Intervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public static void main(String[] args) {
        int[][] intervals=new int[][]{{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(intervals));
    }

    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b)
            {
                if(a[0]<b[0])
                    return -1;
                return 1;
            }
        });
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(intervals[0][1]);
        int ans=1;

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<pq.peek())
            {
                ans++;

            }
            else
            {
                pq.poll();
            }
            pq.add(intervals[i][1]);
        }


        return ans;
    }
}
