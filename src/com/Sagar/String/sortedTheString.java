package com.Sagar.String;

import java.util.List;
import java.util.stream.Collectors;

public class sortedTheString
{
    public static void main(String[] args) {
        String str = "sagar";
        List<String> collect = str.chars().mapToObj((c) ->(char) c).sorted((x,y)->y-x).map(String::valueOf).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("hello");
    }
}
