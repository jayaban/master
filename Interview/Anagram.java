package Interview;

import java.util.Arrays;

public class Anagram {

	public static boolean areAnagrams(String s1, String s2)
	{
		//check for length if it is equal
		if(s1.length()!=s2.length())
		{
			return false;
			
		}
		//convert to char arrays
		char[] ch1= s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "tomato";
String str2= "oomat";

System.out.println(areAnagrams(str1,str2));

	}

}
