package com.company.Assessments;

import java.util.ArrayList;

public class UniQueArraySum {
    public static void main(String[] args) {
        
        int[] A=new int[]{1,4,4,5,6,7};
        int sum = 0;

 ArrayList< Integer > arrayList = new ArrayList < Integer > (A.length);

 arrayList.add(A[0]);


 for (int i = 1; i < A.length; i++) {

  int val = A[i];

  while (arrayList.contains(val)) {

   val++;
  }

  arrayList.add(val);

 }



 for (int i = 0; i < arrayList.size(); i++) {
  sum += arrayList.get(i);
 }

        System.out.println(sum);
    
    }
    }
