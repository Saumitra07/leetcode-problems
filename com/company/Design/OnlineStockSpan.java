package com.company.Design;

import java.util.Stack;

//The span of the stock's price today is defined as the maximum number
// of consecutive days (starting from today and going backward) for which the stock price 
//was less than or equal to today's price.

//For example, if the price of a stock over the next 7 days were 
//[100,80,60,70,60,75,85], then the stock spans would be [1,1,1,2,1,4,6].

class StockSpanner {

    Stack<int[]> st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        
        int count=0;
        while(!st.isEmpty() && st.peek()[0]<=price)
        {
           count+= st.pop()[1];
        }
        
        st.add(new int[]{price,count+1});

        System.out.println(count+1);
        return count+1;
        
    }
}


public class OnlineStockSpan {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        stockSpanner.next(100); // return 1
        stockSpanner.next(80);  // return 1
        stockSpanner.next(60);  // return 1
        stockSpanner.next(70);  // return 2
        stockSpanner.next(60);  // return 1
        stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        stockSpanner.next(85);  // return 6

    }
}
