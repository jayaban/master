package Interview.StringPrograms;

public class VowelConsonantCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="Java Programming";
String s = str.toLowerCase();

int vowel =0,consonant=0;

for(char word: s.toCharArray())
{
	if(Character.isLetter(word))
	{
		if("aeiou".indexOf(word)!=-1)
		{
			vowel++;
		}else
			consonant++;
	}

}
System.out.println("Vowels are "+ vowel);
System.out.println("Consonants are "+ consonant);
	}

}
