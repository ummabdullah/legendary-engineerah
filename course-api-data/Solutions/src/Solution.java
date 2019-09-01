
	
	//import java.lang.Math; // headers MUST be above the first class
	import java.util.HashMap;
	// one class needs to have a main() method
	public class Solution
	{	static HashMap<Character, String> hmap = new HashMap<Character, String>();
    	 // arguments are passed using the text field below this editor
	  public static void main(String[] args)
	  {
	    
	    //(a,b), (b,c), (c,d), (c,e), (d,e), (e,j)
		  // {"a": [b], "b": [c], "c" => ["d", "e"], "e" => "j"}
		  
	   HashMap m = new HashMap();
	 /*  m.put("a", new List<char> { "b" });
	   m.put("b", new String[] { "c" });
	   m.put("c", new String[] { "d", "e" });
		*/  	    
	   
	   putVal('a',"b");
	    putVal('b',"c");
	    putVal('c',"d");
	  putVal('c',"e");
	    putVal('d',"e");
	    putVal('e',"j");
	    
	    
	   printCurrentMap();
	  System.out.print("Answer " + havePath('a','c'));
	    
	    
	  }
	  public static void putVal(char k, String val) {
		  if (hmap.containsKey(k))
		    	hmap.put(k, hmap.get(k)+val);
		    else
		    	hmap.put(k, val);
	  }
	  
	  public static void printCurrentMap()
	  {System.out.println(hmap.toString());}
	  
	  public static boolean havePath(char fromK, char toV)
	  {	  boolean answer = false;
	  		
	  		if ((hmap.containsKey((Object)fromK))&& (hmap.get((Object)fromK) == (Object)toV))
	  		{	answer = true; 
	  		}
	  		else if (hmap.containsKey((Object)fromK))
	  		{		String newfromK = hmap.get(fromK);
	  				System.out.println(newfromK);
	  				boolean pathfound = false;
	  				for (int i = 0; i<newfromK.length(); i++)
	  				{	pathfound = ( pathfound || havePath(newfromK.charAt(i), toV));
	  					System.out.println(pathfound);
	  				}
	  				answer = pathfound;
	  			
	  		}
		  
		  return answer;
	  }
	  
	  
	}


