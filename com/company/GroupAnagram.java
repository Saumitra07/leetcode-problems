package com.company;

import java.util.*;


public class GroupAnagram {
    public static void main(String[] args) {
        String []arr={"eat","tea","tan","ate","nat","bat"};
       // String []arr={"",""};
        System.out.println(groupAnagrams(arr));
    }
    //brute force solution
//    public static List<List<String>> groupAnagrams(String[] strs) {
//
//
//        List<List<String>> result=new ArrayList<>();
//        if(strs.length==1)
//        {
//            List<String> res=new ArrayList<>();
//            res.add(strs[0]);
//            result.add(res);
//            return result;
//        }
//
//        HashSet<String> map=new HashSet<>();
//
//        for(int i=0;i<strs.length;i++)
//        {
//            if(!map.contains(strs[i]))
//            {
//                map.add(strs[i]);
//            }
//            else
//            {
//                continue;
//            }
//
//            ArrayList<String> res1=new ArrayList<>();
//            for(int j=i+1;j<strs.length;j++)
//            {
//                if(strs[i].length()!=strs[j].length())
//                {
//                    continue;
//                }
//                if(strs[i].equals(strs[j]))
//                {
//                    if(res1.contains(strs[i]))
//                    {
//                        res1.add(strs[i]);
//                    }
//                    else
//                    {
//                        res1.add(strs[i]);
//                        res1.add(strs[j]);
//                    }
//
//                    map.add(strs[i]);
//                }
//
//                else if(isAnagram(strs[i],strs[j]))
//                {
//                    if(!res1.contains(strs[i]))
//                    {
//                        res1.add(strs[i]);
//                    }
//                    res1.add(strs[j]);
//                    map.add(strs[i]);
//                    map.add(strs[j]);
//                }
//            }
//            if(res1.size()==0)
//            {
//                res1.add(strs[i]);
//            }
//
//            result.add(res1);
//        }
//        // System.out.println(map.toString());
//        return result;
//
//    }
//
//    public  static boolean isAnagram(String a, String b)
//    {
//        int []arr=new int[26];
//        for(int i=0;i<a.length();i++)
//        {
//            arr[a.charAt(i)-'a']++;
//        }
//        for(int i=0;i<b.length();i++)
//        {
//            arr[b.charAt(i)-'a']--;
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]!=0)
//                return false;
//        }
//        return true;
//
//    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            System.out.println(Arrays.toString(ca));
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }


/*


//Sorting nlogn solution
 public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
*/










}




