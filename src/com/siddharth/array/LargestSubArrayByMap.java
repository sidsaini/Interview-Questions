package com.siddharth.array;

import java.util.HashMap;

public class LargestSubArrayByMap {
    public static int zeroSumLargestSubArray(int[] arr, int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLength = 0, prefix = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++)
        {
            prefix += arr[i];

            if (map.containsKey(prefix))
            {
                maxLength = Math.max(maxLength, i - map.get(prefix));
            }
            else
            {
                map.put(prefix, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10};
        int n = 7;
        int zeroSubArray = zeroSumLargestSubArray(arr, n);

        System.out.println(zeroSubArray);

    }
}
