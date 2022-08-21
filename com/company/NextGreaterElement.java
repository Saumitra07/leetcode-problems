package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

      int[] arr1={4,1,2};
      int []arr2={1,3,4,2};


      // O(n*m) solution
     // System.out.println(Arrays.toString(nextElement(arr1,arr2)));

      // O(n+m) solution using monotonic stack


        System.out.println(Arrays.toString(nextElementUsingStack(arr1,arr2)));
    }

    public static int[] nextElementUsingStack(int []nums1,int []nums2)
    {
        int []ans=new int[nums1.length];

        for(int i=0;i<ans.length;i++)
        {
            ans[i]=-1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],i);
        }

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums2.length;i++)
        {

                while(!st.isEmpty() && st.peek()<nums2[i])
                {

                    int val=st.pop();
                    ans[map.get(val)]=nums2[i];
                }

                if(map.containsKey(nums2[i]))
                    st.push(nums2[i]);


        }

        return ans;
    }


    public static int[] nextElement(int []nums1,int []nums2)
    {
        int []ans=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],i);
        }


        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey((nums2[i])))
            {

                int nextMax=-1;
                for(int j=i+1;j<nums2.length;j++)
                {
                    if(nums2[j]>nums2[i])
                    {
                        nextMax=nums2[j];
                        break;
                    }
                }

                if(nextMax==-1)
                {
                        ans[map.get(nums2[i])]=-1;
                }
                else
                {
                    ans[map.get(nums2[i])]=nextMax;
                }
            }
        }


        return ans;
    }


}
