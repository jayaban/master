package Interview.StringPrograms;



public class FirstNonRepeatingSubstringOfLength2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="ABABAC";
int len=2; //given length of subs

//store all the substring in an array
String[] substring = new String[str.length()-len+1];   

//filling the array  with the substrings of given length
for(int i=0;i<=str.length()-len;i++)
{
	substring[i] =str.substring(i, i+len);
}

//finding first non repeating substring in the array
for(int i=0;i<=substring.length-1;i++)
{
	boolean isRepeating = false;
	
	for(int j =0;j<=substring.length-1;j++)
	{
		if(i!=j && substring[i].equals(substring[j]))
		{
			isRepeating = true;
			break;
		}
	}
if(!isRepeating)
{
	System.out.println("first Non Repeating Substring is "+substring[i]);
	return;
	}
}

System.out.println("No Non repeating substring is found");
	}

}
