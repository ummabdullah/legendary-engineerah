package com.hackerrank.day6;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
// enter following at STD IN:
    	/*2
    	Hacker
    	Rank*/
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String text = scanner.nextLine();
        String left = ""; 
        String right ="";
        for (int j = 0; j<n; j++)
        {   text = scanner.nextLine();
            for (int i = 0; i< text.length() ; i++)
                {   if (i%2==0)
                        left = left + text.charAt(i);
                    else
                        right = right + text.charAt(i);
                }
         
                System.out.println(left+ " " + right);
            left = "";
            right = "";
        }
        

  
    scanner.close();

    }
}
