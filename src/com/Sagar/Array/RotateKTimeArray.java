package com.Sagar.Array;
//Input= int []array = {1,2,3,4,5};
//Output = int []array = {5,4,3,1,2};
public class RotateKTimeArray
{
    public static int[]rotateArray(int[]array,int k)
    {
        int n = array.length;
      k= k %n;
      int j=0;
      int [] ans = new int[n];
        for (int i = n-k; i <n ; i++) {
            ans[j++]=array[i];

        }
        for (int i = 0; i <=n-k-1 ; i++) {
            ans[j++]=array[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        int []array = {1,2,3,4,5};

        int[] ints = rotateArray(array, 3);
        for (var x: ints)
        {
            System.out.println(x);
        }

    }
}
