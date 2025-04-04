package com.Sagar.Array;

import java.util.Arrays;

public class SumOfArray
{
    public static void main(String[] args) {
        int[]array ={2,3,5,2,3,4};

        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
    }

}
