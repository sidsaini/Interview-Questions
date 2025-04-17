package com.siddharth.array;

import java.util.Scanner;

public class PrimeNumber1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();




        for (int i = 1; i <= n; i++) {

            boolean isPrime = true;

                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            if (isPrime) {
                System.out.println(i + " is a prime number");
            }
            }
        }


    }

