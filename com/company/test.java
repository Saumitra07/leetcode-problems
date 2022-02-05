package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;

public class test {


    public static int cost(int x, int y, int a, int b) {
        return (Math.abs(x-a)+Math.abs(y-b));
    }
    public static int greedy(ArrayList<Integer> numpeople, ArrayList<Integer> x, ArrayList<Integer> y) {
        ArrayList<Integer> xx = new ArrayList<Integer>();
        ArrayList<Integer> yy = new ArrayList<Integer>();
        int ans = 0;
        for (int i = 0; i < numpeople.size(); i++) {
            int count = numpeople.get(i);
            while (count > 0) {
                xx.add(x.get(i));
                yy.add(y.get(i));
                count--;
            }
        }

        Collections.sort(xx);
        Collections.sort(yy);

        int mx, my;

        mx = xx.get(xx.size() / 2);
        my = yy.get(yy.size() / 2);

        for (int i = 0; i < numpeople.size(); i++) {
            ans += numpeople.get(i) * cost(mx, my, x.get(i), y.get(i));
        }
        return ans;
    }
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        ArrayList<Integer> x=new ArrayList<>();
        x.add(5);
        x.add(2);
        x.add(3);
        ArrayList<Integer> y=new ArrayList<>();
        y.add(3);
        y.add(4);
        y.add(7);
        int n=greedy(nums,x,y);

        System.out.println(n);








    }
}
