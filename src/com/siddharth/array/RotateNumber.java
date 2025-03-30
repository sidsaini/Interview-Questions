package com.siddharth.array;

public class RotateNumber {
    public static void main(String[] args) {

        int number = 12345;

        int reminder = 0, reverseNUmber = 0;

        while (number != 0)
        {
            reminder = number % 10;

            reverseNUmber = reverseNUmber * 10 + reminder;

            number = number / 10;
        }

        System.out.println(reverseNUmber);
    }
}
