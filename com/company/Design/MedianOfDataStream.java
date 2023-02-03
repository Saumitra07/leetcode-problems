package com.company.Design;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

    PriorityQueue<Integer> fpart;
    PriorityQueue<Integer> spart;
    boolean even;
    public MedianFinder() {
        
        fpart=new PriorityQueue<>(Collections.reverseOrder());
        spart=new PriorityQueue<>();
        even=true;
    }
    
    public void addNum(int num) {
       if(even)
       {
            spart.offer(num);
            fpart.offer(spart.poll());
       }
        else
        {
             fpart.offer(num);
             spart.offer(fpart.poll());
           
        }
        even=!even;
    }
    
    public void findMedian() {
        
       if(even)
            System.out.println((fpart.peek() + spart.peek())/2.0);
            //return (fpart.peek() + spart.peek())/2.0;
        else
        System.out.println(fpart.peek());
            //return fpart.peek();
    }
}
public class MedianOfDataStream {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        medianFinder.findMedian(); // return 2.0
    }
}
