package com.company.Strings;

import java.util.HashMap;

public class MinWindowSubstring {
    public static void main(String[] args) {
        

        String s="ADOBECODEBANC";
        String t="ABC";

        HashMap<Character,Integer> reqMap=new HashMap<>();
        HashMap<Character,Integer> curMap=new HashMap<>(); 

        for(int i=0;i<t.length();i++)
        {
            reqMap.put(t.charAt(i),reqMap.getOrDefault(t.charAt(i),0)+1);
        }
        int reqCount=reqMap.size();
        int j=0;
        int i=0;
        int count=0;
        int ans=Integer.MAX_VALUE;
        int start=-1;
        int end=-1;
        while(i<s.length())
        {
            char c=s.charAt(i);
            curMap.put(s.charAt(i),curMap.getOrDefault(s.charAt(i),0)+1);

            if(reqMap.containsKey(s.charAt(i)))
                {
                    if(reqMap.get(s.charAt(i)).intValue()==curMap.get(s.charAt(i)).intValue())
                    {
                        count++;
                    }
                }

            while(reqCount==count)
            {
                if(i-j+1<=ans)
                {
                    ans=i-j+1;
                    start=j;
                    end=i;
                }
                if(curMap.containsKey(s.charAt(j)))
                {
                    curMap.put(s.charAt(j), curMap.get(s.charAt(j))-1);
                }

                if(reqMap.containsKey(s.charAt(j)))
                {
                    if(reqMap.get(s.charAt(j))>curMap.get(s.charAt(j)))
                    {
                        count--;
                    }

                }
                j++;
            }    
            i++;
        }
    

        if(ans==Integer.MAX_VALUE)
        {
            System.out.println("empty string");
        }
        else{
            System.out.println(s.substring(start, end+1));
        }


    }
}
