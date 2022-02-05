package com.company;

import java.util.*;

public class HeapSort {
    public static void main(String[] args) {

     //   int[] arr={-99,10,100,70,50,40};

       int []arr1=new int[500000];
        Random random=new Random();
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=random.nextInt(500);
        }

        //System.out.println(arr1[0]+" "+ arr1[6]);

      Vector<Integer> v=heapsort(arr1);

        System.out.println(v.toString());

    }

    public static Vector<Integer> heapsort(int[] arr)
    {

        Vector<Integer> v=new Vector<Integer>();

        v=insert(arr,v);
        v=remove(v);
        return v;
    }
    public static Vector<Integer> insert(int arr[],Vector<Integer> v)
    {
        int j;
        //Vector<Integer> v= new Vector<>();

        for(int i=0;i<arr.length;i++)
        {
            v.add((arr[i]));
            j=v.size()-1;

            while(j>0 && v.get(j)<v.get(j/2))
            {
                int temp=v.get(j);
                v.set(j,v.get(j/2));
                v.set(j/2,temp);
                j=j/2;
            }
        }

        System.out.println("inserted"+v.toString());
        return v;
    }
    public static Vector<Integer> remove(Vector<Integer> v)
    {

        int flag;
        Vector<Integer> res=new Vector<>();
        int left,right;
        int n=v.size();
        for(int i=0;i<n;i++)
        {
            flag=0;

            int temp=v.get(0);
            v.set(0,v.get(v.size()-1));
            v.remove(v.size()-1);
            int j=0;

            while(j<=v.size()-1)
            {
                /*if(j==0)
                {
                    left=2*j+1;
                    right=2*j+2;
                }
                else
                {
                    left=2*j;
                    right=2*j+1;
                }*/
                left=2*j+1;
                right=2*j+2;

                if(right<=v.size()-1)
                {
                    if(v.get(j)<=v.get(left) && v.get(j)<=v.get(right))

                    {
                        res.add(temp);
                        flag=1;           ///alert!!!!
                            break;
                    }
                    else
                    {
                        int k=0;
                        if(v.get(left)<=v.get(right))
                        {

                            k=left;
                        }
                        else
                        {
                            k=right;
                        }

                        int temp1=v.get(j);
                        v.set(j,v.get(k));
                        v.set(k,temp1);
                        j=k;



                    }

                }

                else
                {
                    if (left<=v.size()-1)
                    {
                        if(v.get(j)>v.get(left))
                        {
                            int temp1=v.get(j);
                            v.set(j,v.get(left));
                            v.set(left,temp1);

                        }
                    }
                    res.add(temp);
                    flag=1;
                    break;
                }


                //j++;
            }
            if(flag!=1)
            {
                res.add(temp);
            }

        }


        return res;
    }

}
