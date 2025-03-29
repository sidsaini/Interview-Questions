package com.practice;


import java.util.*;
import java.util.stream.Collectors;

public class Try {
   public static boolean isIsomorphic(String str, String gtr)
   {
      HashMap<Character, Character> map = new HashMap<>();

      for (int i = 0; i < str.length(); i++)
      {
         char sCh = str.charAt(i);
         char tCh = gtr.charAt(i);

         if (map.containsKey(sCh))
         {
            if (map.get(sCh) != tCh) return false;
         }
         else if (map.containsValue(tCh))
         {
            return false;
         }
         else
         {
            map.put(sCh, tCh);
         }
      }
      return true;
   }
   public static void main(String[] args) {
      String str = "add";
      String gtr = "etg";

      boolean isomorphic = isIsomorphic(str, gtr);

      System.out.println(isomorphic);
   }
}




