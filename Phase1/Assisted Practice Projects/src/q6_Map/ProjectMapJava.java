package q6_Map;

import java.util.*;

public class ProjectMapJava {

	private static Integer put;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> sk = new HashMap<Integer,String>();
		sk.put(1, "Sai");
		sk.put(2, "Krishna");
		sk.put(3, "Sk");
		System.out.println("\nThe Elements of Hashmap are");
		for(Map.Entry m:sk.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		
		//Hash Table
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Johny");  
	      ht.put(5,"John");  
	      ht.put(6,"King");  
	      ht.put(7,"Queen");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	     //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Anil");    
	      map.put(9,"Charan");    
	      map.put(10,"Kishore");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    

		
	}

}
