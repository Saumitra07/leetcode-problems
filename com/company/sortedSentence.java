package com.company;

public class sortedSentence {

    public static void main(String[] args) {
        System.out.println("Hello World");
        String s=sortSentence("is2 sentence4 This1 a3");
        System.out.println(s);

    }
    public static String sortSentence(String s) {

        String[] words=s.split(" ");

        String[] res=new String[words.length];
        for(int i=0;i<words.length;i++)
        {

                int index=Integer.parseInt(words[i].substring(words[i].length()-1))-1;

                // System.out.println(index);
                String temp=words[index].substring(0,words[index].length()-1);
                String temp1=words[i].substring(0,words[i].length()-1);
                res[index]=new String(temp1);
            //    words[i]=new String(temp);
              //  done[index]=1;

              //  System.out.println(temp+" "+temp1);


            //System.out.println(words[i].substring(words[i].length()-1));


            // // // System.out.println(words[i].substring(0,words[i].length()-1));
            // //  words[index]=words[i].substring(0,words[i].length()-1);
            // //     words[i]=temp;

        }

        return String.join(" ",res);
    }
}
