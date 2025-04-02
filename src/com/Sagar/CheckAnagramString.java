package com.Sagar;

import java.util.Arrays;

public class CheckAnagramString
{
    public static void main(String[] args) {
        String str ="silent";
        String gtr="listen";

        if(isAnagram(str,gtr))
        {
            System.out.println("The string is Anagram");
        }else
        {
            System.out.println("The string is not Anagram");
        }

    }
    public static boolean isAnagram(String string ,String string1)
    {
        if (string1.length()!=string1.length())
        {
            return false;
        }

        char[] charArray = string.toCharArray();
        char[] charArray1 = string1.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray1);


        return Arrays.equals(charArray,charArray1);
    }

}

