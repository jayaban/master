package Interview.StringPrograms;

public class OccurenceOfEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "Hi Jaya How Are You";
int count=1;    
for(int i=0;i<=s1.length()-1;i++)
{
if((s1.charAt(i)==' ')&&(s1.charAt(i+1)!=' ')) //whenever a space is found and immediately after space there is a vleu then count is +1
{
	count++;
	
}
}
System.out.println(count);

	}

}
