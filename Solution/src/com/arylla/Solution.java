package com.arylla;
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



class Result {

    /*
     * Complete the 'largestMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

	public static int largestMatrix(List<List<Integer>> arr) {
	    int index = 0;
	    List<Integer> row1 = arr.get(index); 
	    index++;
	    int i = row1.size();
	    System.out.println("i:"+ i);
	    List<Integer> row2 = arr.get(index);
	    index++;
	    int j = row2.size();
	   
	    List<Integer> currentRow ;
	    //Find the maximum ones in each row, then try to find a match max in the coloumn with same indexes matrix
	    // Else restart with lesser count.
	    
	    int size = 0;
	    int maxCounter = 0;
	    for(int x=0; x<i-1;x++)
	    {	currentRow= arr.get(index+x);
	    	int currentElement = 0;
	    	int counter1= 0;
	    	int beginIndexMatrix=0;
	    	int endIndexMatrix=0;
	    	for (int y=0; y<j-1; y++ )
	    	{	currentElement=currentRow.get(y);
	    		if (currentElement == 1)
	    		{	counter1++;
	    			endIndexMatrix= y;
	    			if (counter1>maxCounter)
	    			{	maxCounter = counter1;
	    			}
	    		}
	    		else
	    		{	counter1=0;
	    			beginIndexMatrix=y+1;
	    		}
	    		
	    	}
	    			
	    	}
	    	
	    	
	    	
	    	
	   

	    return maxCounter;
	    }

	}

	public class Solution {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int arrRows = Integer.parseInt(bufferedReader.readLine().trim());
	        int arrColumns = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<Integer>> arr = new ArrayList<>();

	        IntStream.range(0, arrRows).forEach(i -> {
	            try {
	                arr.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .map(Integer::parseInt)
	                        .collect(toList())
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        int result = Result.largestMatrix(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
