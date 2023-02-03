package com.company.Strings;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static  boolean isPalindrome(String s) {

//         StringBuffer sb=new StringBuffer(s.toLowerCase());

//         for(int i=0;i<sb.length();i++)
//         {
//             if(!Character.isDigit(sb.charAt(i)) && !Character.isLetter(sb.charAt(i)))
//             {
//                 sb.delete(i,i+1);
//             }
//         }

//         System.out.println(sb);
//         return true;
        StringBuffer sb=new StringBuffer(s.toLowerCase());
        int i=0;
        int j=s.length()-1;

        while(i<=j)
        {
            if(!Character.isDigit(sb.charAt(i)) && !Character.isLetter(sb.charAt(i)))
            {
                i++;
            }

            if(!Character.isDigit(sb.charAt(j)) && !Character.isLetter(sb.charAt(j)))
            {
                j--;
            }
            if(sb.charAt(i)!=sb.charAt(j))
            {
                System.out.println(i+"....."+j);
                return false;
            }


            i++;
            j--;
        }


        return true;
    }
}
