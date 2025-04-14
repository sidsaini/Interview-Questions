package com.siddharth.array;

public class ZeroArray {
    public static void main(String[] args) {

        int[] arr = {1,0,2,0,4,6,3,7};

        int i = 0; int j = arr.length-1;

        while (i < j)
        {
            if (arr[i]==0 && arr[j] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if (arr[i] != 0)
            {
                i++;
            }
        }

        for (var e : arr)
        {
            System.out.print(e+" ");
        }
    }
}
