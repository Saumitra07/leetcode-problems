package com.company;


import java.util.ArrayList;

        import java.util.HashMap;

        import java.util.List;

public class Huffman {

    static String decode(List<String> codes, String encoded){

        String output="";

//converting codes into hash maps with binary code as key

        HashMap<String, String> hmap = new HashMap<String, String>();

        for (String s : codes) {

            String[] temp2=s.split(" ");
            if(temp2.length>1)
            {
                if(temp2[0].equals("[newline]"))

                    temp2[0]="\n";
                   hmap.put(temp2[1],temp2[0]);

            }
            else
            {
                hmap.put(temp2[0]," ");
            }
//if its newline string then append "\n"
        }

//get 6bit substring from encoded string

//and get its code value from hash map

//append the result to output

        int minInterval=Integer.MAX_VALUE;
        for(String key:hmap.keySet())
        {
            if(key.length()<minInterval)
            {
                minInterval=key.length();
            }
        }

        int counter=minInterval;
        int i=0;
        while(i<encoded.length())
        {
            counter=minInterval;
            while(!hmap.containsKey(encoded.substring(i,i+counter)))
            {
                counter++;

            }
            output+=hmap.get(encoded.substring(i,counter));
            i+=counter;
        }

//        for(int i=0;i<encoded.length();i+=6){
//
//
//
//        }

        return output;

    }

    public static void main(String[] args) {

        List<String> codes = new ArrayList<String>();

        codes.add("a 100100");

        codes.add("b 100101");

        codes.add("c 110001");

        codes.add("d 100000");

        codes.add("[newline] 111111");

        codes.add("p 111110");

        codes.add("q 000001");

        String encoded = "111110000001100100111111100101110001111110";

        System.out.println(decode(codes,encoded));

    }

}