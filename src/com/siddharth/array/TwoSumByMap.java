package com.siddharth.array;


import java.util.HashMap;

public class TwoSumByMap {
    public static void main(String[] args) {

        int[] arr = {10,12,10,15,-1,7,6,4,2,1};
        int target = 11;

        int[] ans = {-1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            int partner = target - arr[i];

            if (map.containsKey(partner))
            {
                ans = new int[]{i, map.get(partner)};
                break;
            }
            else
            {
                map.put(arr[i], i);
            }
        }

        for (var num : ans)
        {
            System.out.print(num +" ");
        }
    }
}
