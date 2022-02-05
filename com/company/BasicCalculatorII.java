package com.company;

import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String[] args) {
        System.out.println(calculate("3+5/2"));
    }
    public static int calculate(String s) {

        Stack<Integer> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        int i=0;
        while(i<s.length()-1)
        {
            if(Character.getNumericValue(s.charAt(i))<=0  || Character.getNumericValue(s.charAt(i))<=9)
            {
                s1.push(Character.getNumericValue(s.charAt(i)));
            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-')
            {
                s2.push(s.charAt(i));
            }
            else if(s.charAt(i)=='*')
            {
                s1.push(Character.getNumericValue(s1.peek())*Character.getNumericValue(s.charAt(i+1)));
                s1.pop();
            }
            else if(s.charAt(i)=='/')
            {
                s1.push(Character.getNumericValue(s1.peek())/Character.getNumericValue(s.charAt(i+1)));
                s1.pop();
            }

            i++;
        }

        int res=0;
        while(!s1.isEmpty() && !s2.isEmpty())
        {
            int a=s1.pop();
            int b=s1.pop();
            char op=s2.pop();
            if(op=='+')
            {
                res=res+a+b;
            }
            else
            {
                res=res+b-a;
            }
        }
        return res;
    }
}
