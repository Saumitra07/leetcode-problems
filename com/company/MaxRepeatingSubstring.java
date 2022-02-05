package com.company;

public class MaxRepeatingSubstring {
    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }

    public static int maxRepeating(String sequence, String word) {
        if(sequence.indexOf(word)<0)
        {
            return 0;
        }
        if(sequence.length()==word.length())
        {
            return 1;
        }


        int count=0;
        StringBuffer word1=new StringBuffer(word);

        while(sequence.indexOf(word1.toString())>=0)
        {
            System.out.println(sequence.indexOf(word1.toString()));
            word1.append(word);
            count++;
        }


        return count;



    }
}
