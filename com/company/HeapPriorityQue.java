package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapPriorityQue {
    public static void main(String[] args) {
        int[] arr=new int[]{3,2,1,5,6,4};

        // Max  Heap
        PriorityQueue<Integer> qMin=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer s1, Integer s2) {
                if (s1 < s2)
                    return 1;
                else if (s1> s2)
                    return -1;
                return 0;
            }
        });

        //Min Heap
        PriorityQueue<Integer> qMax=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer s1, Integer s2) {
                if (s1 < s2)
                    return -1;
                else if (s1> s2)
                    return 1;
                return 0;
            }
        });

        for(int i=0;i<arr.length;i++)
        {
            qMin.add(arr[i]);
            qMax.add(arr[i]);
        }

       // max heap elements

        for(int i=0;i<arr.length;i++)
        {
         System.out.print(qMin.poll()+" ");
        }

        System.out.println();
        //min heap elements

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(qMax.poll()+" ");
        }


        //Comparators using lambda

        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>(
                (o1,o2)-> {
                    int d1 = o1[0]*o1[0]+o1[1]*o1[1];   //calculating distance of point 1 from origin
                    int d2 = o2[0]*o2[0]+o2[1]*o2[1];  // calculating distance of point 2 from origin
                    return d2-d1;
                });

    }
}
