
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
//import static ch.lambdaj.Lambda.selectDistinct;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {0,1,28,839,2,2,2,3,4,4,2,4,1,0,-8,389,-38};
		
		removeDupInIntArray(arr);
		
		//List<Integer> numbers =  Arrays.asList(1,3,4,2,1,5,6,8,8,3,4,5,13);
	}
	
	public static void removeDupInIntArray(int[] ints){
	    Set<Integer> setString = new LinkedHashSet<Integer>();
	    for(int i=0;i<ints.length;i++){
	    	if (ints[i]>=0)
	    		setString.add(ints[i]);
	    }
	    System.out.println(setString);
	}
	
	

	/*
	 * public static void removeDupInIntArrayLambda(List<Integer> num){
	 * 
	 * System.out.println("List with duplicates: " + num);
	 * System.out.println("List without duplicates: " + selectDistinct(num)); } }
	 */

}


