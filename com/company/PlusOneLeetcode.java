package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOneLeetcode {
    public static int[] plusOne(int[] digits) {

        int n=digits.length-1;
        long num=0;
        for(int i=0;i<digits.length;i++)
        {
            num+=digits[i]*(long)Math.pow(10,n);
            n--;

        }
        System.out.println(num);
        num++;

        System.out.println(num);
        String str=String.valueOf(num);
        int []res=new int[str.length()];
        int j=str.length()-1;
        long rem=0;
        while(num!=0)
        {
            rem=num%10;
            System.out.println("rem is "+num%10);
            res[j]=(int)rem;

            num=num/10;
            j--;

        }

        return res;
    }


    public static void main(String[] args) {
        int []arr={6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
