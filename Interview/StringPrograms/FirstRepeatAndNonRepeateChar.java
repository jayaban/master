package Interview.StringPrograms;

import java.util.HashMap;

public class FirstRepeatAndNonRepeateChar {

	public static void repeatAndNonRepeate(String inputString)
	{
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		
		
		for(char ch: inputString.toCharArray()) //adding values to hashmap along with their key values
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}else
			{
				int val = map.get(ch);
				map.put(ch, val+1);
			}
		
		}
		
		for(char ch:inputString.toCharArray())
		{
			if(map.get(ch)==1)
				{System.out.println("first non repeating character is"+ch);
			    break;}
			}
		for(char ch:inputString.toCharArray())
		{
			 if(map.get(ch)>1)
			{
				 
				System.out.println("first  repeating character is"+ch);
				break;
			}
				
				
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s =" helloo you arewelcome";
String s1 = s.replace(" ", "");  //else spaces will be counted as characters

repeatAndNonRepeate(s1);
	}

}
