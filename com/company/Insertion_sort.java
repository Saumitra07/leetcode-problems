package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;
import java.util.Scanner;

public class Insertion_sort {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int []a=new int[50000];
        Random random=new Random();
        for(int i=0;i<50000;i++)
        {
            a[i]=random.nextInt(40);
        }

        //Insertion sort
        int key,i;

        for(int j=1;j<50000;j++)
        {
            key=a[j];
            i=j-1;
            while(i>0 && a[i]>key)
            {
                a[i+1]=a[i];
                i--;
            }
            a[i+1]=key;

        }

        for(int k=0;k<50000;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
