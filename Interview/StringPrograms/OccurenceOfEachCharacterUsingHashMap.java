package Interview.StringPrograms;

import java.util.HashMap;
import java.util.Map;

;

public class OccurenceOfEachCharacterUsingHashMap {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloJaya";
		
		 
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		 for(Character ch : s.toCharArray())
		 {
			// int value=1;
			 if(!map.containsKey(ch)) { //we will only store the key (ch) and value (count) when the key does not exists already
		 map.put(ch, 1);  //putting values in map in key value pair
			 } else
			 {
			int value=	 map.get(ch);// we are getting the value of defined key in the varaiable
				 map.put(ch,value+1); // duplicate value will be increased by 1
			 }
			 
		 }
		 System.out.println(map);
	}

}
