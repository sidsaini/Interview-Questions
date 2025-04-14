package com.siddharth.array;

public class StringBuilderAndStringBufferPerformance {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 100000; i++)
        {
            sb.append("a");
        }

        long endTime = System.nanoTime();
        long durationTime = endTime - startTime;

        System.out.println(" StringBuffer : "+durationTime+" ");

        long startTime1 = System.nanoTime();

        StringBuilder sbb = new StringBuilder();

        for (int i = 0; i < 100000; i++)
        {
            sbb.append("a");
        }

        long endTime1 = System.nanoTime();
        long durationTime1 = endTime1 - startTime1;

        System.out.println(" StringBuilder : "+durationTime1+" ");
    }
}
