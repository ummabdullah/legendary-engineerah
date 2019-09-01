
public class ReverseIntSolution {
	
	public static void main(String[] args)
	  {	System.out.println("Current: 1234, Reversed: " + getReverseInt(1234));
	  System.out.println("Current: 5489, Reversed: " + getReverseInt(5489));

	  }
	
	public static int getReverseInt(int value) {
	    int resultNumber = 0;
	    for (int i = value; i !=0; i /= 10) {
	        resultNumber = (resultNumber * 10) + (i % 10);
	    }
	    return resultNumber;        
	}
	
	
	
}

