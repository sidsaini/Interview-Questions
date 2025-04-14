package com.siddharth.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class SumOfArray {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        Integer i = Arrays.stream(arr).boxed().reduce(Integer::sum).get();

        System.out.println(i);
    }
}
