package Algorithms.Sorting;/*
 * https://www.hackerrank.com/challenges/big-sorting/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class BigSorting
{
	  public static String[] bigSorting(String[] unsorted)
    {
      Arrays.sort(unsorted, (x, y) -> x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));
      return unsorted;
    }
}
