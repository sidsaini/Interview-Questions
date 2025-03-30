package com.Sagar.Array;

public class RotateKTimeWithoutCreatingExtraArray
{
    public static void rotateKTime(int[] array,int k )
    {
      int n = array.length;
      k=k%n;

        reverse(array,n-k,n-1);
        reverse(array,0,n-k-1);
        reverse(array,0,n-1);
    }
    public static void reverse(int[]array ,int start ,int end)
    {
        while (start<end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] array= {1,2,3,4,5,6,7};
        rotateKTime(array,5);
        for (var x: array)
        {
            System.out.println(x);
        }

    }
}
