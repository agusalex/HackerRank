package Algorithms.Sorting;/*
 * https://www.hackerrank.com/challenges/find-the-median/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindTheMedian
{
    static int findMedian(int[] arr) 
    {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

}
