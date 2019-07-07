package core;

import java.util.LinkedHashSet;
//import static ch.lambdaj.Lambda.selectDistinct;

public class Solution {

	public static void main(String[] args) {
		Integer[] arr = {0,1,28,839,2,2,2,3,4,4,2,4,1,0,-8,389,-38};
		
		removeDupInIntArray(arr);		
		//List<Integer> numbers =  Arrays.asList(1,3,4,2,1,5,6,8,8,3,4,5,13);
	}
	
	public static Integer[] removeDupInIntArray(Integer[] ints){
	    LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
	    for(int i=0;i<ints.length;i++){
	    	if (ints[i]>0)
	    		hashSet.add(ints[i]);
	    }
	    System.out.println(hashSet);
	    Integer[] intArray = (hashSet.toArray(new Integer[hashSet.size()]));
	    return intArray;
	    
	}
	
	

	/*
	 * public static void removeDupInIntArrayLambda(List<Integer> num){
	 * 
	 * System.out.println("List with duplicates: " + num);
	 * System.out.println("List without duplicates: " + selectDistinct(num)); } }
	 */

}


