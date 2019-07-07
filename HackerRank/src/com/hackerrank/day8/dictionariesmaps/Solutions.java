package com.hackerrank.day8.dictionariesmaps;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
         // Create a Map of String Keys to int Values, implemented by the HashMap class
        Map<String,String> myMap = new HashMap<String,String>(); 

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, ""+phone);    

        }
        while(in.hasNext()){
            String s = in.next();
            
            if (myMap.containsKey(s))
           { 
            System.out.println(s+"="+ myMap.get(s)); 
           }
           else 
                System.out.println("Not found"); 

        }
        in.close();
    }
}

