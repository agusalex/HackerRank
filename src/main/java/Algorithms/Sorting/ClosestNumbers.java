/*
 * https://www.hackerrank.com/challenges/closest-numbers/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class ClosestNumbers
{
    static String closestNumbers(int[] arr) 
    {
        Arrays.sort(arr);
        
        StringBuilder s = new StringBuilder("");

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length -1 ; i++)
        {
            if(min == (arr[i+1]-arr[i]))
                s.append(arr[i] + " " + arr[i+1] + " ");
            
            if(arr[i+1] - arr[i] < min)
            {
                min = arr[i+1] - arr[i];
                s.setLength(0);
                s.append(arr[i] + " " + arr[i+1] + " ");
            }
        }
    
        return s.toString();
    }
}
