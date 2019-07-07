package com.array;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] input = { 15, 10, 3, 2,5,6,11};

		int result2 = NthSmallest(input,3);
		System.out.println( "Index 3:" +result2);
		
	}
	
/*	public static int[] min(int[] arr) {
		
		int[] min= { arr[0],arr[1] };
		for (int current: arr)
		{ if (min[0]>current)
			{	min[1]=min[0];
				min[0]=current;
			}
		else if (min[1]>current)
		{
			min[1]=current;
		}
		}
		
		return min;
		
	}*/
	
	public static int NthSmallest(int[] arr,int m) {
		int start = 0;
		int end = arr.length-2;
		int index = 0;
		int[] newArray = new int[arr.length-1];
		for (int i=1;i<arr.length; i++) {
			if(arr[i]<arr[index]) {
				newArray[start]=arr[i];
				start++;
			} else {
				newArray[end]=arr[i];
				end--;
			}
		}
		System.out.println(Arrays.toString(newArray));
		if(m>start) {
			return NthSmallest(Arrays.copyOfRange(newArray, start+1, newArray.length), m-start);
		}	
		else if(m< start) {
			return NthSmallest(Arrays.copyOfRange(newArray,0,start),m);
		}
		else {
			return arr[start];
		}
		
		}
		}
	
	
