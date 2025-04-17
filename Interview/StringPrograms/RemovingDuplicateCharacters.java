package Interview.StringPrograms;

public class RemovingDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "programmminng";
String result ="";

for(int i =0;i<=str.length()-1;i++)
{
	if(!result.contains(String.valueOf(str.charAt(i))))
	{
		result+=str.charAt(i);
	}
}
System.out.println(result);
	}

}
