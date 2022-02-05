package com.company;

import java.util.HashMap;
import java.util.Map;

public class ContinueSubArraySum {
    public static void main(String[] args) {


            int []arr={23,2,6,4,7};
            System.out.println(checkSubarraySum(arr,5));
    }


    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int key = sum % k;
            if (map.containsKey(key)) {
                if (i-map.get(key)>1) {
                    return true;
                }
            } else {
                map.put(key, i);
            }
        }
        return false;
    }
}
