package com.company;

//Ceiling of the Number
public class SmallestNoLargerThanTarget {
    public static void main(String[] args) {
        int []a={1,4,6,8,10};
        System.out.println(search(a,34));

    }

    public static int search(int []arr,int target)
    {
//        int i=0;
//        int j=arr.length-1;
//        if(target<arr[i])
//            return arr[i];
//        if(target>arr[j])
//            return -1;
//        while(i<=j)
//        {
//            int mid=i+(j-i)/2;
//            if(target==arr[mid])
//            {
//                return arr[mid];
//            }
//            else if(target>arr[mid])
//            {
//                if(mid+1<=j && target<arr[mid+1])
//                    return arr[mid+1];
//                    i=mid+1;
//            }
//            else
//            {
//                if(mid-1>=i && target>arr[mid-1])
//                    return arr[mid];
//                j=mid-1;
//            }
//        }
//
//        return -1;
        int i=0;
        int j=arr.length-1;
        if(target<arr[i])
            return arr[i];
        if(target>arr[j])
            return -1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(target==arr[mid])
            {
                return arr[mid];
            }
            else if(target>arr[mid])
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }


        }

        return arr[i];
    }
}
