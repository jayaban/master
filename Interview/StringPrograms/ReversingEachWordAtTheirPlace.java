package Interview.StringPrograms;

public class ReversingEachWordAtTheirPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="QA Automtion Course";  
		
		String[] words = str.split(" "); //split the sebtence and store it in a STring array
		 
		StringBuilder result = new StringBuilder(); //use stringbuilder as it is mutable to store final result
		
		for(String word: words)      //use for each loop for traverse through array
		{ 
			
			String rev = new StringBuilder(word).reverse().toString();   // in string store reversed word
			result.append(rev).append(" ");   //append the reverse word and space to the given result
		}
		
System.out.println(result.toString().trim()); //convert to tring and ttrim space from sides
	}

}
