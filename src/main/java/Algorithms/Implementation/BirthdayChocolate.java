package Algorithms.Implementation;

/*
* https://www.hackerrank.com/challenges/the-birthday-bar/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BirthdayChocolate
{
	static int birthday(List<Integer> s, int d, int m) 
	{
		    int toplam=0,sayac=0;
        int q=s.size()-1;
        if(s.size()==1) q=s.size();
        for(int i=0;i<q;i++)
        {
        	for(int j=i;j<=i+m-1;j++) 
	        {
        		if(i+m-1>q) 
        			break;
	            toplam+=s.get(j);
            }
        	
        	if(toplam==d) 
        		sayac++;
        	
        	toplam=0;
        }
        
        return sayac;
    }
}
