package com.company;

import java.util.ArrayList;
import java.util.List;

public class ReeteshCode {
    public static long getMaxProfit(List<Integer> indicators, List<Integer> profit, int k){
        int n=indicators.size();
        /*set_size of power set of a set
        with set_size n is (2**n -1)*/
        int counter=0, j=0;
        long pow_set_size = (long)Math.pow(2, n);
        long mx_sum=0;
        /*Run from counter 000..0 to 111..1*/
        while(counter<pow_set_size){
            j=0;
            long sum=0,bitwise_or=0;
            while(j<n){
                 /* Check if jth bit in the
                counter is set If set then
                print jth element from set */
                if((counter & (1 << j)) > 0){
                    bitwise_or=bitwise_or|indicators.get(j);
                    sum+=profit.get(j);
                }
                j++;
            }
            if(bitwise_or<=k){
                mx_sum=Math.max(sum, mx_sum);
            }
            counter++;
        }
        return mx_sum;
    }
    public static void main(String[] args) {
        List<Integer> indicators=new ArrayList<Integer>();
        List<Integer> profit=new ArrayList<Integer>();
        indicators.add(1);
        indicators.add(2);
        indicators.add(3);
        indicators.add(4);

        profit.add(4);
        profit.add(3);
        profit.add(2);
        profit.add(1);

        int k=1;
        System.out.println("Maximum Profit: "+getMaxProfit(indicators, profit, k));
    }
}
