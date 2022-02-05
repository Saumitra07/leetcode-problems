package com.company;

public class NumOfSubstringsContainingAll3Chars {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }

    public static int numberOfSubstrings(String s) {

        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {

            for(int j=i+2;j<s.length();j++)
            {
                if(s.substring(i,j+1).indexOf('a')!=-1 && s.substring(i,j+1).indexOf('b')!=-1 && s.substring(i,j+1).indexOf('c')!=-1)
                {
                    count+=s.length()-j;
                    break;
                }
            }

        }

        return count;

    }
}
