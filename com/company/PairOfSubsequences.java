package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class PairOfSubsequences{
    static ArrayList<String> AllPossibleStrings(String s) {
        int n = s.length();
        ArrayList<String>ans=new ArrayList<>();
        for (int num = 0; num < (1 << n); num++) {
            String sub = "";
            for (int i = 0; i < n; i++) {
                //check if the ith bit is set or not
                if ((num & (1 << i))!=0) {
                    sub += s.charAt(i);
                }
            }
            if (sub.length() > 0) {
                ans.add(sub);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void printSubSequence(int index,ArrayList<Character> list,String arr)
    {
        if(index>=arr.length())
        {
            System.out.println(list.toString());
            return;
        }
        list.add(arr.charAt(index));
        printSubSequence(index+1,list,arr);
        list.remove(list.size()-1);
        printSubSequence(index+1,list,arr);

    }
    public static void main(String args[])
    {


        String s="312";
       // ArrayList<String>ans = AllPossibleStrings(s);
        //printint all the subsequence.
//        System.out.println("All possible subsequences are ");
//        for (String it : ans) {
//            System.out.print( it+" ");
//        }
        ArrayList<Character> list=new ArrayList<>();
        printSubSequence(0,list,s);
    }
}