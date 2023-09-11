package com.company.Strings;

import java.util.Stack;

class SimplifyPath{
    public static void main(String[] args) {

        System.out.println(simplifyPath("../home/.."));
        
    }
    public static String simplifyPath(String path) {

        Stack<String> st=new Stack<>();
         if(path.length()==0)
         {
             return "/";
         }
        String[] arr=path.split("/");
 
   //     System.out.print(Arrays.toString(arr)+" "+arr.length+".. "+arr[1]);
 
         for(int i=1;i<arr.length;i++)
         {
             
              if(arr[i].equals(".."))
             {
                     if(!st.isEmpty())
                     {
                         st.pop();
                     }
             }
             else if(arr[i].equals(".") || arr[i].equals(""))
             {
                 continue;
             }
             
             else {
                 st.push(arr[i]);
 
             }
         }
        StringBuilder sb=new StringBuilder("");
 
        
        for(String str:st)
        {
         //   StringBuilder newStr=new StringBuilder(st.pop());
         //   newStr.reverse();
         //    sb.append(newStr);
         //    sb.append("/");
              sb.append("/");
              sb.append(str);
           
           
        }
        
         if(sb.length()==0)
             sb.append("/");
     //    return sb.reverse().toString();
         return sb.toString();
     }
}