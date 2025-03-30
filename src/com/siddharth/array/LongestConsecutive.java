package com.siddharth.array;

import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();

        int maxStreek = 0;

        for (int num : arr)
        {
            set.add(num);
        }

        for (int num : set)
        {
            if (!set.contains(num-1))
            {
                int currentNum = 1;
                int currentStreak = 1;

                while (set.contains(currentNum+1))
                {
                    currentStreak++;
                    currentNum++;
                }
                maxStreek = Math.max(maxStreek, currentStreak);
            }
        }
        return maxStreek;
    }
    public static void main(String[] args) {
        int[] arr = {99, 100, 1,4,3,200,2};

        int maxStreek = longestConsecutive(arr);

        System.out.println(maxStreek);

    }
}
