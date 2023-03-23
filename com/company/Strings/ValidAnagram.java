package com.company.Strings;

public class ValidAnagram {
    public static void main(String[] args) {

        String s="abcab";
        String t="bbbca";
        if(s.length()!=t.length())
       System.out.println("no anagram");
        
    char []c=new char[26];
    
    for(int i=0;i<s.length();i++)
    {
        c[s.charAt(i)-'a']++;
    }
       
    for(int i=0;i<t.length();i++)
    {
        c[t.charAt(i)-'a']--;
    }
       
    for(int i=0;i<c.length;i++)
    {
        if(c[i]!=0)
        System.out.println("no anagram");
    }
    
    System.out.println("valid anagram");
    }
}
