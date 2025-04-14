package com.siddharth.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PatientMain {
    public static void main(String[] args) {
        ArrayList<Patient> list = new ArrayList();

        list.add(new Patient(1, "Anuj", 43, 'A'));
        list.add(new Patient(2, "Ram", 70, 'B'));
        list.add(new Patient(3, "Shyam", 30, 'A'));
        list.add(new Patient(4, "Ketan", 73, 'B'));
        list.add(new Patient(5, "Dinesh", 19, 'C'));


        List<String> collect = list.stream().filter(age -> age.getAge() > 50).map(Patient::getName).collect(Collectors.toList());

        System.out.println(collect);
    }
}
