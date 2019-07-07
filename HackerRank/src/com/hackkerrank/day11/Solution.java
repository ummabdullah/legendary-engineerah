package com.hackkerrank.day11;

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
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum = 0;
        int max = -9*7; //since lowest of each value can be -9
        for (int r = 1;r< 5; r++){
            for (int c=1; c<5; c++){
                for (int c2 = -1; c2<2 ; c2++)
                    { //System.out.print((arr[r-1][c+c2])+" ");
                        sum+=(arr[r-1][c+c2]);
                    }
                    //System.out.println();
               // System.out.println(" " + arr[r][c]);
                 sum+=(arr[r][c]);
                for (int c2 = -1; c2<2 ; c2++)
                    {// System.out.print((arr[r+1][c+c2])+" ");
                     sum+=(arr[r+1][c+c2]);
                    }
                //System.out.println();
               max = Math.max(sum,max);
               sum=0;

            }
        }

        scanner.close();
        System.out.println(max);
    }
}
