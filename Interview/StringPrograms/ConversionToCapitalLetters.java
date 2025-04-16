package Interview.StringPrograms;

public class ConversionToCapitalLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bhtytre";
		char[] ch = s.toCharArray(); //convert into char array for counting
		
		for(int i=0;i<= ch.length-1;i++) //looping through array
		{
			if(ch[i]>='a'&&ch[i]<='z') //if character at i is in between a -z inclusive
			{
				ch[i]= (char)(ch[i]-32);  // typecaast and assign  the capital letter  of corresponding capital letter 
			}//by minusing 32 from ASCII value of small letter
			
		}
		System.out.println("Coverted string is"+String.valueOf(ch)); //String.valueof() will give value of each character 

	}

}
