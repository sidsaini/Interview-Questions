package com.siddharth.array;

import java.util.HashMap;

public class FrequencyMap {
    public static void main(String[] args) {

        int[] arr = {1,2,4,1,2,5,7,3,2,9,8};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            int ch = arr[i];

            if (!map.containsKey(ch))
            {
                map.put(ch, 1);
            }
            else
            {
                map.put(ch, map.get(ch)+1);
            }
        }

        for (var e : map.entrySet())
        {
            System.out.println(e);
        }
    }
}
