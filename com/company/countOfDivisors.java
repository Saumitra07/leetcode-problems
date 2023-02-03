package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class countOfDivisors {
    public static void main(String[] args) {
        int n=5;
        System.out.println(String.valueOf(n).charAt(0));
    }


    public static int count(int n)
    {
        int c=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                {
                    if(n/i==i)
                    {
                        c+=1;
                    }
                    else{
                        c+=2;
                    }
                }

        }

        return c;
    }
  
}
