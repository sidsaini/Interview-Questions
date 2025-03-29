package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Siddharth", 956445L, 12));
        list.add(new Employee("Yogesh", 897650L, 10));
        list.add(new Employee("Subham", 789645L, 2));
        list.add(new Employee("Sandeep", 654789L, 23));
        list.add(new Employee("Shiva", 546378L, 5));
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
