package com.hackerrank.day10.binarynumbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	int max = getConsecutiveOnes(n);
        System.out.println( max);
        scanner.close();
    }
        
    public static int getConsecutiveOnes(int n)
    {
    	String b=  Integer.toBinaryString(n);
        //System.out.println("Binary is " + b);
        int count = 0;
        int max = 0;
        boolean previous = false;
        String current = "";
        if (Integer.bitCount(n)>0)
        {	
	        for (int i = 0; i < b.length(); i++)
	        { 	current = ""+ b.charAt(i);
	        	if (current.equals("1"))
	        	{
	        		//System.out.println("current bit 1");
	        		count ++;
	        		max = Math.max(max,count);
	        		
	        		previous = true;
	        	}
	        	else
	        	{	//System.out.println("current bit 0");
	        		previous = false;
	        		count = 0;
	        	
	        	}
	        	
	        }
        }
        
        return max;
    }
}
