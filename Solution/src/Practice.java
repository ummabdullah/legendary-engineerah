
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = {4, 2, 3};
		int[] Array2 = {4, 2, 1};
		System.out.println("The value for numbers:"+ checkPossibility(Array));
		System.out.println("The value for numbers:"+ checkPossibility(Array2));
		

	}
	
	public static boolean checkPossibility(int[] nums) {
        int i=1;
        int counter=0;
        boolean result=true;
        while (i<nums.length)
        {   if (nums[i-1]>nums[i])
            {   nums[i-1]=nums[i]-1;
                counter++;
                 i++;
            }  
            else
            {   i++;
            }
            if (counter>1)
                {   return false;
                }
        }    
        return result; 
    }

}
