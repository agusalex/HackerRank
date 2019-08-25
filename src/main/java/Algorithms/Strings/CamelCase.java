package Algorithms.Strings;/*
 * https://www.hackerrank.com/challenges/camelcase/problem
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CamelCase 
{
    public static int camelCase(String s)
    {
    	int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i))) count++;
        }
        return count+1;
    }


}
