package Algorithms.Strings;/*
* https://www.hackerrank.com/challenges/caesar-cipher-1/problem 
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher 
{
	public static String caesarCipher(String s, int k)
	{
      StringBuilder cipherText  = new StringBuilder();
      char q=' ';
      int j=0;
      for(int i = 0;i<s.length() ; i++)
      {
          q= s.charAt(i);
          if(!Character.isLetter(q))
          {
              j=k;
          }
          while(j<k)
          {
              if(q=='z') {
                  q='a';
                  q--;
              }
              if(q=='Z') {
                  q='A';
                  q--;
              }    
              q++;
              j++;
          }
          cipherText.append(q);
          j=0;
      }
      return cipherText.toString();
	}

}
