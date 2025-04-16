package Interview.StringPrograms;

public class AllSubstringInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="JAYA";

for(int i=0;i<=str.length()-1;i++)
{
	for(int j =i+1;j<=str.length()-1;j++)
	{
		System.out.println("substrings are "+str.substring(i, j));
	}
		
}
	}

}
