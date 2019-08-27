package Algorithms.Implementation;

/*
* https://www.hackerrank.com/challenges/apple-and-orange/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppleandOrange 
{
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) 
	{
		int count = 0;
		for(int i=0;i<apples.length;i++)
        {
            int sayi=a+apples[i];
            if(sayi>=s && sayi<=t)
            {
            	count++;
            }
        }
		
        System.out.println(count);
        count = 0;
        
        for(int i=0;i<oranges.length;i++)
        {
            int sayi2=b+oranges[i];
            if(sayi2>=s && sayi2<=t)
            {
            	count++;
            }
        }
        
        System.out.println(count);
    }
}
