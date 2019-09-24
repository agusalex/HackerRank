package Algorithms.Implementation;

/*
* https://www.hackerrank.com/challenges/bon-appetit/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BonAppétit
{
	public static int bonAppetit(List<Integer> bill, int k, int b)
	{
	    int[] ar = {};
	    int n=0;
		int toplam=0;
        for(int i=0;i<n;i++)
        {
            if(i==k) continue;
            else
            {
                toplam+=ar[i];
            }
        }

        toplam=toplam/2;

        if(toplam!=b)
        {
            System.out.println(Math.abs(toplam-b));
        }
        else
        {
            System.out.println("Bon Appetit");
        }
        return 0;
    }
}
