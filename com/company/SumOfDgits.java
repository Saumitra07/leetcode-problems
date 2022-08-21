package com.company;

public class SumOfDgits {
    static int sum=0;

    public static void main(String[] args) {
        int a=1234;
        String s=Integer.toString(a);
        sum(s.length()-1,s);
        System.out.println(sum);
    }
    public static void sum(int index,String s)
    {
        if(index<0)
            return;
        else
        {
            sum +=(Integer.parseInt(String.valueOf(s.charAt(index))));
            index--;
            sum(index,s);
        }
    }
}
